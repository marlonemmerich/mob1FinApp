package com.example.mob1projetofinal

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val edtDescricao = findViewById<EditText>(R.id.edtDescricao)
        val edtValor = findViewById<EditText>(R.id.edtValor)
        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnSalvar.setOnClickListener {
            // Obtém o ID do RadioButton selecionado
            val selectedId = radioGroup.checkedRadioButtonId

            // Validação: verifica se algum RadioButton foi selecionado
            if (selectedId == -1) {
                Toast.makeText(this, "Selecione o tipo de operação", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Obtém o RadioButton selecionado e seu texto
            val radioButton = findViewById<RadioButton>(selectedId)
            val tipo = radioButton.text.toString()

            val descricao = edtDescricao.text.toString()
            val valorStr = edtValor.text.toString()

            // Validações básicas
            if (descricao.isEmpty() || valorStr.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val valor = valorStr.toDoubleOrNull()
            if (valor == null) {
                Toast.makeText(this, "Valor inválido", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Adiciona na lista em memória
            val transacao = Transacao(tipo, descricao, valor)
            TransacaoRepository.adicionar(transacao)

            Toast.makeText(this, "Transação cadastrada com sucesso!", Toast.LENGTH_SHORT).show()

            // Limpa os campos
            edtDescricao.text.clear()
            edtValor.text.clear()
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
