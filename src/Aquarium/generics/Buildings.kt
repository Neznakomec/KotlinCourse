package Aquarium.generics

open class BaseBuildingMaterial(val numberNeeded: Int = 1)
class Wood : BaseBuildingMaterial(4)
class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("We need ${material::class.simpleName} in amount of $actualMaterialsNeeded")
    }

}

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
}