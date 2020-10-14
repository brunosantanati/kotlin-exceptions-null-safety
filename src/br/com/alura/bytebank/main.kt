package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

//doc link: https://kotlinlang.org/docs/reference/null-safety.html

fun main() {
    var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    val logradouro: String? = endereco?.logradouro
    println(logradouro?.length)
}