package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText = findViewById<EditText>(R.id.editText)
        val buttonBlackText = findViewById<Button>(R.id.button_black)
        val buttonRedText = findViewById<Button>(R.id.button_red)
        val buttonSize8sp = findViewById<Button>(R.id.button_small)
        val buttonSize24sp = findViewById<Button>(R.id.button_big)
        val buttonWhiteBg = findViewById<Button>(R.id.button_whiteBG)
        val buttonYellowBg = findViewById<Button>(R.id.button_yellowBG)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }
        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }
        buttonSize8sp.setOnClickListener {
            editText.textSize = 8f
        }
        buttonSize24sp.setOnClickListener {
            editText.textSize = 24f
        }
        buttonWhiteBg.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }
        buttonYellowBg.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}