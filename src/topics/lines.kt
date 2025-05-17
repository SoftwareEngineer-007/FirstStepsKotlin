package topics

fun main() {

    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    // concatenation
    println(greeting + ", " + userName + "!" + space + "Input your request: ")

    //interpolation
    println("$greeting, $userName! Input your request: ")


    val multiString = """
                          qwrewrrwe
             rwerwerwer
                    werwerwerwerew
    """.trimIndent()
    println(multiString)


    var phrase = "And he said - \"it is magnificent!\""
    println(phrase)

}