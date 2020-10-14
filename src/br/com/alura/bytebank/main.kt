package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!! //lança kotlin.KotlinNullPointerException ao tentar converter endereco de Endereco? para Endereco
    enderecoNaoNulo.logradouro

    var e: Endereco? = null
    //e.logradouro //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type Endereco?
}