// Calling of function
// fun main(){
    // function call
    //food()
   // itswell()

//    println("Enter first number")
//    val firstnumber = readln().toInt()
//    println("Enter second number ")
//    val secondnumber = readln().toInt()
//
//    //addtwonumbers(firstnumber,secondnumber)
//}

// fun addtwonumbers(a:Int,b:Int){
//     val x = a + b
//     println(x)
//
// }

//fun food(){
//    println("eat this food")
//}
//fun itswell(){
//    println("Because you believed")
//}

// USING OF RETURN FUNCTION
//fun main(){
//    println("Enter first number")
//    val firstnumber = readln().toInt()
//    println("Enter second number ")
//    val secondnumber = readln().toInt()
//
//    val answer =  addtwonumbers(firstnumber,secondnumber)*100
//
//    println("The sum of  $firstnumber and $secondnumber is $answer ")
//}
//fun addtwonumbers(a:Int,b:Int):Int{
//    val x = a + b
//    return(x)
//
//}

// LAMBDA

fun main(){
    //val add = {a:Int -> println(a) }
    //add(5)

    val threenumbers = {a:Int,b:Int,c:Int -> a+b+c}
    val ans = threenumbers(3,3,3)
    print(ans)
}



