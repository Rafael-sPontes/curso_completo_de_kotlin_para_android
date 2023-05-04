package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "O importante não é vencer todos os dias, mas lutar sempre.",
        "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado.",
        "É melhor conquistar a sí mesmo do que vencer mil batalhas.",
        "Enquanto houver vontade de lutar haverá esperança de vencer."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.txtFrase) as TextView
    }

    fun gerarFrase(view: View) {
        val totFrases = frases.size
        val numAleat = Random.nextInt(totFrases)

        texto.setText(frases[numAleat])
    }
}