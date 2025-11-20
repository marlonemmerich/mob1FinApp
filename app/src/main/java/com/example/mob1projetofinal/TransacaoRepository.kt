package com.example.mob1projetofinal

object TransacaoRepository {
    private val transacoes = mutableListOf<Transacao>()

    fun adicionar(transacao: Transacao) {
        transacoes.add(transacao)
    }
}