fun main(args: Array<String>) {

    // readLine()!! take the input as a string and followed by (!!) to ensure that the input value is not null
    print("Enter an Integer value: ")
    val str1 = readLine()!!

    // .toInt() function converts the string into Integer
    var intVal: Int = str1.toInt()
    println("You entered: $intVal")

    print("Enter a double value: ")
    val str2 = readLine()!!

    // .toDouble() function converts the string into Double
    var doubleVal: Double = str2.toDouble()
    println("You entered: $doubleVal")
}