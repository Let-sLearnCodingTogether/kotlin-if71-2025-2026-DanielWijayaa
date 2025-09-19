fun main() {
    val range = 0..1000
    val rangeChar='a'..'0'
    val rangeUntil =1 until 10
    val rangeDownTo= 1 downTo 0
    println(range)
    for (range in range)
    {
        println(range)
    }
    for (rangeChar in rangeChar)
    {
        println(rangeChar)
    }
}