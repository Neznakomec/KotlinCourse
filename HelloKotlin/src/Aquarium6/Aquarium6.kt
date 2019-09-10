package Aquarium6

data class Fish(var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    // without inline an object is created every call to myWith
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

    // with inline no object is created, and lambda body is inlined here
    fish.name.capitalize()
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
