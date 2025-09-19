fun main() {
    val  hari : Array<String> = arrayOf("senin", "selasa", "rabu","kamis","jumat","sabtu","minggu")
    println("jumlah Hari ${hari.size}")
    println("hari pertama ${hari.get(0)}")
    println("hari kedua ${hari.get(1)}")
    println("hari ketiga ${hari.get(2)}")
    println("hari keempat ${hari.get(3)}")
    println("hari kelima ${hari.get(4)}")
    println("hari keenam ${hari.get(5)}")
    println("hari ketujuh ${hari.get(6)}")
    hari.set(4,"jumat barokah")
    println("hari kelima ${hari.get(4)}")



}