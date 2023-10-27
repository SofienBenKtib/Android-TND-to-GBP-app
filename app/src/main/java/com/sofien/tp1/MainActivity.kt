package com.sofien.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.sofien.tp1.Conversion.Companion.convertToPound


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tnd = findViewById<EditText>(R.id.dinarET)
        val pound = findViewById<EditText>(R.id.poundET)
        pound.isEnabled = false
        val convert = findViewById<Button>(R.id.button)
        convert.setOnClickListener {
            val pounds: Double = tnd.text.toString().toDouble()
            pound.setText(convertToPound(pounds).toString())
        }
    }


}