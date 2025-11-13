package nextOOP

interface wheeled{
    val numberOfWheels: Int
}
interface  Vihicle{
    fun drive()
}
class SeoedaRodaTIga(override val numberOfWheels: Int=3) : wheeled, Vihicle{
    override fun drive() {
        println("selesai")
    }
}

fun main() {
    val a= SeoedaRodaTIga()
    a.drive()
}