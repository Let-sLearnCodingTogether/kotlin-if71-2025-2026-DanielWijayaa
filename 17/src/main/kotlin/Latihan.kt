package nexOOP

open class Pegawai(val nama: String,val Gaji_dasar: Double)
{
    open fun hitungGaji()
    {
        val gaji= Gaji_dasar*30
        println("Nama Anda adalah $nama")
        println("Gaji anda adalah $gaji")
    }
}
open class Manager(nama: String,Gaji_dasar: Double): Pegawai(nama,Gaji_dasar)
{
    override fun hitungGaji() {
        super.hitungGaji()
    }
}
open class Programmer(nama: String,Gaji_dasar: Double): Pegawai(nama,Gaji_dasar)
{
    override fun hitungGaji() {
        super.hitungGaji()
    }
}

fun main() {
    val program1=Programmer("DanielWijaya",90000.00)
    val manager=Manager("Lazu",1000000000.00)
    val listPegawai= mutableListOf<Pegawai>(program1,manager)
    listPegawai.forEach { it.hitungGaji() }


    val list1=mutableListOf<Programmer>(Programmer("DanielWijaya",2000.00), Programmer("Lazu",100.00))
    val list=mutableListOf<Pegawai>(Programmer("DanielWijaya",2000.00), Programmer("Lazu",100.00))
    val list3=mutableListOf<Pegawai>(Manager("dawi",11.00), Programmer("cewek",90))
    list.forEach { it.hitungGaji() }
    list1.forEach { it.hitungGaji() }
//    for(a in list)
//    {
//        a.hitungGaji()
//    }
//    for(b in list1)
//    {
//        b.hitungGaji()
//    }

}