fun main() {
    var firstUSer : Pair<String, Int> = Pair(first=" User 1", second=20)
    println(firstUSer.first)
    println(firstUSer.second)

    var secondUSer : Pair<String, Int> = "USer 2" to 20
    println(secondUSer.first)
    println(secondUSer.second)
}

