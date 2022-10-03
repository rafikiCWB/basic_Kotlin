package com.example.livrokotlincomandroid

fun main() {

    val arraysInt: Array<Int> = arrayOf(1, 2, 3, 4)

    //Passando o índice 2 para acessar o valor da posição 2 do array
    val x = arraysInt[2]
    println("Valor de x: $x")

    println("----------------------")

    val lista = mutableListOf(1, 2, 3, 4)
    var first = lista.first()
    var last = lista.last()
    var filter = lista.filter { it % 2 == 0}
    println(first)
    println(last)
    println(filter)

    val listaImutavel = listOf(1, 2, 3, 4) // cria uma lista imutavel
    println(listaImutavel)

    var lista2 = List(10, { i -> i * 2 }) // cria uma lista com 10 posições e multiplica cada posição por 2
    println(lista2)

    val lista3 = ArrayDeque<String>(1) // cria uma lista vazia
    lista3.add("A")
    lista3.add("B")
    lista3.add("C")
    lista3.add(1, "D") // adiciona o valor D na posição 1
    println(lista3)

}