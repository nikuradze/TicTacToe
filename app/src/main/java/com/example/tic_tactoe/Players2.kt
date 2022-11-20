package com.example.tic_tactoe

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.EditText

class Players2 : AppCompatActivity() {
    private lateinit var startbutton: Button
    private lateinit var firstplayer: EditText
    private lateinit var secondplayer: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players2)
        startbutton = findViewById(R.id.startbutton)
        firstplayer = findViewById(R.id.firstplayer)
        secondplayer = findViewById(R.id.secondplayer)

        startbutton.setOnClickListener {
            if (firstplayer.text.toString()!="" && secondplayer.text.toString()!=""){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("first player", firstplayer.text.toString())
                intent.putExtra("second player", secondplayer.text.toString())
                startActivity(intent)
            }else{
                Toast.makeText(this, "Enter Player names!", Toast.LENGTH_SHORT).show()
            }
        }

    }


}
