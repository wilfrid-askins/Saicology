package com.wilfaskins.dashboard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ThanksActivity : AppCompatActivity() {

    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)

        button = findViewById(R.id.endButton)

        button?.setOnClickListener {

        }

    }

}
