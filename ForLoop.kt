

fun main(args:Array<String>)
{

    for(count1 in 1..5)
    {
        if(count1==4)
        print("Count1 : $count1 \n")
        for(count2 in 1..9)
        {
            if(count2==7)
                println("Count2 : $count2")
        }
    }
    println("Looping Done")
}

/* O/p -
Count2 : 7
Count2 : 7
Count2 : 7
Count1 : 4
Count2 : 7
Count2 : 7
Looping Done */