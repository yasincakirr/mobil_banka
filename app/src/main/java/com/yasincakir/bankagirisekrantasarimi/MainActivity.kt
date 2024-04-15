package com.yasincakir.bankagirisekrantasarimi

import android.content.DialogInterface
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentPagerAdapter
import androidx.navigation.ui.NavigationUI
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.yasincakir.bankagirisekrantasarimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        tabLayout = findViewById(R.id.tablayout)
        viewPager = findViewById(R.id.viewPaper)


        tabLayout.setupWithViewPager(viewPager)

        val adapter=vpAdapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        adapter.addFragment(bireyselFragment(),"Bireysel")
        adapter.addFragment(kurumsalFragment(),"Kurumsal")

        viewPager.adapter=adapter




    }

}