package com.fiap.orgs.model

import java.math.BigDecimal

/*
 A classe Produto define os atributos que cada objeto produto terá.
 Cada produto possui um nome, uma descrição e um valor.
*/

/*
 No Android Studio, ao passar essa clase "Produto ()", os parenteses já fazem automaticamente os
 getters and setters da classe.
*/

class Produto(
    val nome: String,
    val descricao: String,
    val valor: BigDecimal
)