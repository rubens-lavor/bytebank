package br.com.alura.bytebank.exception

class FalhaAutenticacaoException (
    mesnsagem: String = "Falha na autenticação"
) : Exception(mesnsagem)