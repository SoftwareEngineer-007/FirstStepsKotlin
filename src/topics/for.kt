package topics

fun main() {

    val range1: IntRange = 42..224
    val range2: IntRange = 42 until 224
    val range3: LongRange = 42L..224L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..224.1
    val range6: ClosedRange<Float> = 42.1f..224.1f
    val range7: IntProgression = 42..224 step 2
    val range8: IntProgression = 224 downTo 42 step 2

    // in, !in

    val a = 50 in range1
    val b = 50 !in range1

//    println(a)
//    println(b)

    // for

    for (i in 5 downTo 1){
        if(i == 3) {
            println("The user pressed the \"Skip\" button")
            break
        }
        println("The ad will end in $i")
        Thread.sleep(1000)
    }
    println("The ad is over")


//    for (i in range2 step 8) {
//        println(i)
//    }
}