interface Electronic{
    val brand : String
    fun turnOn()
    fun turnOf()
    fun cleanDrive()=println("Membersihkan debu dari perangkat $brand")

}
class class_Electronis : Electronic{
    override val brand: String="Maspion"

    override fun turnOn() {
        println("Kipas Angin merek $brand berputar")
    }

    override fun turnOf() {
        println("Kipas Angin merek $brand berhenti")
    }


}
class SmartLight: Electronic{
    override val brand: String="Maspion"
    override fun turnOn() {
        println("Kipas Angin merek $brand berputar")
    }

    override fun turnOf() {
        println("Kipas Angin merek $brand berhenti")
    }

}

fun main() {
    val Electronis=class_Electronis()
    Electronis.turnOn()
    Electronis.turnOf()
    val SmartLight=SmartLight()
    SmartLight.turnOn()
    SmartLight.turnOf()
    SmartLight.cleanDrive()
}