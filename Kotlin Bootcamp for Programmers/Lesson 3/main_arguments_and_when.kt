import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"

    })
}