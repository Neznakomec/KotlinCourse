package Aquarium

import kotlin.math.PI

open class Aquarium(var length:Int = 100, var width:Int = 20, var height:Int = 40) {

    open var volume : Int
        get() = width * height * length / 1000
        protected set(value) {height = (value * 1000) / (width * height)}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000 // cm3
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8

    override var volume : Int
        get() = (width * height * length / 1000 * PI).toInt()
        protected set(value) {height = (value * 1000) / (width * height)}
}