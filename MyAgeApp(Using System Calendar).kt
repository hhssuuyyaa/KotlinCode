import java.util.*

fun main(args:Array<String>)
{
    //*****INPUT*****
    print("Enter Your Birth Year: ")
    var DOB:Int=readLine()!!.toInt()

    //*****PROCESS*****
    var Year= Calendar.getInstance().get(Calendar.YEAR)
    var Age= Year-DOB

    //*****OUTPUT*****
    println("Your Age is $Age years")
}
