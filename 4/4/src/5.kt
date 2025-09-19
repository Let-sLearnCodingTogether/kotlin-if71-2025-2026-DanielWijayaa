fun main() {
    val  users : Array<String> = arrayOf("User 1", "User 2", "User 3")
    print(users[0])
    println(users.get(1))
    users.set(2,"Usewr 3 Update")
    println(users.get(2))
    println("Size : ${users.size}")

}