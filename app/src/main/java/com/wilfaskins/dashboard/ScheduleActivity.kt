package com.wilfaskins.dashboard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ScheduleActivity : AppCompatActivity() {

    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        button = findViewById(R.id.nextButton)

        button?.setOnClickListener{
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }
    }

}
