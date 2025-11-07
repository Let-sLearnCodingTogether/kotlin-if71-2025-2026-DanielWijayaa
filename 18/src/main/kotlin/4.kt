enum class dayOfTheWeek2(val isWeekend: Boolean){
    Senin(false),
    Selasa(true),
    Rabu(false),
    Kamis(false),
    Jumat(false),
    Sabtu(false),
    Mingg(false)
}

fun main() {
    val Day= dayOfTheWeek2.Jumat
    println("Hari ini hari : ${Day.name} dan hari ini hari libur ${Day.isWeekend}")
}