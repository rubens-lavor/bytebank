class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario (nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario * 0.1
        }
}