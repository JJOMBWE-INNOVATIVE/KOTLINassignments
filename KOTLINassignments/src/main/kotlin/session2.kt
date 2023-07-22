import kotlin.math.sqrt

fun main(){
// NUMBER 1
// Solve the equation x2+10x+25 = 0
// from the fomulat the variables were named ax2 + bx + c = 0
//FORMULAR x = (-b+-Sqrt(b2-4ac))/2a

//    val a = 1
//    val b = 10
//    val c = 25
//    val d = (b*b - 4*a*c).toDouble()
//    val e = sqrt(d)
//    val f = (-b+e)
//    val p = (-b-e)
//    val g = (f/2*a)
//    val q = (p/2*a)
//    val x = g
//    val z = q
//    println("The answer to x1 is ${x.toInt()} and x2 is ${z.toInt()}")


// NUMBER 2
// 2. A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
//  Find the time it will take to move a distance of 5km
// Hint - acceleration = speed/time
// speed = distance/time

// time = distance/speed
//val distanceinMeters = 5*1000
// val speed = 1000
// val time = (distanceinMeters/speed)
// val ans = time
//  print("The answer is $ans seconds")


// NUMBER 3

//   3. A person has four option of choosing between;
//    pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
//    if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
//    if cake, they'll go to cakely. Write
//    -a program using an if statement that captures the persons choice and prints the
//    selected restaurant
//            -same program using a when statement



    // IF STATEMENT

//    println("Enter the food you want to eat among pizza, chicken, pancakes or cake")
//    val foods = readln().toString()

//    if(foods== "chicken"){
//        println(" go to kfc")
//    } else if(foods== "pizza"){
//        println("go to pizza hut")
//    } else if(foods == "pancakes"){
//        println("go to foodhub")
//    } else if (foods== "cake"){
//        print("go to cakely")
//    } else{
//        print("Not on the menu")
//    }

    //WHEN STATEMENT
//    println("Enter the food you want to eat among pizza, chicken, pancakes or cake")
//    val food = readln()
//
//    when(food){
//        "chicken" -> println(" go to kfc")
//        "pizza" ->   println("go to pizza hut")
//        "pancakes" ->    println("go to foodhub")
//        "cake" -> print("go to cakely")
//        else -> print(" not on the menu")
   // }



// NUMBER 4

    //  Solve the equation x3+7x2+10x = 0
    //   X(X2 + 7X + 10) = 0
    // For x2 +7x + 10

//    val a = 1
//   val b = 7
//   val c = 10
//    val d = (b*b - 4*a*c).toDouble()
//   val e = sqrt(d)
//   val f = (-b+e)
//    val h = (-b-e)
//   val g = (f/2*a)
//    val i = (h/2*a)
//   val x = g
//    val y = i
//   println("The answer to x1 is ${x.toInt()} and x2 is ${y.toInt()}")
//    // so now from X(X2 + 7X + 10) = 0
//    println("x3 is 0")

//NUMBER 5

//    5. A person is moving to his village with a car moving at 20km/h and He has many
//            alternative routes.
//    If he uses route1, he'll move a distance of 5000km
//    If he uses route2, he'll move a distance of 25000km
//    If he uses route3, he'll move a distance of 50000km
//    If he uses another, he'll move a distance of 10000km
//
//    Find the time it will take him to reach the village using the separate routes
//    -using an if statement
//    -using a when statement

    // SOLUTION

    val speed = 20 //km/hr
    val route1 = 5000
    val route2 = 25000
    val route3 = 50000
    val another = 10000

// from time = distance/speed
    val timeforroute1 = route1/speed
    val timeforroute2 = route2/speed
    val timeforroute3 = route3/speed
    val timeforanother = another/speed

//    // IF STATEMENT
//    println("Enter which route time you want to know")
//    val time = readln()
//    if (time == "timeforroute1"){
//        println("it will take $timeforroute1 hours to reach the village")
//    }else if(time == "timeforroute2"){
//        println("it will take $timeforroute2 hours to reach the village")
//    } else if(time == "timeforroute3"){
//        println("it will take $timeforroute3 hours to reach the village")
//    } else if(time == "timeforanother"){
//        println("It will take $timeforanother hours to reach the village")
//    } else{
//        println("not part of the question")
//    }

    // WHEN STATEMENT

    println("Enter which route time you want to know")
      val time = readln()
    when(time){
        "timeforroute1" ->  println("it will take $timeforroute1 hours to reach the village")
        "timeforroute2" -> println("it will take $timeforroute2 hours to reach the village")
        "timeforroute3" -> println("it will take $timeforroute3 hours to reach the village")
        "timeforanother" -> println("It will take $timeforanother hours to reach the village")
        else ->  println("not part of the question")
    }












}