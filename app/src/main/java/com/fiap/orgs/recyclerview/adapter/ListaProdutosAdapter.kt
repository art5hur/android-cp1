package com.fiap.orgs.recyclerview.adapter

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.fiap.orgs.R

import com.fiap.orgs.model.Produto


/*
 ListaProdutosAdapter exibe uma lista de produtos em um RecyclerView.
*/

/*
 Constrói um novo adapter para exibir a lista de produtos fornecida.
 context - é o contexto da aplicação
 produtos - é a lista de produtos a ser exibida
*/

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    /*
    ViewHolder é uma classe que representa um item de visualização dentro do RecyclerView.
    */

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        /*
        Constrói uma nova instância do ViewHolder
        A view que representa o item de visualização
       */

        /*
         Vincula os dados do produto ao item de visualização
         produto - O produto a ser exibido
         */

        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = produto.nome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListaProdutosAdapter.ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ListaProdutosAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = produtos.size


    override fun onBindViewHolder(holder: ListaProdutosAdapter.ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }
}