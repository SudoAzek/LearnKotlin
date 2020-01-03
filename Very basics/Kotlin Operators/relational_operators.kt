fun main(args: Array<String>) {
    var a = 30
    var b = 40

    println("a > b = " + (a > b))
    println("a > b = " + (a.compareTo(b) > 0))
    println("a < b = " + (a < b))
    println("a < b = " + (a.compareTo(b) < 0))
    println("a >= b = " + (a >= b))
    println("a >= b = " + (a.compareTo(b) >= 0))
    println("a <= b = " + (a <= b))
    println("a <= b = " + (a.compareTo(b) <= 0))
    println("a == b = " + (a == b))
    println("a == b = " + ((a?.equals(b) ?: (b === null))))
    println("a != b = " + (a != b))
    println("c != d = " + (!(a?.equals(b) ?: (b === null))))
}