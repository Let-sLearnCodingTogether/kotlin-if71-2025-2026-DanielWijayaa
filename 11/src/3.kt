package OOP

import java.util.SplittableRandom


fun main() {
    val person = object {
        val name= "NAMA"
        fun greet() : String{
            return "Hello $name"
        }

    }
    println(person.name)
}