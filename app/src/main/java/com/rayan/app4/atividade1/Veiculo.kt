package com.rayan.app4.atividade1

abstract class Veiculo {

    abstract var modelo: String;
    abstract var marca: String;
    abstract var anoFabricacao: Int;
    abstract var velocity: Int;
    abstract var aceleracao:Int

    abstract fun increaseVelocity()

    abstract fun printVelocity() : Int;

}

class Carro(modelo:String, marca:String, anoFabricacao:Int, velocity: Int, tipo:String) : Veiculo() {

    override var modelo: String
    override var marca: String
    override var anoFabricacao: Int
    override var velocity: Int
    override var aceleracao: Int

    private var tipo: String;

    init {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.velocity = 0;
        this.aceleracao = 10;
        this.tipo = tipo;
    }

    constructor() : this("", "", 0, 0, "") {
        // ... código adicional ...
    }


    override fun increaseVelocity() {
        this.velocity += aceleracao;
    }

    override fun printVelocity(): Int {
        return velocity;
    }
}

class Moto(modelo:String, marca:String, anoFabricacao:Int, velocity: Int) : Veiculo() {

    override var modelo: String;
    override var marca: String;
    override var anoFabricacao: Int;
    override var velocity: Int
    override var aceleracao: Int;

    init {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.velocity = 0;
        this.aceleracao = 5;
    }

    constructor() : this("", "", 0, 0) {
        // ... código adicional ...
    }


    override fun increaseVelocity() {
        this.velocity += aceleracao;
    }

    override fun printVelocity(): Int {
        return velocity;
    }

}