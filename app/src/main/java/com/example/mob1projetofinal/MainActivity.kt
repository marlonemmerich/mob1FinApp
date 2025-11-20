package com.example.mob1projetofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCadastro = findViewById<Button>(R.id.btnCadastro)
        val btnExtrato = findViewById<Button>(R.id.btnExtrato)
        val btnSair = findViewById<Button>(R.id.btnSair)

        // Navegação para tela de cadastro
        btnCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        // Navegação para tela de extrato
        btnExtrato.setOnClickListener {
            //TODO
        }

        // Fecha o aplicativo
        btnSair.setOnClickListener {
            finishAffinity()
        }
    }
}
