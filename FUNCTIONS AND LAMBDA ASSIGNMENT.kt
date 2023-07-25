//QUESTION
//write a function that has three parameters; two doubles and one character
//(*, +, -, /) and checks if third parameter
// == *, it will multiply the two doubles
// == +, it will add the two numbers
// == -, it will subtract the two numbers
// == /, it will divide the two numbers    

//ANSWER

fun main(){
    println("Enter first num")
    val fistnumber = readln().toDouble()

    println("Enter a character *,+,-,/")
    val sign = readln().first() // Read the first character of the input as Char

    println("Enter second num")
    val secondnumber = readln().toDouble()

    val ans =  Twonumbers(fistnumber,secondnumber,sign)
    print(ans)

}
fun Twonumbers(a:Double, b:Double,sign:Char):Double {
    if (sign == '*') {
        return a * b
    } else if (sign == '+') {
        return a + b
    } else if (sign == '-') {
        return a - b
    } else if (sign == '/') {
        return a / b
    } else {
        println("Invalid syntax")
        return 0.0
    }

}
