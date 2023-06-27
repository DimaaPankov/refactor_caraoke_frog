package com.clement.karaokefrog.black

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.clement.karaokefrog.app.myApp
import com.clement.karaokefrog.R
import com.clement.karaokefrog.databinding.LoudingFragmentBinding

var mainUrl = ""
var advertising_ID = "00000000-0000-0000-0000-000000000000"


class LoudingFragment : Fragment() {

    val binding by lazy { LoudingFragmentBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val status = SharedPrefs(requireContext()).getStatus()
        val url = SharedPrefs(requireContext()).getUrl()

        if (status == SharedPrefs.STATUS_OPENED_GAME) {
            Log.d("LoudingFragment", "SharedPrefs: open game because status $status")
            toGame()
        } else if (status == SharedPrefs.STATUS_OPENED_URL && !url.isNullOrBlank()) {
            Log.d("LoudingFragment", "SharedPrefs: open url $url")
            doneUrl = url
            toWebview()
        } else {
            Log.d("LoudingFragment", "await appsFlyer")
            myApp.toGame = ::toGame
            myApp.toOffer = ::toWebview
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    private fun toGame() {
        findNavController().navigate(R.id.action_loudingFragment2_to_oneFragment)
    }

    private fun toWebview() {
        findNavController().navigate(R.id.action_loudingFragment2_to_webViewFragment2)
    }


}