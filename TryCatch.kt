

fun main(args:Array<String>)
{
    try {
        println("Enter No: ")
        var n1: Int = readLine()!!.toInt()
        var div = 100 / n1
        println(div)
    }catch(e:Exception) {
        println(e.message)
    }

}