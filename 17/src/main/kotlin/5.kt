package nexOOP

import kotlin.math.hypot

sealed class HasilOperasi()
{
    data class Succes(val message : String): HasilOperasi()
    data class Error(val message: String): HasilOperasi()
    object Loading : HasilOperasi()
}

fun Proccess(hasilOperasi: HasilOperasi)
{
    when(hasilOperasi)
    {
        is HasilOperasi.Loading-> println("System Loading")
        is HasilOperasi.Succes -> println(hasilOperasi.message)
        is HasilOperasi.Error->println(hasilOperasi.message)
    }
}

fun main() {
    Proccess(HasilOperasi.Loading)
    Proccess(HasilOperasi.Succes("Succes Message"))
    Proccess(HasilOperasi.Error("Error Message"))
}