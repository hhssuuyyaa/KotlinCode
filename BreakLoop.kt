

fun main(args:Array<String>)
{
   loop@ for(count in 1..10)
    {
        for(count2 in 1..5)
        {
            println("Count : $count")
            if(count2==2)
                break@loop   //break will take control out of inner loop only
        }               //if we want to break outer loop then we will gave label


    }

}