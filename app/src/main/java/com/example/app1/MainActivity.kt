package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val add = findViewById<Button>(R.id.btn_add_user)
        add.setOnClickListener {
            val addemployee =Intent(applicationContext,addEmployee::class.java)
            startActivity(addemployee)
        }

        val view = findViewById<Button>(R.id.btn_view_users)
        view.setOnClickListener {
            val viewemployees =Intent(applicationContext,viewEmployees::class.java)
            startActivity(viewemployees)
        }
    }
}