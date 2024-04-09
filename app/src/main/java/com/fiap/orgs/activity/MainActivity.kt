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
 Ela herda de Activity, que é uma classe fornecida pelo framework Android Jetpack.
 Esta atividade exibe uma lista de produtos em um RecyclerView.
 */

class MainActivity : Activity() {

    /*
    --OnCreate:
     É um método de ciclo de vida de uma atividade Android. 
     Ele é chamado quando a atividade é criada.
     Inicializa a interface do usuário e configura o RecyclerView para exibir a lista de produtos.
     */

    /*
    --Bundle:
    O Bundle é usado para armazenar e passar dados entre componentes do Android,
    como atividades (Activity), fragmentos (Fragment), serviços (Service), etc.
    O Bundle é frequentemente utilizado para transferir informações entre diferentes partes
    do aplicativo ou entre diferentes atividades. Ele faz isso através da chave e valor;
    
    - Chave: Uma chave é uma string única que identifica um valor dentro do Bundle. É usada
    como um identificador para recuperar o valor correspondente mais tarde. Cada chave em um
    Bundle deve ser única, pois é usada para distinguir entre diferentes valores armazenados no Bundle.

    - Valor: O valor associado a uma chave é o dado real que está sendo armazenado. Este pode ser de 
    qualquer tipo de dado suportado pelo Bundle, incluindo primitivos como inteiros, strings, booleanos,
    bem como objetos serializáveis (reconstruído a partir da sequência de bytes original) e parceláveis
    (conversão do objeto em uma representação de bytes que pode ser transmitida ou armazenada).
     */

    /*
    --Super.OnCreate:
     O super.OnCreate(savedInstanceState) chama a implementação do método onCreate() da classe pai
     (Activity) para garantir que o comportamento padrão seja executado antes de qualquer
     personalização adicional.

     A chamada super.onCreate(savedInstanceState) deve ser a primeira linha dentro do método onCreate() 
     da sua atividade ou fragmento. Ela é essencial para garantir que a implementação da classe base seja
     executada antes de qualquer código personalizado que você possa querer adicionar ao método onCreate().
     
     A função do super.onCreate(savedInstanceState) é permitir que a classe base execute as inicializações 
     necessárias para a atividade, como inflar o layout associado à atividade, restaurar o estado anterior 
     da atividade (se houver) a partir do Bundle fornecido (savedInstanceState), configurar o ambiente de 
     execução da atividade.

     Ao chamar super.onCreate(savedInstanceState), você está garantindo que a classe base tenha a oportunidade
     de executar seu próprio código de inicialização antes de você adicionar qualquer lógica personalizada. Isso
     é crucial para garantir o funcionamento adequado da atividade dentro do ciclo de vida do Android e para manter
     o comportamento consistente em todo o aplicativo.
     */
 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*
          --RecyclerView:
            Criado para substituir a ListView, é um componente que é usado para exibir vários dados de
            forma mais eficiente. Tem a característica de replicar todo o conteúdo até o final da tela.
            A função da RecyclerView aqui é exibir a lista de produtos na tela.
            
            É uma boa prática utilizar o recycleview, porque melhora o desempenho, flexibilidade e personalização,
            suporte para diferentes layouts, entre outos benefícios, proporcionando uma experiência de usuário mais
            fluida e responsiva nos aplicativos Android.

            A função principal do RecyclerView é gerenciar a exibição de uma grande quantidade de itens de dados de 
            maneira eficiente, especialmente quando a lista pode mudar dinamicamente, como ao adicionar ou remover 
            itens. Ele faz isso implementando um padrão de projeto chamado "View Holder" que reutiliza as visualizações 
            de itens que não estão visíveis na tela, reduzindo a sobrecarga de memória e melhorando o desempenho.
                  
            Dentro do método onCreate() da MainActivity, a RecyclerView é inicializada e referenciada através do método 
            findViewById();

            R.id.recyclerView - É o ID da RecyclerView definido no layout activity_main.xml;

            O adapter é o método que atribui o ListaProdutosAdapter à RecyclerView. Além de fornecer os dados a serem 
            exibidos e criar as visualizações dos itens da lista.
        */

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
         /* 
             Instanciar a lista de produtos usando a função listOf,  que cria e retorna uma lista imutável contendo os
             elementos fornecidos como argumentos para a função. Ela é uma forma conveniente de inicializar uma lista 
             com elementos específicos.
             Nesta classe, a função listOf está sendo usada para criar uma lista de objetos Produto. Cada chamada de 
             Produto() dentro da função listOf cria uma instância de Produto com os parâmetros fornecidos (nome, descrição
             e preço) e adiciona essa instância à lista resultante.
         */
            produtos = listOf(
                Produto(
                    "Teste 0",
                    "Teste Descrição 0",
                    BigDecimal("40.00")
                ),
                Produto(
                    "Teste 1",
                    "Teste Descrição 1",
                    BigDecimal("25.00")
                ),
                Produto(
                    "Teste 2",
                    "Teste Descrição 2",
                    BigDecimal("49.99")
                ),
            )
        )

    }
}
