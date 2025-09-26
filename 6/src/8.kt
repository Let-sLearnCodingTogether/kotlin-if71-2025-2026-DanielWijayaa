//fun Mutiple(firstNumber: Int, secondNumber: Int):Int
//{
//    return firstNumber*secondNumber
//}
//fun main() {
//    val a=Mutiple(5,10)
//    print(a)
//}

fun perkalian(firstNumber:Int,secondNumber:Int):Int = firstNumber * secondNumber

fun main(){
    println("Hasil Perkalian : ${perkalian(1,2)}")

    val result = perkalian(1,2)
    println("Hasil Perkalian : $result")
}