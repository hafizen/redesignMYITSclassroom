package com.example.myitsclassroom

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var buttonIntent : Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonIntent = findViewById(R.id.login_btn)

        buttonIntent.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.login_btn ->{
                    val intentlogin =Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intentlogin)
                }
            }
        }
    }
}