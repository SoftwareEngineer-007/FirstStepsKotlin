package lesson_1

fun main() {

    val dish1 = Dish(
        id = 1,
        name = "Fried eggs",
        category = "Breakfast",
        ingredients = listOf("eggs", "tomato", "salt", "pepper"),
    )

    val dish2 = Dish(
        id = 2,
        name = "Noodle soup",
        category = "Lunch",
        ingredients = listOf("water", "hen", "noodles", "salt", "pepper"),
    )
/*
    println(dish1.name)
    println(dish1.ingredients)
    println(dish1.inFavorites)
    println()
    println(dish2.name)
    println(dish2.ingredients)
    println(dish2.inFavorites)


    dish1.category = "Eggs dishes"
    dish2.inFavorites = true
    println(dish1.category)
    println(dish2.inFavorites)
*/

    println("Action for the dish Scrambled eggs")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("Action for the dish Noodle soup")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)

}