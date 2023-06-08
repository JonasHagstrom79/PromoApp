package com.example.promoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //You can ctrl+click to jump to that file

        val previewButton: Button = findViewById(R.id.button_preview)

        previewButton.setOnClickListener {

            Toast.makeText(this, "Testing toast", Toast.LENGTH_LONG).show()
        }

    }
}