package com.school.advanceuiworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<CustomViewHard>(R.id.hardView).apply {
            setOnClickListener {
                strokeWidth++
            }
        }

        findViewById<CustomViewHard>(R.id.hardView).setOnClickListener {
            (it as CustomViewHard).strokeWidth++
        }

        findViewById<CustomViewFine>(R.id.first).apply {
            text = "MY EASY VIEW SETTING"
            buttonClickListener = View.OnClickListener { text = "Clicked!" }
        }
    }
}
