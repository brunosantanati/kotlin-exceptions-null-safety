package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.NumberFormatException

fun main() {
    println("início main")

    val entrada: String = "1.1"
    val valorRecebido: Double? =  try {
        entrada.toDouble()
    }catch (e: NumberFormatException){
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

/*    val valorComTaxa: Double? = if(valorRecebido != null){
        valorRecebido + 0.1
    }else{
        null
    }*/

/*    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }*/

    val valorComTaxa: Double? = valorComTaxa(valorRecebido)

    if(valorComTaxa != null){
        println("valor recebido: $valorComTaxa")
    }else{
        println("valor inválido")
    }

    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try{
        funcao2()
    }catch (e: ClassCastException){
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        e.printStackTrace()
        println("ClassCastException foi pega")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        endereco as Endereco //casting que gera exception
    }
    println("fim funcao2")
}

fun valorComTaxa(valorRecebido: Double?): Double? {
    if (valorRecebido != null) {
        return valorRecebido + 0.1
    }
    return null
}