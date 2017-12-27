

fun main(args:Array<String>)
{
    var map=hashMapOf(1 to "Ayush",2 to "Khanna")
    map.put(3,"KING")
    println(map[3])
    println(map.get(3))

    var ar=arrayOf(10,30,20,40)
    println(ar[3])

    var list=listOf(10,22,33,44)       //Linked List
    for(i in list)
        println(i)

    var list1= mutableListOf(10,22,33,44)       //In this type, value can be changed after initiliazation
    list1[0]=11
    for(i in list1)
        println(i)

    var set=setOf(10,20,30,30,40)       //repeated elements are only added once
    for(i in set)                       //also we cant add more elements in set as they are immutable
        println(i)                      //we can define mutableSetOf() for mutable sets
}