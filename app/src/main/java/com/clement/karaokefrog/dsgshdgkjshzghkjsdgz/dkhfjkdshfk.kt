package com.clement.karaokefrog.dsgshdgkjshzghkjsdgz

import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController

import com.clement.karaokefrog.R
import com.clement.karaokefrog.jdfhjsdfhkdfsh.sjkdhkjdshdskjds
import com.clement.karaokefrog.dajfhjdskhfjksdhf.jksdhkjfhsdfkjhsd
import com.clement.karaokefrog.databinding.DkhfjkdshfkBinding

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject


class dkhfjkdshfk : Fragment() {

    val hsdgjdshgds  by lazy {
        DkhfjkdshfkBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as sjkdhkjdshdskjds).dshjsdkhdsjds = {
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.dshksjdhds.isClickable = false
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.jkdshjdsh.isClickable = false
            findNavController().navigate(R.id.jkdshjksdhkjds)}
        (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.dshksjdhds.isClickable = true
        (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.jkdshjdsh.isClickable = true
        (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.jkdshjdsh.setOnClickListener{

            var  jksdhkjdshds =    ObjectAnimator.ofFloat((requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.nkldsjjkdshkjds, View.ALPHA, 0F)
            jksdhkjdshds.duration = 500
            jksdhkjdshds.start()

            var  djhdskjhds =    ObjectAnimator.ofFloat(hsdgjdshgds.jjdshkjdshds, View.ALPHA, 1F)
            djhdskjhds.duration = 500
            djhdskjhds.start()
        }
        (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.dshksjdhds.setOnClickListener{
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.dshksjdhds.isClickable = false
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.jkdshjdsh.isClickable = false
        findNavController().navigate(R.id.kljdskljsldkjdsklds)
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.nkldsjjkdshkjds.alpha = 0F
    }

       if((requireContext() as sjkdhkjdshdskjds).dshjfxhksdfhsfk()) {
           jsdhkjdshdksjhds()
       }else{
               findNavController().navigate(R.id.kljdskdsjklsjdsljds)

       }


        hsdgjdshgds.sdjlksjdskldjs.setOnClickListener{
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.dshksjdhds.isClickable = false
            (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.jkdshjdsh.isClickable = false
            findNavController().navigate(R.id.jkdshjksdhkjds)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return hsdgjdshgds.root
    }


    fun jsdhkjdshdksjhds() {
        sdljjdsjhds = arrayListOf()

        CoroutineScope(Dispatchers.IO).launch {
            var jksdhkjdshds = "https://api.deezer.com/search?q=$jshdkjdshdskjhsd&type=track"

            val jsdkhdsjkhds = OkHttpClient()
            val jksdhjkdshds = Request.Builder()
                .url(jksdhkjdshds)
                .get()
                .build()

            val jkdshjkdsh = jsdkhdsjkhds.newCall(jksdhjkdshds).execute()

            jkdshjkdsh.use {
                val jnsdhkjdsh = jkdshjkdsh.body?.string()

                if (jkdshjkdsh.isSuccessful && !jnsdhkjdsh.isNullOrEmpty()) {
                    val jkdhskjsdh = JSONObject(jnsdhkjdsh)
                    val kskdjlds = jkdhskjsdh.getJSONArray("data")

                    for (i in 0 until kskdjlds.length()) {
                        val jkdshkjdshds = kskdjlds.getJSONObject(i)
                        val jahkjdsh = jkdshkjdshds.getString("title")
                        val kjdshkjdsh = jkdshkjdshds.getJSONObject("artist").getString("name")
                        sdljjdsjhds.add(jdskhdskjhdskds(jahkjdsh, kjdshkjdsh))
                        Log.d("lllll", "$jahkjdsh by $kjdshkjdsh")
                    }
                    withContext(Dispatchers.Main) {
                        hsdgjdshgds.jjdshjkdshds.isVisible = false
                        hsdgjdshgds.jkdshkjdsh.adapter = jksdhkjfhsdfkjhsd(sdljjdsjhds) {
                            var jksdhkjdshds = ObjectAnimator.ofFloat(
                                (requireContext() as sjkdhkjdshdskjds).bkdshkjsdhdsk.nkldsjjkdshkjds,
                                View.ALPHA,
                                1F
                            )
                            jksdhkjdshds.duration = 500
                            jksdhkjdshds.start()

                            var jkdshjkdshdks =
                                ObjectAnimator.ofFloat(hsdgjdshgds.jjdshkjdshds, View.ALPHA, 0.5F)
                            jkdshjkdshdks.duration = 500
                            jkdshjkdshdks.start()

                        }
                    }
                }
            }

        }
    }
}