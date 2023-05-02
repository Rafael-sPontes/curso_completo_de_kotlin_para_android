package com.example.primeiroprojetocurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ClickExibe(view: View) {
        //Log.i("BOTAO", "Botão foi pressionado!") //Logcar Massage
        var texto = findViewById(R.id.txtExibe) as TextView
        texto.setText("Texto Alterado!")
    }
}