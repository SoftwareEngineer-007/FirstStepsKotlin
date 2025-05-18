package topics

fun main() {

    val list: List<Int> = listOf(2, 2, 4)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)

    val mutableList = mutableListOf(11, 22, 34, 56, 6, 78)
    println(mutableList)

    mutableList.add(44)
    println(mutableList)

    mutableList.add(0, 3)
    println(mutableList)

    println(mutableList.contains(44))

    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())

    mutableList.sort()
    mutableList.sortDescending()
    mutableList.reverse()

    mutableList.forEach {
        println(it)
    }

}