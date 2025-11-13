package nextOOP

interface PaymenMethod {
    fun pay()
}
interface Refund : PaymenMethod{
    fun refund()
}
class payment : Refund{
    override fun refund() {
        println("Refund")
    }

    override fun pay() {
        println("Pay")
    }

}

fun main() {
    val payment= payment()
    payment.pay()
    payment.refund()
}