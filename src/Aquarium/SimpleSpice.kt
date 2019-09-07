package Aquarium

class SimpleSpice {
    val name: String = "curry"
    val level: String = "mild"

    val heat: Int
        get() {
            when (level) {
                "mild" -> return 5
                else -> return 0
            }
        }

    /*fun heat():Int  {
            return when (level) {
                "mild" -> 5
                else -> 0
            }
        }*/

}