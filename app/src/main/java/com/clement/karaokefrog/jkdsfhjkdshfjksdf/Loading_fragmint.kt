package com.clement.karaokefrog.jkdsfhjkdshfjksdf


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.clement.karaokefrog.sjhkdgkjhfsgkjfhs.SharedPrefs
import com.clement.karaokefrog.R
import com.clement.karaokefrog.jdfhjsdfhkdfsh.sjkdhkjdshdskjds
import com.clement.karaokefrog.databinding.JsdkhgkjdsghksgdBinding
import com.clement.karaokefrog.fsjkdgfhdsghhsgh.parseNamign


var sdhjkdshdskhds = ""

class Loading_fragmint : Fragment() {
    val sjdkhjkdfhskjdh by lazy { JsdkhgkjdsghksgdBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SharedPrefs(requireContext()).jdshjkfh(SharedPrefs.jdfhkjhfd)

        (requireContext() as sjkdhkjdshdskjds).dshjsdkhdsjds = {}

        val jdskhsdhkjds = WebChromeClient()
        sjdkhjkdfhskjdh.kldsjsdljds.setWebChromeClient(jdskhsdhkjds)
        Log.d("test12", "doneUrl: $sdhjkdshdskhds")

        var jkdhkjf = "dksjglksjdfklsjfg"
        jkdhkjf.removePrefix("app//")
            .split("/")
            .mapIndexed { kjdshds, sdjhjd ->
                if (kjdshds == 0) {
                    "key" to sdjhjd
                } else {
                    "sub${kjdshds}" to sdjhjd
                }
            }.associate { it }

        jkdhkjf

        val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
        val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

        val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
        val jdhajkfhsdf = "tdskjfkdsf"

        Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

        parseNamign("dkjgjksfghd")
        with(sjdkhjkdfhskjdh.kldsjsdljds) {
            (requireContext() as sjkdhkjdshdskjds).dshjsdkhdsjds = { goBack() }
            settings.loadsImagesAutomatically = true
            webViewClient = kldsjdsljds()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl(sdhjkdshdskhds)
            Log.d("test13", sdhjkdshdskhds)
            //( url!!))
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var jkdhkjf = "dksjglksjdfklsjfg"
        jkdhkjf.removePrefix("app//")
            .split("/")
            .mapIndexed { kjdshds, sdjhjd ->
                if (kjdshds == 0) {
                    "key" to sdjhjd
                } else {
                    "sub${kjdshds}" to sdjhjd
                }
            }.associate { it }

        jkdhkjf

        val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
        val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

        val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
        val jdhajkfhsdf = "tdskjfkdsf"

        Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

        parseNamign("dkjgjksfghd")
        return sjdkhjkdfhskjdh.root
    }


    inner class kldsjdsljds : WebViewClient() {

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
            var jkdhkjf = "dksjglksjdfklsjfg"
            jkdhkjf.removePrefix("app//")
                .split("/")
                .mapIndexed { kjdshds, sdjhjd ->
                    if (kjdshds == 0) {
                        "key" to sdjhjd
                    } else {
                        "sub${kjdshds}" to sdjhjd
                    }
                }.associate { it }

            jkdhkjf

            val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
            val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

            val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
            val jdhajkfhsdf = "tdskjfkdsf"

            Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

            parseNamign("dkjgjksfghd")
            super.onReceivedError(view, request, error)
        }

        override fun onReceivedHttpError(
            view: WebView?,
            request: WebResourceRequest?,
            knjfklnjf: WebResourceResponse?
        ) {
            if (knjfklnjf?.statusCode == 404) {
                var jkdhkjf = "dksjglksjdfklsjfg"
                jkdhkjf.removePrefix("app//")
                    .split("/")
                    .mapIndexed { kjdshds, sdjhjd ->
                        if (kjdshds == 0) {
                            "key" to sdjhjd
                        } else {
                            "sub${kjdshds}" to sdjhjd
                        }
                    }.associate { it }

                jkdhkjf

                val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
                val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

                val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
                val jdhajkfhsdf = "tdskjfkdsf"

                Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

                parseNamign("dkjgjksfghd")
                try {
                    var jkdhkjf = "dksjglksjdfklsjfg"
                    jkdhkjf.removePrefix("app//")
                        .split("/")
                        .mapIndexed { kjdshds, sdjhjd ->
                            if (kjdshds == 0) {
                                "key" to sdjhjd
                            } else {
                                "sub${kjdshds}" to sdjhjd
                            }
                        }.associate { it }

                    jkdhkjf

                    val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
                    val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

                    val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
                    val jdhajkfhsdf = "tdskjfkdsf"

                    Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

                    parseNamign("dkjgjksfghd")
                    findNavController().navigate(R.id.kdjsjglksdjgsjdglkjdgdslkjgds)
                } catch (_: Exception) {
                    var jkdhkjf = "dksjglksjdfklsjfg"
                    jkdhkjf.removePrefix("app//")
                        .split("/")
                        .mapIndexed { kjdshds, sdjhjd ->
                            if (kjdshds == 0) {
                                "key" to sdjhjd
                            } else {
                                "sub${kjdshds}" to sdjhjd
                            }
                        }.associate { it }

                    jkdhkjf

                    val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
                    val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

                    val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
                    val jdhajkfhsdf = "tdskjfkdsf"

                    Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

                    parseNamign("dkjgjksfghd")

                }
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)

            var jkdhkjf = "dksjglksjdfklsjfg"
            jkdhkjf.removePrefix("app//")
                .split("/")
                .mapIndexed { kjdshds, sdjhjd ->
                    if (kjdshds == 0) {
                        "key" to sdjhjd
                    } else {
                        "sub${kjdshds}" to sdjhjd
                    }
                }.associate { it }

            jkdhkjf

            val djskhzfjdsshfkjshd = "kdghjksdhfjkdshgdhgkjsd"
            val jdakshfkjdahf = "ksjdhzfjdhsfkjdsfz"

            val  dsfgnvbsdjhfhds = "ekdljcksdjc"+djskhzfjdsshfkjshd+ listOf("dskgjs","sdoifj","sdofj",).random()
            val jdhajkfhsdf = "tdskjfkdsf"

            Log.d("jkdhkjf", "$jkdhkjf $djskhzfjdsshfkjshd $jdakshfkjdahf $dsfgnvbsdjhfhds $jdhajkfhsdf")

            parseNamign("dkjgjksfghd")
            sjdkhjkdfhskjdh.zug.isVisible = false
            SharedPrefs(requireContext()).jdshjkfh(SharedPrefs.jdfhkjhfd)
            SharedPrefs(requireContext()).setUrl(url ?: "")
        }
    }

}