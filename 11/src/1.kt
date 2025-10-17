package OOP

    object DatabaseConnection{
        fun connect()
        {
            println("Connecting to Database")
        }
        fun Disconnect()
        {
            println("Disconnecting to Database")
        }
    }


fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.Disconnect()
}