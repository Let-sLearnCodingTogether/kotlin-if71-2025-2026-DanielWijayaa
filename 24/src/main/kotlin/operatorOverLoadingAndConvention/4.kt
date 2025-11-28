package operatorOverLoadingAndConvention

data class GameLevel(val number :Int): Comparable<GameLevel>{
    override fun compareTo(other: GameLevel): Int {
        return number-other.number
    }
    operator  fun rangeTo(other: GameLevel): IntRange
    {
        return number ..other.number
    }
}

fun main() {
    val level1= GameLevel(1)
    val level2= GameLevel(25)
    val rangeLevel=level1 .. level2
    println(rangeLevel)
}
