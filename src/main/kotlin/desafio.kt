// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade: Int )

data class ConteudoEducacional(val nome: String, var duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    }

    val inscritos = mutableListOf<Usuario>()
    val todosConteudos = mutableListOf<ConteudoEducacional>()
    val formacoes = mutableListOf<Formacao>()


   fun novoConteudo(conteudos: ConteudoEducacional){
       todosConteudos.add(conteudos)
   }
   fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

   fun novaFormacao(formacao: Formacao){
       formacoes.add(formacao)
   }



fun main() {

    novoConteudo(ConteudoEducacional("Kotlin",60,Nivel.AVANCADO))
    novoConteudo(ConteudoEducacional("JAVA",120,Nivel.BASICO))

    novaFormacao(Formacao("Back-End Developer", todosConteudos))
    println(formacoes)

    matricular(Usuario("Eduarda",18))
    matricular(Usuario("Gabriel",23))
    matricular(Usuario("Bruno",15))
    println(inscritos)

}

