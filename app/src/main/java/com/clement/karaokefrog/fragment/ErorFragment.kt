package com.clement.karaokefrog.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.clement.karaokefrog.R
import com.clement.karaokefrog.databinding.FragmentErorBinding


//com.clement.karaokefrog

class ErorFragment : Fragment() {

    val binding by lazy {
        FragmentErorBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.bBack.setOnClickListener{
            findNavController().navigate(R.id.action_erorFragment_to_foureFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root

    }


}