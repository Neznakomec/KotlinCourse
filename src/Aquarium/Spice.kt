package Aquarium

class Spice(val name: String, val level: String = "mild") {
    val heat: Int
        get() {
            when (level) {
                "mild" -> return 5
                else -> return 0
            }
        }

    init {
        println("it's $name spice with $heat level of heat")
    }
}

val lst = listOf<Spice>(Spice("hh"),
    Spice("gg, 0"))

val lstFileterd = lst.filter { spice -> spice.heat > 0 }

fun makeSalt() = Spice("salt", "curry")