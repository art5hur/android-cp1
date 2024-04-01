package com.fiap.orgs.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.fiap.orgs.R
import com.fiap.orgs.model.Produto
import com.fiap.orgs.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto(
                    "Teste 0",
                    "Teste Descrição 0",
                    BigDecimal("19.90")
                ),
                Produto(
                    "Teste 1",
                    "Teste Descrição 1",
                    BigDecimal("29.90")
                ),
                Produto(
                    "Teste 2",
                    "Teste Descrição 2",
                    BigDecimal("39.90")
                ),
            )
        )

    }
}
