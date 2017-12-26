

fun main(args:Array<String>)
{
    var arrayInt= Array<Int>(5){0}
    arrayInt[3]=69
    println(arrayInt[3])

    println("All Array elements are: ")
    for(i in arrayInt)
        print(i)
    print("\n")
    for(i in 0..4)
        print(arrayInt[i])

    var arrayStr=Array<String>(4){""}
    for(i in 0..3)
    {
        println("\nEnter Element for $i:")
        arrayStr[i]= readLine()!!
    }
    for(i in 0..3)
        println("Elements are: " +arrayStr[i])
}