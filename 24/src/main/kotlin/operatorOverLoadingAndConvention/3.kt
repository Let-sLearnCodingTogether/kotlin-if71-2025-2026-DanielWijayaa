package operatorOverLoadingAndConvention

class GameCharacter (val inventory: List<String>)
{
    operator fun contains(item : String): Boolean
    {
        return inventory.contains((item))
    }
}

fun main() {
    var here= GameCharacter(listOf("Item A","Item B"))
    println("Item A" in here)
    println("Item B" in here)
    println("Item C" in here)
}
