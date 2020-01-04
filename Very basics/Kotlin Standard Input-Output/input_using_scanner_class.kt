import java.util.*

fun main(args: Array<String>) {
    // create an object for scanner class
    val scanner = Scanner(System.`in`)
    print("Enter an integer: ")
    // nextInt() method is used to take next integer value and store in enteredNumber1 variable
    var enteredNumber1:Int = scanner.nextInt()
    println("You entered: $enteredNumber1")

    val scanner2 = Scanner(System.`in`)
    print("Enter a float value: ")

    // nextFloat() method is used to take Float value and store in enteredNumber2 variable

    var enteredNumber2:Float = scanner2.nextFloat()
    println("You entered: $enteredNumber2")

    val booleanValue = Scanner(System.`in`)
    print("Enter a boolean: ")

    // nextBoolean() method is used to take next boolean value and store in enterBoolean variable

    var enteredBoolean:Boolean = booleanValue.nextBoolean()
    println("You entered: $enteredBoolean")
}