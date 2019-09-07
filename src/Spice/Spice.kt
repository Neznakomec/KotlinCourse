package Spice

abstract class Spice(val name: String, val spiciness: String = "mild") : SpiceColor {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    abstract fun prepareSpice()
}

class Curry(spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice("curry", spiciness),
    Grinder, SpiceColor by color {
    override fun grind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind();
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}
//val spices1 = listOf(
//    Spice("curry", "mild"),
//    Spice("pepper", "medium"),
//    Spice("cayenne", "spicy"),
//    Spice("ginger", "mild"),
//    Spice("red curry", "medium"),
//    Spice("green curry", "mild"),
//    Spice("hot pepper", "extremely spicy")
//)
//val spice = Spice("cayenne", spiciness = "spicy")
//val spicelist = spices1.filter {it.heat < 5}
//fun makeSalt() = Spice("Salt")