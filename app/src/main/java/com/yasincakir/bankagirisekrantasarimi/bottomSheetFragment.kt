package com.yasincakir.bankagirisekrantasarimi

import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.yasincakir.bankagirisekrantasarimi.databinding.FragmentBottomSheetBinding

class bottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)



        binding.button5.paintFlags = binding.button5.paintFlags or Paint.UNDERLINE_TEXT_FLAG





        return binding.root
    }

}