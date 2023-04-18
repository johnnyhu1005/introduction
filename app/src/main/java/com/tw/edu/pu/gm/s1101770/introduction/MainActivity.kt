package com.tw.edu.pu.gm.s1101770.introduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.interest)
        btn2 = findViewById(R.id.button2)

        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity,InterestAcitvity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val proFragment = ProFragment()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frameLayout, proFragment)
            transaction.addToBackStack(null);
            transaction.commit()
        }

    }
}