fun main() {
    val dataKuliah : List<String> = listOf(
        "Kotlin",
        "kalkulus",
        "algoritma Dan Struktur Data"
    )
    val mataKuliahPilihan : MutableList<String> =mutableListOf(
        "Kotlin",
        "kalkulus",
        "algoritma Dan Struktur Data"
    )
    mataKuliahPilihan.add("Web 2")

    println(mataKuliahPilihan.get(1))
    println(mataKuliahPilihan.get(2))
    println(mataKuliahPilihan.get(3))
    mataKuliahPilihan.add(1,"web 1")
    println(mataKuliahPilihan.get(1))
    mataKuliahPilihan.removeAt(1)
    println(mataKuliahPilihan.get(1))

    val matakuliah= mataKuliahPilihan+mataKuliahPilihan
    println(matakuliah)
}