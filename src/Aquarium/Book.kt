package Aquarium

open class Book (val title: String, val author: String, val year: Int = 1900) {
    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }

    fun description(): Pair<String, String> {
        return Pair(title, author)
    }

    fun contents(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

class eBook(autor: String, titl: String, format: String = "text") : Book(author = autor, title = titl) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}

fun main(args: Array<String>) {
   val book = Book("bout Michael Jackson", "Undefined", 2001)
    val (title, author, year) = book.contents()
    println("“Here is your book $title written by $author in $year")
}
