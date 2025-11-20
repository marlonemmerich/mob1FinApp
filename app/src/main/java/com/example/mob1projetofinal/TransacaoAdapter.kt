package com.example.mob1projetofinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TransacaoAdapter(
    private val context: Context,
    private val transacoes: List<Transacao>
) : BaseAdapter() {

    override fun getCount(): Int = transacoes.size

    override fun getItem(position: Int): Any = transacoes[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_transacao, parent, false)

        val transacao = transacoes[position]

        val txtTipo = view.findViewById<TextView>(R.id.txtTipo)
        val txtDescricao = view.findViewById<TextView>(R.id.txtDescricao)
        val txtValor = view.findViewById<TextView>(R.id.txtValor)

        txtTipo.text = transacao.tipo
        txtDescricao.text = transacao.descricao
        txtValor.text = String.format("R$ %.2f", transacao.valor)

        return view
    }
}
