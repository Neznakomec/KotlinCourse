package Spice

fun main(args: Array<String>) {
    spiceTest()
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

fun spiceTest() {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}