package topics

fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName() : String? {
    println("Input your name:")
    return readLine()
}

fun getAge() : Int? {
    println("Input your age:")
    return readLine()?.toInt()
}

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("User - $userName, $userAge year")
}