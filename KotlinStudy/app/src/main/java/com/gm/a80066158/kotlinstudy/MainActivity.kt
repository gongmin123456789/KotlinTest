package com.gm.a80066158.kotlinstudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"

    private var okButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initContent()
    }

    fun initContent() {
        Log.i(TAG, "<initContent> start")

        okButton = findViewById(R.id.okButton) as Button?
        okButton?.setOnClickListener {
            var num: Number = com.gm.a80066158.kotlinstudy.Number(11)
            Log.i(TAG, "<okButton:onClick> " + num.isEven)
        }
    }
}
