package com.example.livrokotlincomandroid

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]
    val lastChar = text[text.length - 1]
    println("First char: $firstChar")
    println("Last char: $lastChar")

    println("Abaixo exemplos do livro Kotlin com Android")
    val nomeUsuario = "Rafael Grando"
    val saudacao = "Bem-vindo, $nomeUsuario"
    println(saudacao)

    val texto = """
        |Olá, $nomeUsuario
        |Seja bem-vindo ao curso de Kotlin
        |Aqui você aprenderá a criar aplicativos Android
        |com Kotlin
    """.trimMargin()
    println(texto)
}