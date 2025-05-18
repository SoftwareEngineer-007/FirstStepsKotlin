package topics

fun main() {

    var counter = 5
/*
    while (counter > 0) {
        println("The ad will end in ${counter--}")
        Thread.sleep(1000)
    }
    println("The ad is over")
*/

    do {
        println("The ad will end in ${counter--}")
        Thread.sleep(1000)
    } while (counter > 0)
}