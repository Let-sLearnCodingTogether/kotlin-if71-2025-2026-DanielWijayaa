fun main() {
    val daftarMahasiswa = listOf(
        Pair("Lazu",3.8),
        Pair("Dawi",3.9),
        Pair("liv",4.0)
    )
    for (a in daftarMahasiswa)
    {
      if(a.second>3.5)
      {
          println("Nama: ${a.first}")
      }

    }
    val b=daftarMahasiswa
        .filter{it.second>3.5}.map{it.first}
    println(b)

}

