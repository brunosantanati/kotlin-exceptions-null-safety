package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

//doc link: https://kotlinlang.org/docs/reference/null-safety.html

fun main() {
    //var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "casa fundos")
    endereco?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    fazCastSeguro(1)
    fazCastSeguro("a") //imprime null

    fazCast(1)
    fazCast("a") //faz lançar ClassCastException
}

fun fazCastSeguro(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}

fun fazCast(valor: Any){
    val numero: Int = valor as Int
    println(numero)
}