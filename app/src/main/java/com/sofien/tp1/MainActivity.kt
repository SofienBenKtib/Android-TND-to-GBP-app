package com.sofien.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.sofien.tp1.Conversion.Companion.convertToPound
import com.sofien.tp1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        val tnd = binding.dinarET
        val pound = binding.poundET
        pound.isEnabled = false
        val convert = findViewById<Button>(R.id.button)
        convert.setOnClickListener {
            val pounds: Double = tnd.text.toString().toDouble()
            pound.setText(convertToPound(pounds).toString())
        }
    }


}