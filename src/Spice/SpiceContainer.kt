package Spice

import Aquarium.Decorations.makeDecorations

fun main(args: Array<String>) {
    spices()
}

fun spices() {
    val sc1: SpiceContainer = SpiceContainer(Curry("curry", "mild"))
    print(sc1.label)
}
data class SpiceContainer (val spice: Spice, val label: String = spice.name)