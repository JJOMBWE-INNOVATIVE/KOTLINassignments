fun main(){

    // number 1

    val myList = mutableListOf(89, 45, 23, 5, 67, 12, 55, 89, 54, 55)
    val ascending = myList.sorted()
    val decending = myList.sortedDescending()
    println(ascending)
    println(decending)

    // number 2
    val groupA = mutableListOf("a", "b", "c", "d", "e" , "a", "g", "r","f")
    val groupB = mutableListOf("ant", "bee", "elephant", "dog", "cat")

    val map = groupA.zip(groupB).toMap().toMutableMap()
    println("The map is $map")

    // number three
    map['z'.toString()] = "Zebra"
    map['h'.toString()] = "hen"
    map['r'.toString()] = "rat"
    map['g'.toString()] = "goat"
    map['p'.toString()] = "pigeon"

    println("the map presents$map")











}
