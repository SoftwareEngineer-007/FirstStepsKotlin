package topics

fun main() {

    println("Enter you age: ")

    val userAge = readln().toInt()
/*
    if (userAge >= AGE_OF_MAJORITY) {
        println("Welcome! You are over 18 years old")
    }

    if (userAge < AGE_OF_MAJORITY) {
        println("DANGER! You are not 18 years old")
    }
*/

    /*
    if (userAge >= AGE_OF_MAJORITY) {
        println("Welcome! You are over 18 years old")
    } else if (userAge == 16 || userAge == 17) {
        println("You need to grow up a little")
    }
    else  {
        println("DANGER! You are not 18 years old")
    }
    */

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Welcome! You are over 18 years old"
    } else if (userAge == 16 || userAge == 17) {
        "You need to grow up a little"
    }
    else  {
        "DANGER! You are not 18 years old"
    }
//    println(resultText)

    val consolNumber = when(userAge) {
        10 -> "You number is 10"
        20 -> "You number is 20"
        30 -> "You number is 30"
        else -> "Another number"
    }
    println(consolNumber)

}

const val AGE_OF_MAJORITY = 18