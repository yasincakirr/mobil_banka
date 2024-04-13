package com.yasincakir.bankagirisekrantasarimi

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.yasincakir.bankagirisekrantasarimi.databinding.FragmentBireyselBinding

class bireyselFragment : Fragment() {

    private lateinit var binding:FragmentBireyselBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentBireyselBinding.inflate(inflater, container, false)




        binding.btnKullaniciDegistirme.setOnClickListener {

            var uyarimesaj= AlertDialog.Builder(requireContext())
            uyarimesaj.setTitle("UYARI")
            uyarimesaj.setMessage("Devam ettiginiz takdirde aktivasyonunuz silinecektir Eminmisiniz!!!")
            uyarimesaj.setPositiveButton("Evet", DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            uyarimesaj.setNegativeButton("Hayir", DialogInterface.OnClickListener { dialog, which ->

                Toast.makeText(activity,"Cikis iptal Edildi...", Toast.LENGTH_LONG).show()
            })


            uyarimesaj.show()



        }





        return binding.root
    }



}