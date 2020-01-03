fun main(args: Array<String>) {
    var a = 30
    var b = 40
    a += b
    println(a)
    a -= b
    println(a)
    a *= b
    println(a)
    a /= b
    println(a)
    a %= b
    println(a)

    var e = 10
    var flag = true
    println("First print the value then increment: " + e++)
    println("First increment the value then print: " + ++e)
    println("First print the value then decrement: " + e--)
    println("First decrement the value then print: " + --e)
}