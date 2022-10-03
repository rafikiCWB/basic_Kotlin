package com.example.livrokotlincomandroid

fun main() {

    val a = 10
    val b: Int = 5

    //Se a for maior que b, então maior recebe a, caso contrário, maior recebe b
    val maior = if (a > b) a else b
    println(maior)

    println("------------------")

    var x: Int = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x possui outro valor")
        }
    }
    when (x) {
        0,1 -> println("x == 0 ou x == 1")
        else -> println("x tem outro valor")
    }
    when (x) {
        in 1..10 -> println("x está entre 1 e 10")
        else -> print("x está fora do intervalo")
    }
}
