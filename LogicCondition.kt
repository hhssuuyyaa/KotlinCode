fun main(args:Array<String>)
{
    println(3<5)
    println(6==6)
    println(5!=5)
    println(3<5 && 3>8)
    // now we will check if our no is in b/w 0-10 or not

    var n:Int=10
    println(n>=0 && n<=10)          //and gate

    var n1:Int=45
    println(n>30 || n<40)           //or gate

    var n2:Boolean=true             //Boolean either takes true or take false as value
    print(!n2)                      //not gate
}