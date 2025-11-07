class  Gedung(val nama : String)
{
    private val alamat: String="Jl Sudirman"
    //ini adalah Nested Class(Defaul)
    class RuangRapat{
        fun mulaiRapat()
        {
            println("Rapat Dimulai")
          //  println("Rapat Di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val ruanganRapat=Gedung.RuangRapat()
    ruanganRapat.mulaiRapat()
}