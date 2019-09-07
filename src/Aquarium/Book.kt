package Aquarium

import kotlin.random.Random

const val MAX_BOOKS = 5
class Book(val title: String, val author: String, val year: Int) {
    var pages: Int = 0
    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(books: Int): Boolean {
        return books < MAX_BOOKS
    }
}

fun Book.weight(): Double = this.pages * 1.5

fun Book.tornPages(count: Int) {
    if (pages >= count) {
        pages -= count
    } else {
        pages = 0
    }
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.Default.nextInt(10))
    }
}
fun main(args: Array<String>) {

    val book = Book("Romeon and Juliet", "William Shakespeare", 1597)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    /*val allBooks = setOf(book)
    val library = mapOf(book.author to allBooks)
    println(library.any { it.key.equals("Hamlet") })
    val moreBooks = mutableMapOf(book.title to book)*/

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

    val puppy = Puppy()
    val bookToPlay = Book("11", "22", 1990)
    bookToPlay.pages = 100
    println("book has ${bookToPlay.pages} pages")
    puppy.playWithBook(bookToPlay)
    println("book has ${bookToPlay.pages} pages")
}