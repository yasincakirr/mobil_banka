package com.yasincakir.bankagirisekrantasarimi

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)


        textView6.visibility=View.INVISIBLE


        val handler=Handler()
        handler.postDelayed({
            textView6.visibility=View.VISIBLE
        },1000)


        val handler2=Handler()
            handler2.postDelayed({


                var intent=Intent(this,MainActivity::class.java)

                startActivity(intent)

            },2000)


    }
}