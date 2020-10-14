package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

//doc link: https://kotlinlang.org/docs/reference/null-safety.html

fun main() {
    var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    //var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "casa fundos")
    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
}