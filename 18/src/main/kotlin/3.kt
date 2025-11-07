enum class dayOfTheWeek{
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = dayOfTheWeek.values()
    days.forEach {
        println("${it.ordinal+1}. ${it.name}")
    }
    println(dayOfTheWeek.valueOf("Senin"))
    val today=dayOfTheWeek.valueOf("Senin")
//    println(dayOfTheWeek.valueOf("Senin"))
    when(today)
    {
        dayOfTheWeek.Senin->println("Yah Senin")
        else-> println("Hari ini bukan senin")
    }
}