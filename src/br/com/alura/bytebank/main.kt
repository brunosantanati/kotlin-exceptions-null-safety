package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

//doc link: https://kotlinlang.org/docs/reference/null-safety.html

fun main() {
    //var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "casa fundos")
    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: 0 //Elvis Operator
        println(tamanhoComplemento)
    }
}