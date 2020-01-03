fun main(args: Array<String>) {

    if(true is Boolean) {
        println("Yes, true is a boolean value")
    }

    var alphabet: Char = 'C'
    println("C is a character : ${alphabet is Char}")
}