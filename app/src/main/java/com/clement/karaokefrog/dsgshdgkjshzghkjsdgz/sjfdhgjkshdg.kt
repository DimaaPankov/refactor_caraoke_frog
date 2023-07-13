package com.clement.karaokefrog.dsgshdgkjshzghkjsdgz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.clement.karaokefrog.R
import com.clement.karaokefrog.databinding.SjfdhgjkshdgBinding
import com.clement.karaokefrog.fsjkdgfhdsghhsgh.parseNamign


//com.clement.karaokefrog

class sjfdhgjkshdg : Fragment() {

    val jksdhkjdhsjds by lazy {
        SjfdhgjkshdgBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

        jksdhkjdhsjds.jsdjhjkdshjkds.setOnClickListener{
            findNavController().navigate(R.id.jksdhjkdshdskjhdskjds)
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

        return jksdhkjdhsjds.root

    }


}