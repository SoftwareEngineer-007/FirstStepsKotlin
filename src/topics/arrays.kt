package topics

fun main() {

    val arrayOfCars: Array<String> = arrayOf("BMW", "Audi", "VW", "Honda", "Subaru")

    val intArray1: IntArray = intArrayOf(4, 5, 6)
    val charArray1: CharArray = charArrayOf('4', '5', '6')

    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(5, 4, 3, 2, 1)

/*
    println("Size of array - ${arrayOfCars.size}")

    println(arrayOfCars[1])
    println(arrayOfCars[3])
    println(arrayOfCars[7]) //error
*/

    arrayOfCars.set(2, "Toyota")
    arrayOfCars.get(2)

    for (i in arrayOfCars) {
        println("Auto ${arrayOfCars.indexOf(i) + 1}: $i")
    }


}