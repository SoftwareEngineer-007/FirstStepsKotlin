package topics

fun main() {

    val a = 7
    val b = 4
    val sum = a + b

    println(a + b)
    println(sum)


    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2)

    val floatNum1: Float = 10.0f
    val floatNum2: Float = 3f
    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)


    val c = intNum1 + floatNum1
    println(c)
    println(c::class.java.simpleName)

    val c1 = intNum1 + floatNum1 + doubleNum1
    println(c1)
    println(c1::class.java.simpleName)


    var counter = 0

    counter = counter + 1
    counter +=1
    counter ++


}