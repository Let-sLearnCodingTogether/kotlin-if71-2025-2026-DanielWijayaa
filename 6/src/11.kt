fun String.greeting(): String
{
    return "Hello, $this"
}
fun Int.isEven(): Boolean
{
    return this%2==0
}

fun main() {
    val username: String="Daniel"
    val age1:Int=25
    println(username.greeting())
    println(age1.isEven())
}