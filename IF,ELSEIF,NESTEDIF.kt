

fun main(args:Array<String>)
{
    print("Enter your marks")
    var marks= readLine()!!.toDouble()

    if(marks>90)
    {
        if(marks>93)
            println("GRADE A+")
        else
            println("Grade A-")
        println("You Havs Scored A Grade")
        marks=marks+3
    }
    else if(marks>=80 && marks<90)
    {
        println("You Have Scored B Grade")
    }
    else if(marks>=50 && marks<=70)
    {
        marks=marks+7
        println("You Have Scored C Grade")
    }
    else
    {
        println("You Failed")
    }
    println("Your Entered Marks is $marks")
}