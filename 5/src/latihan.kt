fun main() {
    val angka1 = 7
    val angka2 = 12

    fun cekGanjilGenap(angka: Int): String {
        return if (angka % 2 == 0) "Genap" else "Ganjil"
    }

    println("$angka1 adalah ${cekGanjilGenap(angka1)}")
    println("$angka2 adalah ${cekGanjilGenap(angka2)}")
}
