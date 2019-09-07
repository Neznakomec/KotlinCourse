package Aquarium

import com.sun.org.apache.xpath.internal.operations.Bool

/*fun String.hasSpaces(): Boolean {
    val found:Char? = this.find { it == ' ' }
    return found != null
}*/

fun String.hasSpaces() = find { it == ' ' } != null
fun extensionsExample() {
    println("Does it have spaces?".hasSpaces())
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color.equals("Red")

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print() // AquariumPlant
}

// Extension properties
val AquariumPlant.isGreen: Boolean
    get() = color.equals("Green")

fun propertyExample() {
    val plant = AquariumPlant("Green", 50)
    plant.isGreen // true
}

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull()
}