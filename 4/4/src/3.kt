fun main() {
    var finaExam='A'
    val nilaarray=
    when(finaExam)
    {
        'A','B' ->println("lulus")
        'C'->println("lulus")
        'D'->println("YAhahaha gak lulus")
        else->{
            println("kamu DO")
        }
    }



    when{
        finaExam =='A' || finaExam=='B'-> println("Lulus")
        else-> println("tidakLulus")
    }
    when (finaExam)
    {
        is Char -> println("ya anda char")
        is String-> println("ya anda String ")
    }

}