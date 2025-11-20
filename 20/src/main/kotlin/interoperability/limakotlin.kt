package interoperability

import javax.annotation.processing.Messager

class Logger
{
    @JvmOverloads
    fun log(message: String,level: String="info")
    {
        println("$level $message")
    }
}