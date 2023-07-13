package com.clement.karaokefrog.dsgshdgkjshzghkjsdgz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController

import com.clement.karaokefrog.R
import com.clement.karaokefrog.databinding.DkjfoklfdgjokfjgoifdugioklBinding

class dkjfoklfdgjokfjgoifdugiokl : Fragment() {

    val jkjsdhjkfdh by lazy {
        DkjfoklfdgjokfjgoifdugioklBinding.inflate(layoutInflater)
    }

    val dfhkjfhd = "0" //= "karaokeFrog22@gmail.com"
    val dfjfdjd = "0"// = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        jkjsdhjkfdh.jfdhjkfh.setOnClickListener{

            if(jkjsdhjkfdh.kjfhdfkjhf.text.toString() == dfhkjfhd && jkjsdhjkfdh.jksdhkjsdh.text.toString() == dfjfdjd ){
               findNavController().navigate(R.id.jshjkfhdfkhdfkjhdfkhdf)
            }else {
                jkjsdhjkfdh.sdhjkfh.alpha = 0F
                jkjsdhjkfdh.jkshjkhfd.alpha = 0F
                jkjsdhjkfdh.kjfhdfkjhf.text.clear()
                jkjsdhjkfdh.jksdhkjsdh.text.clear()
                jkjsdhjkfdh.dfhdjkhdf.isVisible = true
            }
        }

        jkjsdhjkfdh.jkhkjh.setOnClickListener{
            findNavController().navigate(R.id.jdkhfdkjhdfkjhdkjd)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return jkjsdhjkfdh.root
    }


}