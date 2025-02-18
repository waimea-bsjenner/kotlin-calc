fun main() {
    println("Welcome to the Ben-culator, a lovely calculator for all of your calculating purposes and needs.")
    val float1 = getFloat("Enter the first number")
}

fun getFloat(prompt: String): Float {
    var floatValue: Float?
    while (true) {
        val userInput = getFloat(prompt)
        floatValue = userInput.toFloatOrNull()
        if (floatValue != null) break
    }

    return floatValue!!
}