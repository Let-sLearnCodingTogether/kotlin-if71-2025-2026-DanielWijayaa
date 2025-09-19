fun main() {
    val isLoggedIn= false
    if(isLoggedIn || (5/0==0))
    {
        println("User has Access")
    }
    else
    {
        println("access Denied")
    }
}