package nextOOP

interface SpaceVehicle{
    fun accelerate()
    fun stop()
    {
        println("Whoooo stop woi")
    }
}
class LightSpace : SpaceVehicle{
    override fun accelerate() {
        println("Accelerate")
    }
}

fun main() {
    val LightSpace= LightSpace()
    LightSpace.stop()
    LightSpace.accelerate()
}