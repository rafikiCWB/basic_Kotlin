package com.example.livrokotlincomandroid


fun main() {
    var x: Int = 10
    var y: Double = x.toDouble() //Retorna um objeto Double a partir do valor de x
    var z: Float = x.toFloat() //Retorna um objeto Float a partir do valor de x
    var a: String = x.toString() //Retorna uma String a partir do valor de x
    println("y = $y")
    println("z = $z")
    println("a = $a")
    println("-------------------------------")
    val umMilhao = 1_000_000 // podemos usar _ para separar os dígitos e facilitar a leitura
    println(umMilhao)
}
