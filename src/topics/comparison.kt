package topics

fun main() {

    val userAge = 66
    val comparisonResult: Boolean = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    val result = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE
    println("Result is: $comparisonResult")
    println(result)

}

// const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65