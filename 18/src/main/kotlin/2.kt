class  Gedung1(val nama : String)
{
    private val alamat: String="Jl Sudirman"
    //ini adalah Nested Class(Defaul)
    inner class RuangRapat{
        fun mulaiRapat()
        {
            println("Rapat Dimulai")
              println("Rapat Di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val gedungA=Gedung1("Universitas Multi Data Palembang").RuangRapat().mulaiRapat()
//    val ruangRapat= gedungA.RuangRapat().mulaiRapat()
}