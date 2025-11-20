package interoperability

fun main() {
    val user= UserClass()
    user.name="User 1"
    println(user.name)
    val test= tiga()
    test.increment()
    println(test.increment())
}