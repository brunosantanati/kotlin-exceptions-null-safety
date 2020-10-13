package br.com.alura.bytebank.teste

import br.com.alura.bytebank.valorComTaxa
import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1.1"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
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

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}