package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalc(view: View) {

        //Recuperar valores digitados
        val precoAlcool = findViewById<EditText>(R.id.editTxt_Alcool)
        val txtAlcool = precoAlcool.text.toString()
        //Log.i("RESULTADO: ", "Texto Recuperado: $txtAlcool")

        val precoGasolina = findViewById<EditText>(R.id.editTxt_Gasolina)
        val txtGasolina = precoGasolina.text.toString()
        //Log.i("RESULTADO: ", "Texto Recuperado: $txtGasolina")

        val msgComb = findViewById<TextView>(R.id.txtResult)

        val CamposPreenchidos = validarCampos(txtAlcool, txtGasolina)
        if (CamposPreenchidos) {
            calcMelhorComb(txtAlcool, txtGasolina)
        } else {
            msgComb.setText("Preencha os preços primeiro!")
        }
    }

    fun validarCampos(txtAlcool: String, txtGasolina: String): Boolean {

        var camposValidados: Boolean = true

        if (txtAlcool == null || txtAlcool.equals("")) {
            camposValidados = false
        } else if (txtGasolina == null || txtGasolina.equals("")) {
            camposValidados = false
        }

        return camposValidados
     }

    fun calcMelhorComb(txtAlcool: String, txtGasolina: String) {
        val valAlcool = txtAlcool.toDouble()
        val valGasolina = txtGasolina.toDouble()

        /*
        * CÁLCULO COMBUSTÍVEL (CUSTO / BENEFÍCIO)
        *   Se resultado >= 0.7 melhor utilizar gasolina.
        *   Senão melhor usar Álcool.
        * */

        val melhorComb = valAlcool / valGasolina

        val msgComb = findViewById<TextView>(R.id.txtResult)

        if (melhorComb >= 0.7) {
            msgComb.setText("Melhor utilizar Gasolina!")
        } else {
            msgComb.setText("Melhor utilizar Álcool!")
        }
    }
}