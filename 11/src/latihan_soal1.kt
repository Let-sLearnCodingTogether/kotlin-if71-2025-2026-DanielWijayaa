
fun hitungIpk(list: List<Double>): Double {
    val mencariNotNull = list.filterNotNull()

    if (mencariNotNull.isEmpty()) {

        return 0.0
    }
    return list.filterNotNull().average()



}

fun main() {
    val nilaiSemester1 = listOf<Double?>(4.0,2.0,3.5, null)
    val ipk1 =hitungIpk(nilaiSemester1 as List<Double>)
    println("Ipk Semester 1: $ipk1")

    val nilaiSemester2 = listOf<Double?>( null,null,null)
    val ipk2 =hitungIpk(nilaiSemester2 as List<Double>)
    println("Ipk Semester 2: $ipk2")
}