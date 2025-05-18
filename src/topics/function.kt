package topics

fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName() : String? = readLine()

fun getAge() : Int? = readLine()?.toInt()

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("User - $userName, $userAge year")
}