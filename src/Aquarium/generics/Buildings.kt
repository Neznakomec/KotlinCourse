package Aquarium.generics

open class BaseBuildingMaterial() {
    open val numberNeeded = 1

    fun <T> BaseBuildingMaterial.isSmallBuilding(building: Building<*>) {
        if (building.actualMaterialsNeeded < 500) {
            println("small building")
        } else {
            println("large building")
        }
    }
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}


/*
Create a generic function for type BaseBuildingMaterial and call it isSmallBuilding, which takes a Building with a building material T as an argument. If the materials needed are less than 500, print "small building", otherwise, print "large building".
 */

fun main(args: Array<String>) {
    Building(Wood()).build()
}