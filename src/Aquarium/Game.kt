package Aquarium

enum class Directions {NORTH, SOUTH, EAST, WEST, START, END}

class Game {
    var path = mutableListOf<Directions>(Directions.START)

    var north = { path.add(Directions.NORTH) }
    var south = { path.add(Directions.SOUTH) }
    var east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game over: $path")
        path.clear()
        false
    }
}

fun main (args: Array<String>) {
    val game: Game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
}