package Aquarium

open class Book (val title: String, val author: String) {
    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(autor: String, titl: String, format: String = "text") : Book(author = autor, title = titl) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}