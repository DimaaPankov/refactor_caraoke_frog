package com.clement.karaokefrog.black


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs

import com.clement.karaokefrog.R
import com.clement.karaokefrog.activity.MainActivity
import com.clement.karaokefrog.databinding.WebViewFragmentBinding


var doneUrl = ""

class WebViewFragment : Fragment() {
    val binding by lazy { WebViewFragmentBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPENED_URL)

        (requireContext() as MainActivity).goBack = {}

        val client = WebChromeClient()
        binding.vebview.setWebChromeClient(client)
        Log.d("WebViewFragment", "doneUrl: $doneUrl")

        with(binding.vebview) {
            (requireContext() as MainActivity).goBack = { goBack() }
            settings.loadsImagesAutomatically = true
            webViewClient = MyWeb()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl(doneUrl)
            Log.d("fireBase", doneUrl)
            //( url!!))
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


    inner class MyWeb : WebViewClient() {

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
            super.onReceivedError(view, request, error)
        }

        override fun onReceivedHttpError(
            view: WebView?,
            request: WebResourceRequest?,
            errorResponse: WebResourceResponse?
        ) {
            if (errorResponse?.statusCode == 404) {
                try {
                    findNavController().navigate(R.id.action_webViewFragment2_to_oneFragment)
                } catch (_: Exception) {

                }
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            binding.zug.isVisible = false
            SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPENED_URL)
            SharedPrefs(requireContext()).setUrl(url ?: "")
        }
    }

}