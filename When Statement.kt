

fun main(args:Array<String>) {

    println("Enter Value b/w 1-40")
    var x = readLine()!!.toInt()

    when (x)
    {
        1,2-> println("Value is 1 or 2")
        in 10..30-> println("Value is in b/w 10 and 30")
        !in 0..30-> println("Value is more than 30")
        else-> println("Value is not in range")
    }
}