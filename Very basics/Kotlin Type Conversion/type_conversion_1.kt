fun main(args: Array<String>) {
    var myNumber = 100
    var myLongNumber:Long = myNumber.toLong()

    /*The following helper function can be used to convert one data type into another:
    * toByte()
    * toShort()
    * toInt()
    * toLong()
    * toFloat()
    * toDouble()
    * toChar()
    *
    * There is NO helper function available to convert into boolean type.
    * */

    // Conversion from larger to smaller data type -

    var myLongNumber2 = 10L
    var myNumber2:Int = myLongNumber2.toInt()
    println(myNumber2)
}