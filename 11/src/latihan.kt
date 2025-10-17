import javax.print.attribute.standard.PrinterLocation

class Player(
    val name: String,
    var health: Int = 100,
    var level: Int = 1
) {

    
    fun takeDamage(damage: Int) {

        health = health - damage
        println("health Anda Tinggal :  $health")
        if (health < 0) {
            println("Anda Lose Bro")
        }
    }

    fun levelUp() {
        level++
        health = 100
        println("Anda Naik Level karena mengalahkan Musuh, health anda $health")
    }

    fun showStatus() {
        println("Nama anda : $name")
        println("health anda : $health")
        println("Level Anda : $level")
    }


}


fun main() {
    val player = Player(
        "Daniel wijaya"
    )
    println("====================================================================================")
    println(player.name)
    println("====================================================================================")
    player.showStatus()
    println("====================================================================================")
    player.takeDamage(30)
    println("====================================================================================")
    player.levelUp()
    println("====================================================================================")
    player.showStatus()
}