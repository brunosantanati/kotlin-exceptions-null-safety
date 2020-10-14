package br.com.alura.bytebank.exception

//Kotlin does not have checked exceptions.
//https://kotlinlang.org/docs/reference/exceptions.html#checked-exceptions

class FalhaAutenticacaoException (
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem)