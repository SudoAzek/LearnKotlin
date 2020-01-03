fun main(args: Array<String>) {
    //Immutable variables
    val myName = "Azamat"
//    myName = "Azek" // Compile time error

    var myBirthDate = "17/02/1994"
    val myNewBirthDate = myBirthDate
    println(myNewBirthDate)

    //Mutable variables
    var myAge = 25
    myAge = 26    // works!
    println("My new age is $myAge")
}