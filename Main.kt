import criacao_personagem.*
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println(
        "\n" +
                "--------------------------------------- \n" +
                "          Dungeons And Dragons       \n" +
                "---------------------------------------"
    )

    var resposta = ""
    var personagem: Personagem

    do {
        println("\nComece sua história criando seu Personagem de D&D.\n" +
                "\nPrimeiramente, digite o NOME do seu personagem: ")

        val nomePersonagem = scanner.nextLine()
        personagem = Personagem(nomePersonagem, Atributos())

        println("\nO nome do seu personagem é '$nomePersonagem', Correto? (S/N)")
        resposta = scanner.nextLine().lowercase()
    } while (resposta != "s")

    val seletorRaca = SeletorRaca()
    personagem.raca = seletorRaca.selecionarRaca()

    var redistribuir: Boolean
    do {
        val distribuicao = DistribuidorPontos()
        redistribuir = distribuicao.distribuidorPadrao(personagem.atributos)

        if (!redistribuir) {
            personagem.aplicarBonusRaca()
            personagem.exibirTabelaAtributos()

            println("\nPersonagem criado com sucesso!")
        }
    } while (redistribuir)
}
