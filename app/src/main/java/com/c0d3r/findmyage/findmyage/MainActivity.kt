package com.c0d3r.findmyage.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnShowMyAgeClickEvent(view:View){
        val YearOfBirth = editText.text.toString().toInt()
        val CurrentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = CurrentYear - YearOfBirth
        textView.setText("Your Age is $age Years")
    }
}
