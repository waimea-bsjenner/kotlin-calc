import kotlin.math.pow

fun main() {
    println("Welcome to the Ben-culator, a lovely calculator for all of your calculating purposes and needs.")
    var double1 = getDouble("Enter the first number  ")
    var operator: Char
    while (true) {
        operator = getString("enter an operator (+, -, /, *, ^, !) ").first()
        if  ("+-*/^!".contains(operator)) break
    }
    if (operator == '!')  {
        var factorial = 1.0
        while (double1 > 1) {
            factorial *= double1
            double1--
        }
        println("$double1! = $factorial")
    }
    else {
        val double2 = getDouble("Enter the second number ")
        var result = 0.0
        if (double1 == 0.0 && double2 == 0.0 && operator == '^') {
            println("0 ^ 0 = 0 you muffin")
        }

//        if (operator == '+') {
//            result = double1 + double2
//        }
//        else if (operator == '-') {
//            result = double1 - double2
//        }
//        else if (operator == '*') {
//            result = double1 * double2
//        }
//        else if (operator == '/') {
//            result = double1 / double2
//        }
//        else if (operator == '^') {
//            result = double1.toDouble().pow(double2.toDouble())
//        }
//        else {
//            result = 0.0
//        }

        else {
            result = when (operator) {
                '+' -> double1 + double2
                '-' -> double1 - double2
                '*' -> double1 * double2
                '/' -> double1 / double2
                '^' -> double1.pow(double2)
                else -> 0.0
            }
            println("$double1 $operator $double2 = $result")
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

fun getDouble(prompt: String): Double {
    var doubleValue: Double?

     while (true) {
        val userInput = getString(prompt)
        doubleValue = userInput.toDoubleOrNull()
        if (doubleValue != null) break
    }

    return doubleValue!!
}