

fun main() {
    val dataKuliah : List<String> = listOf(
        "Kotlin",
        "kalkulus",
        "algoritma Dan Struktur Data"
    )
    println("list matakuliah wajib : $dataKuliah")
    println("Size list matakuliah wajib : ${dataKuliah.size}")
    println("index pertama matakuliah wajib : ${dataKuliah[0]}")
    println("index pertama maa]takuliah wajib : ${dataKuliah.get(0)}")
    val matakuliahupperCase = dataKuliah.map{
        it.uppercase()
    }
    println("List matakuliah uppercase $matakuliahupperCase")
    val matakuliahLebihDariKaraktek = dataKuliah.filter{
        it.length>10
    }
    println("mata kuliah lebih dari 10 adalah :  ${matakuliahLebihDariKaraktek.joinToString()}")
}