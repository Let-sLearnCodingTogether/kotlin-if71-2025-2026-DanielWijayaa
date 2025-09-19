fun main() {
    val range=0..1000
    println(range.count())
    println(range.contains(56))
    println(range.last)
    val range2=0..1000 step 2
    val range5=1000..0 step 5
    println(range2.first)
    println(range5.first)
}