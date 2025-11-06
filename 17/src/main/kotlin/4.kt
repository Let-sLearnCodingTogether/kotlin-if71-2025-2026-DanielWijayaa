package nexOOP

abstract class Printer(){
    abstract fun cetak()

    fun info()
    {
        println("Info Printer")
    }
}
class  PrinterLaser(): Printer()
{
    override fun cetak() {
       println("anda sedang mencetak")
    }
}

fun main() {
    PrinterLaser().cetak()
    PrinterLaser().info()
}