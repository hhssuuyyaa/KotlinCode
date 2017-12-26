

fun main(args:Array<String>)
{
    var map=HashMap<Int,String>()  //where Int is key and String is value
    map.put(1,"Ayush")
    map.put(2,"Khanna")
    map.put(3,"Toto")
    print(map.get(3))

    map.put(3,"Totoooo")

    for(i in map.keys)
    {
        println(map.get(i))
    }

}
//In hashmap we use key to identify object. Used alot in Android