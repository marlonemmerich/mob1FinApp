package com.example.mob1projetofinal

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ExtratoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extrato)

        val listView = findViewById<ListView>(R.id.listViewExtrato)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Obtém a lista de transações
        val transacoes = TransacaoRepository.obterTodas()

        // Configura o adapter
        val adapter = TransacaoAdapter(this, transacoes)
        listView.adapter = adapter

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
