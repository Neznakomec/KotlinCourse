fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    val res1 = spices.filter { it.contains("cur") }.sortedBy { it.length }
    println(res1)
    val res2 = spices.filter { it.startsWith('c').and(it.endsWith('e')) }
    spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
    println(res2)
    val res3 = spices.take(3).filter{it.startsWith('c')}
    println(res3)
}
