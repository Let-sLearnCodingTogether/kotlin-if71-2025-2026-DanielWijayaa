fun main() {
    val arrayByte : ByteArray =byteArrayOf(125,127,126)
    val arrayShort : ShortArray = shortArrayOf(12,343,41)
    val arrayInt : IntArray= intArrayOf(1,2,3)
    val ArrayLong : LongArray= longArrayOf( 1L,2L,3L)
    val ArrayFloat : FloatArray= floatArrayOf(1.3f,1.4f)
    val arrayDouble : DoubleArray = doubleArrayOf(3.4,5.4)
    val arrayChar : CharArray = charArrayOf('a','b')
    val arrayBoolean : BooleanArray =booleanArrayOf(true,false)

    arrayByte.forEach {
        println(it)
    }
    println(arrayByte[1])
}