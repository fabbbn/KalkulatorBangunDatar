package com.bynabila.kalkulatorbangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var panjangAlas: EditText
    lateinit var tinggi: EditText
    lateinit var textOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        panjangAlas = findViewById(R.id.inputAlas)
        tinggi = findViewById((R.id.inputTinggi))
        textOutput = findViewById(R.id.textViewOutput)
    }

    fun hitungLuasSegitiga(alas: Float, tinggi: Float)= alas*tinggi/2

    fun buttonClick(view: View) {
        when(view.id) {
            R.id.buttonHitung -> {
                val alas = panjangAlas.text.toString().toFloat()
                val tinggi = tinggi.text.toString().toFloat()
                val luas = hitungLuasSegitiga(alas, tinggi)
                textOutput.text = "Luas segitiga tersebut adalah $luas"
            }
        }
    }
}