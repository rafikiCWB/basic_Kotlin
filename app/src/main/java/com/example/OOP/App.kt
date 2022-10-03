package com.example.OOP

class App {}

fun main() {
    println("Carro ")
    val carro = Carro()
    carro.cor = "Azul"
    println("Cor " + carro.cor)
    carro.modelo = "Fusca"
    println("Modelo " + carro.modelo)

    carro.acelerar()
    carro.frear()

    println("----------------")

    val carroEspecial = CarroEspecial()
    println("Carro Especial ")

    carroEspecial.cor  = "vermelhor"
    println("Cor " + carroEspecial.cor)
    carroEspecial.modelo = "Ferrari"
    println("Modelo " + carroEspecial.modelo)


    carroEspecial.fazerDrift()
    carroEspecial.acelerar()
    carroEspecial.frear()

}