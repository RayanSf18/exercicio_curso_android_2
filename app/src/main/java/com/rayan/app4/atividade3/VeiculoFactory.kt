package com.rayan.app4.atividade3

import com.rayan.app4.atividade1.Carro
import com.rayan.app4.atividade1.Moto
import com.rayan.app4.atividade1.Veiculo

fun main() {

    var factory = VeiculoFactory();

    var lista = mutableListOf<Veiculo>();

    lista.add(factory.createCarro());
    lista.add(factory.createMoto());

    lista.forEach {
        veiculo -> veiculo.increaseVelocity();
    }

    lista.forEach {
        veiculo -> println(veiculo.printVelocity());
    }

}

class VeiculoFactory {

    fun createCarro() : Veiculo {
        return Carro();
    }

    fun createMoto() : Veiculo {
        return Moto();
    }

}