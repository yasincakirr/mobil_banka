package com.yasincakir.bankagirisekrantasarimi

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.yasincakir.bankagirisekrantasarimi.databinding.FragmentBireyselBinding

class bireyselFragment : Fragment() {

    private lateinit var binding:FragmentBireyselBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentBireyselBinding.inflate(inflater, container, false)


        binding.btnKullaniciDegistirme.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sheetGecis)
        }



        return binding.root
    }








}