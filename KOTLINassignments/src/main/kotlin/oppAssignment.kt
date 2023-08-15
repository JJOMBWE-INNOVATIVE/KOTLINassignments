
//4.//Create a class Color having attributes name, symbol and hex code and
//		// a function that returns the three attributes as a string
//
//		//Create a class Rainbow that inherits from Color and modifies the function in
//		//class Color to return all the colors of a rainbow and prints the output




open class Color(val name: String, val symbol: String, val hexCode: String) {
    open fun getcolor(): String {
        return "Name: $name, Symbol: $symbol, Hex Code: $hexCode"
    }
}

class Rainbow : Color("Rainbow", "R", "#000000") {
    val rainbowColors = listOf(
        Color("Red", "R", "#FF0000"),
        Color("Orange", "O", "#FFA500"),
        Color("Yellow", "Y", "#FFFF00"),
        Color("Green", "G", "#00FF00"),
        Color("Blue", "B", "#0000FF"),
        Color("Indigo", "I", "#4B0082"),
        Color("Violet", "V", "#EE82EE")
    )

    override fun getcolor(): String {
        var colors = ""
        for (color in rainbowColors) {
            colors += color.getcolor()
        }
        return colors
    }
}

fun main() {
    val color = Color("Red", "R", "#FF0000")
    println(color.getcolor())

    val rainbow = Rainbow()
    println(rainbow.getcolor())
}

