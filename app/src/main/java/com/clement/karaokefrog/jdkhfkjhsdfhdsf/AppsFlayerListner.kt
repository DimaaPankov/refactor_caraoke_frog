package com.clement.karaokefrog.jdkhfkjhsdfhdsf

import android.util.Log
import com.appsflyer.AppsFlyerConversionListener

import java.net.URLEncoder


object AppsFlayerListner : AppsFlyerConversionListener {

     var dkfjklsdjfkldsjf = false

    var kldjzkldjfsd = {}

    var adset: String? = null
    var af_adset: String? = null
    var adgroup: String? = null
    var campaign_id: String? = null
    var af_status: String? = null
    var agency: String? = null
    var af_sub3: String? = null
    var af_siteid: String? = null
    var adset_id: String? = null
    var is_fb: String? = null
    var is_first_launch: String? = null
    var click_time: String? = null
    var iscache: String? = null
    var ad_id: String? = null
    var af_sub1: String? = null
    var campaign: String? = null
    var is_paid: String? = null
    var af_sub4: String? = null
    var adgroup_id: String? = null
    var is_mobile_data_terms_signed: String? = null
    var af_channel: String? = null
    var af_sub5: String? = null
    var media_source: String? = null
    var install_time: String? = null
    var af_sub2: String? = null
    var af_message: String? = null




    override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {

        Log.d("appsFlayerData", data.toString())



        adset = URLEncoder.encode((data?.get("adset") ?: "null").toString(), "utf-8")
        af_adset = URLEncoder.encode((data?.get("af_adset") ?: adset).toString(), "utf-8")
        adgroup = URLEncoder.encode((data?.get("adgroup") ?: "null").toString(), "utf-8")
        campaign_id = data?.get("campaign_id")?.let { URLEncoder.encode(it.toString(), "utf-8") }
        af_status = URLEncoder.encode((data?.get("af_status") ?: "null").toString(), "utf-8")
        agency = URLEncoder.encode((data?.get("agency") ?: "null").toString(), "utf-8")
        af_sub3 = URLEncoder.encode((data?.get("af_sub3") ?: "null").toString(), "utf-8")
        af_siteid = URLEncoder.encode((data?.get("af_siteid") ?: "null").toString(), "utf-8")
        adset_id = URLEncoder.encode((data?.get("adset_id") ?: "null").toString(), "utf-8")
        is_fb = URLEncoder.encode((data?.get("is_fb") ?: "null").toString(), "utf-8")
        is_first_launch = URLEncoder.encode((data?.get("is_first_launch") ?: "null").toString(), "utf-8")
        click_time = URLEncoder.encode((data?.get("click_time") ?: "null").toString(), "utf-8")
        iscache = URLEncoder.encode((data?.get("iscache") ?: "null").toString(), "utf-8")
        ad_id = URLEncoder.encode((data?.get("ad_id") ?: "null").toString(), "utf-8")
        af_sub1 = URLEncoder.encode((data?.get("af_sub1") ?: "null").toString(), "utf-8")
        campaign = data?.get("campaign")?.let { URLEncoder.encode(it.toString(), "utf-8") }
        is_paid = URLEncoder.encode((data?.get("is_paid") ?: "null").toString(), "utf-8")
        af_sub4 = URLEncoder.encode((data?.get("af_sub4") ?: "null").toString(), "utf-8")
        adgroup_id = URLEncoder.encode((data?.get("adgroup_id") ?: "null").toString(), "utf-8")
        is_mobile_data_terms_signed = URLEncoder.encode(
            (data?.get("is_mobile_data_terms_signed") ?: "null").toString(),
            "utf-8"
        )
        af_channel = URLEncoder.encode((data?.get("af_channel") ?: "null").toString(), "utf-8")
        af_sub5 = URLEncoder.encode((data?.get("af_sub5") ?: "null").toString(), "utf-8")
        media_source = URLEncoder.encode((data?.get("media_source") ?: "null").toString(), "utf-8")
        install_time = URLEncoder.encode((data?.get("install_time") ?: "null").toString(), "utf-8")
        af_sub2 = URLEncoder.encode((data?.get("af_sub2")).toString(), "utf-8")
        af_message = (data?.get("af_message")).toString()
        install_time = (data?.get("install_time")).toString()



        dkfjklsdjfkldsjf = true
        kldjzkldjfsd()
    }

    override fun onConversionDataFail(error: String?) {
        dkfjklsdjfkldsjf = true
        kldjzkldjfsd()
        Log.e("appsFlayerData", "error onAttributionFailure :  $error")
    }

    override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        data?.map {
            Log.d("appsFlayerData", "onAppOpen_attribute: ${it.key} = ${it.value}")
        }

    }

    override fun onAttributionFailure(error: String?) {
        dkfjklsdjfkldsjf = true
        kldjzkldjfsd()
        Log.e("appsFlayerData", "error onAttributionFailure :  $error")
    }


}