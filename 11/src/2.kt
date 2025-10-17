package OOP

    class Kalkulator{
        companion object{
            fun tambah(a: Int, b: Int): Int {
                return a+b
            }
        }
    }

fun main() {
    Kalkulator.tambah(1,2)
}