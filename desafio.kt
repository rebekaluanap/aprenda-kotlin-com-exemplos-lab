// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario foi matriculado na formação $nome.")
    }
}

fun main() {
    // Cenário de teste: Criar alguns usuários e conteúdos educacionais
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    val conteudo1 = ConteudoEducacional("Introdução à Programação")
    val conteudo2 = ConteudoEducacional("Estruturas de Dados")

    // Cenário de teste: Criar uma formação e matricular usuários nela
    val formacao = Formacao("Desenvolvedor Java", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Exibir usuários matriculados na formação
    println("Usuários matriculados na formação ${formacao.nome}:")
    formacao.inscritos.forEach { println("- ${it.nome}") }
}

