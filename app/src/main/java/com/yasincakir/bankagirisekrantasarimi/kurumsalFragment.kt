package com.yasincakir.bankagirisekrantasarimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yasincakir.bankagirisekrantasarimi.databinding.FragmentBireyselBinding
import com.yasincakir.bankagirisekrantasarimi.databinding.FragmentKurumsalBinding

class kurumsalFragment : Fragment() {

    private lateinit var binding: FragmentKurumsalBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        binding = FragmentKurumsalBinding.inflate(inflater, container, false)





        return binding.root
    }

}