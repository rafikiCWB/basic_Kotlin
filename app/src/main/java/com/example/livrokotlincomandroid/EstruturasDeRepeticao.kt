package com.example.livrokotlincomandroid

fun main() {

    val lista = listOf(1, 2, 3, 4) //lista criada
    for (i in lista) { // for para percorrer a lista
        println("Item: $i") // imprime o item
    }

    println("--------------------")

    for((indice, valor) in lista.withIndex()) {
        println("índice: $indice, valor: $valor")
    }

    println("--------------------")

    var x = 0
    while (x < 10) {
        println(x.toString())
        x++
    }

}