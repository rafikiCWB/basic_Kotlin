

class soma() {
    val a = 1
    val b = 2
    var c = a + b
}

class DeclarandoVariaveis {
    var idade: Int = 0
    var idade2 = 22
}

fun main() {
    val age = DeclarandoVariaveis()
    age.idade = 10
    println(age.idade)
    println(age.idade2)
    val soma = soma()
    println(soma.c)

}

