package nextOOP
interface  Movea{
    fun move()
    {
        println("Move A")
    }
}
interface MoveB{
    fun move()
    {
        println("Move B")
    }
}
class Human : Movea, MoveB
{
    override fun move() {
        super<Movea>.move()
        super<MoveB>.move()
    }

}

fun main() {
    val human= Human()
    human.move()
}