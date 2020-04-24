package com.example.trucoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trucoapp.databinding.ActivityJuegoGanadoBinding

class JuegoGanado : AppCompatActivity() {

    private lateinit var vista: ActivityJuegoGanadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vista = ActivityJuegoGanadoBinding.inflate(layoutInflater)
        val view = vista.root
        setContentView(view)

        vista.botonJugaragain.setOnClickListener { jugar_again() }

    }

    private fun jugar_again(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}
