package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun sortNum(view: View) {
        Log.i("BOTAO", "Botão foi pressionado!") //Logcat Massage

        var texto = findViewById(R.id.txtSort) as TextView

        var numSort = Random.nextInt(11)

        texto.setText("Número sorteado é: $numSort")
    }
}