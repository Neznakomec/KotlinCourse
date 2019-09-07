import java.util.*

fun main(args: Array<String>) {
    /*val timeOfDay = args[0].toInt()
    when {
        timeOfDay < 12 -> print("Good morning, Kotlin")
        else -> print("Good night, Kotlin")
    }*/

    println(if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin")
}
