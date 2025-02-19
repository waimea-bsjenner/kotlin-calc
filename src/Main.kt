import kotlin.math.pow

fun main() {
    println("Welcome to the Ben-culator, a lovely calculator for all of your calculating purposes and needs.")
    var float1 = getFloat("Enter the first number  ")
    var operator: Char
    while (true) {
        operator = getString("enter an operator (+, -, /, *, ^, !) ").first()
        if  ("+-*/^!".contains(operator)) break
    }
    if (operator == '!')  {
        var factorial: Float
        while (float1 > 1) {
            factorial = (float1 * (float1--))
            float1--
        }
        println("$float1! = $factorial")
    }
    else {
        val float2 = getFloat("Enter the second number ")
        if (operator == '+') {
            val result = float1 + float2
            println("$float1 + $float2 = $result")
        }
        if (operator == '-') {
            val result = float1 - float2
            println("$float1 - $float2 = $result")
        }
        if (operator == '*') {
            val result = float1 * float2
            println("$float1 x $float2 = $result")
        }
        if (operator == '/') {
            val result = float1 / float2
            println("$float1 / $float2 = $result")
        }
        if (operator == '^') {
            val result = float1.toDouble().pow(float2.toDouble())
            println("$float1 ^ $float2 = $result")
        }
    }

}

fun getString(prompt: String): String {
    var userInput: String

    while (true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}

fun getFloat(prompt: String): Float {
    var floatValue: Float?

     while (true) {
        val userInput = getString(prompt)
        floatValue = userInput.toFloatOrNull()
        if (floatValue != null) break
    }

    return floatValue!!
}