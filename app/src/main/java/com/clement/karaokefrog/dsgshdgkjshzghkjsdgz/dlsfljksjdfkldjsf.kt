package com.clement.karaokefrog.dsgshdgkjshzghkjsdgz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.clement.karaokefrog.sjhkdgkjhfsgkjfhs.SharedPrefs
import com.clement.karaokefrog.jdfhjsdfhkdfsh.sjkdhkjdshdskjds
import com.clement.karaokefrog.R
import com.clement.karaokefrog.databinding.DlsfljksjdfkldjsfBinding

data class jdskhdskjhdskds(val jkshsdjhds:String, val sjkdhkjdshds : String )

var sdljjdsjhds = arrayListOf<jdskhdskjhdskds>()

class dlsfljksjdfkldjsf : Fragment() {

val kjdshdsjkhds by lazy{
    DlsfljksjdfkldjsfBinding.inflate(layoutInflater)
}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as sjkdhkjdshdskjds).checkCameraPermission()

        (requireContext() as sjkdhkjdshdskjds).dshjsdkhdsjds = {}

        SharedPrefs(requireContext()).jdshjkfh(SharedPrefs.fdhjkfhdkjfd)


        kjdshdsjkhds.IVplay.setOnClickListener{
            findNavController().navigate(R.id.jksddhjkdshkdsjhd)
        }

        kjdshdsjkhds.TVadmin.setOnClickListener{
            findNavController().navigate(R.id.ksdjhkjdshdkjshds)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return kjdshdsjkhds.root
    }


}

