fun main() {
    println("Bem vindo ao Bytebank")

    val funcionario = Funcionario(
        "rubens",
        "111.111.111-11",
        200.0
    )

    val fran = Gerente(
        "fran",
        "111.111.111-22",
        1000.0,
        123
    )

    val gui = Diretor(
        "gui",
        "222.222.222-11",
        4000.0,
        1234,
        200.0
    )

    val maria = Analista(
        nome = "maria",
        cpf = "777.777.777-77",
        salario = 2000.0
    )

    println("nome ${funcionario.nome}")
    println("cpf ${funcionario.cpf}")
    println("salario ${funcionario.salario}")
    println("bonificação ${funcionario.bonificacao}")
    println()

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")
    println()

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (fran.autenticacao(123)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("O total de bonificação: ${calculadora.total}")
}

