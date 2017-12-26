//Dont need to define size in ArrayList. Linked List Type

fun main(args:Array<String>)
{
    var arrayList= ArrayList<String>()
    arrayList.add("Ayush")
    arrayList.add("Khanna")
    arrayList.add("Rockport")
    arrayList.add("ORG.")

    println("First element: "+arrayList.get(0))
    arrayList.set(0,"Aayush")

    for(i in arrayList)
        print("\n"+i)

    for(i in 0..arrayList.size-1)
        print("\n"+arrayList[i])

    //Search
    if(arrayList.contains("Khanna"))
        println("Name Found")
    else
        println("Not found")

}