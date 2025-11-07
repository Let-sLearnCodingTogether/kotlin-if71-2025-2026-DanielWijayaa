enum class dayOfTheWeek3(val isWeekend: Boolean=false){
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Mingg(true);

    fun dayUntil(targetHari:dayOfTheWeek3): Int
    {
        return if (this.ordinal < targetHari.ordinal)
        {
            targetHari.ordinal-this.ordinal
        }
        else
        {
            targetHari.ordinal-(this.ordinal+dayOfTheWeek3.values().count())
        }
    }


}

fun main() {
    val Target=dayOfTheWeek3.Senin
    println(Target)
    println(Target.dayUntil(dayOfTheWeek3.Sabtu))

}