fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "rubens",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 123
    )

    val diretora = Diretor(
        nome = "maria",
        cpf = "111.111.111-22",
        salario = 2000.0,
        senha = 1234,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()

    sistema.entra(gerente, 123)
    sistema.entra(diretora, 1234)
    sistema.entra(cliente, 1234)
}
