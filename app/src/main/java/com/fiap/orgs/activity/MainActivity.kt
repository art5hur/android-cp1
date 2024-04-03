package com.fiap.orgs.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.fiap.orgs.R
import com.fiap.orgs.model.Produto
import com.fiap.orgs.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

/*
 Classe MainActivity representa a classe principal do app.
 Ela herda de ComponentActivity, que é uma classe fornecida pelo framework Android Jetpack.
 Esta atividade exibe uma lista de produtos em um RecyclerView.
 */

class MainActivity : Activity() {

    /*
    --OnCreate:
     Método onCreate é chamado quando a atividade é criada. É sobrescrito o método onCreate(),
     que é um método de ciclo de vida de uma atividade no Android.
     Inicializa a interface do usuário e configura o RecyclerView para exibir a lista de produtos.
     */

    /*
    --Bundle:
    O Bundle é usado para armazenar e passar dados entre componentes do Android,
    como atividades (Activity), fragmentos (Fragment), serviços (Service), etc.
    O Bundle é frequentemente utilizado para transferir informações entre diferentes partes
    do aplicativo ou entre diferentes atividades.
     */

    /*
    --Super.OnCreate:
     O super.OnCreate(savedInstanceState) chama a implementação do método onCreate() da classe pai
     (ComponentActivity) para garantir que o comportamento padrão seja executado antes de qualquer
     personalização adicional.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*
          --RecyclerView:
            Criado para substituir a ListView, é um componente que é usado para exibir vários dados de
            forma mais eficiente. Tem a característica de replicar todo o conteúdo até o final da tela.
            A função da RecyclerView aqui é exibir a lista de produtos na tela.
       */

        /*
         Dentro do método onCreate() da MainActivity, a RecyclerView é inicializada e referenciada
         através do método findViewById();
         Binding: É o processo de vinculação do código fonte com o arquivo de layout.

         R.id.recyclerView - É o ID da RecyclerView definido no layout activity_main.xml;

         O adapter é o método que atribui o ListaProdutosAdapter à RecyclerView
        */

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
