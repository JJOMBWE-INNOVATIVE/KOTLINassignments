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