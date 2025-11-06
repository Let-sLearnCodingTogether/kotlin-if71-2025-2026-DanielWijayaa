package nexOOP

import java.util.SplittableRandom

open class HewanBaru {
    open fun suara() {
        println("Suara Hewan")
    }
}

class Bebek() : HewanBaru() {
    override fun suara() {
        super.suara()
        println("Suara bebek : Kwej kwej")
    }
}
fun main()
{
    val hewan= Bebek()
    hewan.suara()
}