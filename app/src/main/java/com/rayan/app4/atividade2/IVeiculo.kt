package com.rayan.app4.atividade2

import com.rayan.app4.atividade1.Veiculo

interface IVeiculo {

    var modelo: String;
    var marca: String;
    var anoFabricacao: Int;
    var aceleracao:Int;

    fun buzinar() : String;

}

class Carro(override var modelo: String, override var marca: String, override var anoFabricacao: Int, override var aceleracao: Int) : IVeiculo  {

    override fun buzinar(): String {
        return "BOMMMMMM!"
    }

}

class Moto(override var modelo: String, override var marca: String, override var anoFabricacao: Int, override var aceleracao: Int = 5) : IVeiculo {

    override fun buzinar(): String {
        return "BIZZZZZZZ!"
    }

}

