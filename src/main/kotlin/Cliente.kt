class Cliente(s: String, comum: TipoCliente, fl: Float, ingresso01: Ingresso, assento01: Assento) {
    val dinheiro: Any
        get() {
            TODO()
        }
    val assento: Any = TODO()
    val nome: Any?
    val ingresso: Any
        get() {
            TODO()
        }
    val tipoCliente: Any
        get() {
            TODO()
            val preco: Float
        }

    class Clientes(
        val nome: String,
        val tipoCliente: TipoCliente,
        var dinheiro: Float,
        val ingresso: Ingresso,
        val assento: Assento,
        val preco: Float,
    )


}