package linhagem

import Personagem

class Infernal : Raca {
    override fun bonusRaca(personagem: Personagem) {
        personagem.atributos.constituicao += 1
    }

    override fun nomeRaca(): String {
        return "Infernal"
    }

    override fun exibirBonus(): String {
        return "    BÔNUS DA RAÇA:\n" +
                "    +1 CON"
    }

    fun historia(): String {
        return "Os Infernal são conhecidos por sua resiliência e habilidade com minerais. \n" +
                "Habitantes de cavernas e montanhas, \n" +
                "eles são exímios mineradores e artesãos, capazes de criar joias e armas de grande qualidade.\n" +
                " Sua força e determinação os tornam aliados valiosos em qualquer jornada."
    }
}
