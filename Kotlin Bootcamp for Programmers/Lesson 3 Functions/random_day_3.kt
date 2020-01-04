import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    return true
}

fun shouldChangeWater2(
    temperature: Int = 22,
    dirty: Int = 20,
    day: String
) {

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }

    swim(50, speed = "slow")
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"

    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}
