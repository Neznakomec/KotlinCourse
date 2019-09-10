package Aquarium

enum class Direction {
    NORTH, EAST, WEST, SOUTH, START, END
}

class Game {
    var path = mutableListOf<Direction>(Direction.START)
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = { path.add(Direction.END); println("Game Over: $path"); path.clear(); false }

    fun makeMove(str: String?) {
        val dir = Direction.values().find { dir -> dir.name.equals(str) }
        when (dir) {
            Direction.NORTH -> move { north }
            Direction.SOUTH -> move { south }
            Direction.EAST -> move { east }
            Direction.WEST -> move { west }
            else -> move { end }
        }

    }

    fun move(where: () -> Unit ) {
        where.invoke()
    }

}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
    println(game.path)
}