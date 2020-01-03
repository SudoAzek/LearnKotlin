fun main(args: Array<String>) {
    var a = 100
    var b = 25
    var c = 10
    var result = false

    if (a > b && a > c)
        println(a)
    if (a < b || a > c)
        println(b)
    if (result.not())
        println("Logical operators")

    /* Bitwise Operators
    shl - signed shift left - a.shl(b)
    shr - signed shift right - a.shr(b)
    ushr - unsigned shift right - a.ushr()
    and - bitwise and - a.and(b)
    or - bitwise or - a.or()
    xor - bitwise xor - a.xor()
    inv - bitwise inverse - a.inv()
     */

    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bit: " + 10.shr(2))
    println("12 unsigned shift right by 2 bit: " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())

}