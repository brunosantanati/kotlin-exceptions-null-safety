package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

//doc link: https://kotlinlang.org/docs/reference/null-safety.html

fun main() {
    var enderecoNulo: Endereco? = null
    println(enderecoNulo?.logradouro) //imprime null devido ao uso do safe call operator
    println(enderecoNulo?.logradouro?.length)

    enderecoNulo?.let {endereco: Endereco ->
        println("Entrou aqui")
        println(endereco.logradouro.length)
    }

    //------------------------------------------------

    var enderecoNaoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    println(enderecoNaoNulo?.logradouro)
    println(enderecoNaoNulo?.logradouro?.length)

    enderecoNaoNulo?.let {endereco: Endereco ->
        println("Entrou aqui 2")
        println(endereco.logradouro.length)
    }
}