package nextOOP

interface  VehicleProperties{
    val weight : Int
    val name : String
        get()="Vehicle"
}
class Car() : VehicleProperties{
    override val weight: Int=1000

}

fun main() {
    var car= Car()
    println(car.weight)
    println(car.name)
}