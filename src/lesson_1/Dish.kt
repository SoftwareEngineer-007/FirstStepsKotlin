package lesson_1

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {

    fun addToFavorites() {
        println("The dish $name has been added to favorites")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("The dish $name has been removed from favorites")
        inFavorites = false
    }

    fun startCooking() {
        println("Go to the $name cooking screen")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }

}