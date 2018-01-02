

fun ArrayList<String>.swap(index1:Int,index2:Int)   //we created a function swap as it is not in kotlin inbuilt function list
{                                                   //and then later use it in main class
    var temp= this.get(index1)
    this.set(index1,this.get(index2))
    this.set(index2,temp)
}

fun main(args:Array<String>)
{
    var arraylist=ArrayList<String>()
    arraylist.add("Ayush")
    arraylist.add("Toto")
    arraylist.add("Nonu")
    arraylist.swap(0,1)
    println(arraylist)
}