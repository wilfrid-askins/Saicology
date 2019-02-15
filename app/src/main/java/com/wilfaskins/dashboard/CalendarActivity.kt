package com.wilfaskins.dashboard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class CalendarActivity : AppCompatActivity() {

    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        button = findViewById(R.id.bookButton)

        button?.setOnClickListener{
            val intent = Intent(this, ThanksActivity::class.java)
            startActivity(intent)
        }
    }

}
