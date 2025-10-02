fun main() {
    val ages : Array<Int> =arrayOf(60,50,40,30,20,35)
    println("Ages : ${ages.joinToString()}")
    ages.sorted()
    println("age sort : ${ages.joinToString()}")
    ages.reverse()
    println("age reverse : ${ages.joinToString()}")
    println(" Sluce : ${ages.slice(2..4).joinToString()}")
}