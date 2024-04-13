package com.yasincakir.bankagirisekrantasarimi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tabLayout = findViewById(R.id.tablayout)
        viewPager = findViewById(R.id.viewPaper)


        tabLayout.setupWithViewPager(viewPager)

        val adapter=vpAdapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        adapter.addFragment(bireyselFragment(),"Bireysel")
        adapter.addFragment(kurumsalFragment(),"Kurumsal")

        viewPager.adapter=adapter


    }



}