fun main(args: Array<String>) {

    val ingresso01 = Ingresso(12f)
    val ingresso02 = Ingresso(17f)
    val ingresso03 = Ingresso(12f)
    val ingresso04 = Ingresso(9f)
    val ingresso05 = Ingresso(12f)
    val ingresso06 = Ingresso(15f)
    val ingresso07 = Ingresso(17f)
    val ingresso08 = Ingresso(17f)
    val ingresso09 = Ingresso(12f)
    val ingresso10 = Ingresso(9f)

    var ingressos = mutableListOf<Ingresso>(ingresso01, ingresso02, ingresso03, ingresso04, ingresso05, ingresso06, ingresso07, ingresso08, ingresso09, ingresso10)
    val contIng = ingressos.size - 1

    val assento01 = Assento(true)
    val assento02 = Assento(false)
    val assento03 = Assento(true)
    val assento04 = Assento(true)
    val assento05 = Assento(true)
    val assento06 = Assento(false)
    val assento07 = Assento(true)
    val assento08 = Assento(true)
    val assento09 = Assento(true)
    val assento10 = Assento(true)

    var assentos = mutableListOf<Assento>(assento01, assento02, assento03, assento04, assento05, assento06, assento07, assento08, assento09, assento10)
    val contAss = assentos.size - 1

    val cliente01 = Cliente("Marcos", TipoCliente.comum, 12f, ingresso01, assento01)
    val cliente02 = Cliente("José", TipoCliente.estudante, 16f, ingresso02, assento02)
    val cliente03 = Cliente("Agatha", TipoCliente.professor, 20f, ingresso03, assento03)
    val cliente04 = Cliente("Tatiane", TipoCliente.comum, 9f, ingresso04, assento04)
    val cliente05 = Cliente("Paulo", TipoCliente.estudante, 20f, ingresso05, assento05)
    val cliente06 = Cliente("Leonardo", TipoCliente.professor, 24f, ingresso06, assento06)
    val cliente07 = Cliente("Ana", TipoCliente.comum, 3f, ingresso07, assento07)
    val cliente08 = Cliente("Bryan", TipoCliente.idoso, 5f, ingresso08, assento08)
    val cliente09 = Cliente("Aline", TipoCliente.idoso, 15f, ingresso09, assento09)
    val cliente10 = Cliente("Renata", TipoCliente.comum, 17f, ingresso10, assento10)

    var clientes = mutableListOf<Cliente>(cliente01, cliente02, cliente03, cliente04, cliente05, cliente06, cliente07, cliente08, cliente09, cliente10)
    val contCli = clientes.size - 1



    for (Cliente in clientes) {
        if (Cliente.tipoCliente == TipoCliente.estudante) {
            Cliente.ingresso.preco = (Cliente.ingresso.preco * 0.97f)
            println("")
            System.out.printf(
                "%s O cliente é um(a) estudante, desconto de: %.2fR$",
                Cliente.nome,
                Cliente.ingresso.preco
            )
            println("")
        } else if (Cliente.tipoCliente == TipoCliente.professor) {
            Cliente.ingresso.preco = (Cliente.ingresso.preco * 0.95f)
            println("")
            System.out.printf(
                "%s O clinte é um(a) professor(a), desconto de: %.2fR$",
                Cliente.nome,
                Cliente.ingresso.preco
            )
            println("")
        } else if (Cliente.tipoCliente == TipoCliente.idoso) {
            Cliente.ingresso.preco = (Cliente.ingresso.preco * 0.90f)
            println("")
            System.out.printf(
                "%s O cliente é um(a) idoso(a), desconto de: %.2fR$",
                Cliente.nome,
                Cliente.ingresso.preco
            )
            println("")
        }


    }


    for (Cliente in clientes) {
        if (Cliente.assento.disponivel == false) {
            println("Assento indisponível para ${Cliente.nome}!")
            println("--")
        } else if (Cliente.assento.disponivel == true)
            println("Assento Reservado Para ${Cliente.nome}.")
        println("--")
    }


    for (Cliente in clientes) {
        if (Cliente.dinheiro < Cliente.ingresso.preco) {
            println("${Cliente.nome} Não pode pagar pelo ingresso. Venda cancelada!")
            println("--")
        } else if (Cliente.dinheiro >= Cliente.ingresso.preco)
            println("Ingresso vendido para ${Cliente.nome}.")
        println("--")
    }


}

private operator fun Any.compareTo(preco: Float): Int {