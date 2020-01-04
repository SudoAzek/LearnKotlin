fun sum(a: Int, b: Int) : Int {
    return a + b
}

fun main(args: Array<String>) {
    print("Hello. ")
    println("This is my first Kotlin Project!")

    println("Azamat")
    println("Ochilov")

    print("Azamat - ")
    print("Ochilov")

    var a = 10
    var b = 20
    var c = 30L
    var marks = 40.4

    println("Sum of {$a} and {$b is : ${sum(a, b)}")
    println("Long value is: $c")
    println("marks")
    println("$marks")

    print("Enter text: ")
    var input = readLine()
    print("You entered: $input")
}