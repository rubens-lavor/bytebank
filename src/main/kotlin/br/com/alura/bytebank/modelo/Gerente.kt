package br.com.alura.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario
        }
}