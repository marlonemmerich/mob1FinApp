package com.example.mob1projetofinal

data class Transacao(
    val tipo: String,      // "Débito" ou "Crédito"
    val descricao: String, // Ex: "Lazer", "Moradia", "Salário"
    val valor: Double      // Valor da transação
)