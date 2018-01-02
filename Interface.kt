interface op{
    fun sum(n1:Int,n2:Int) {println(n1+n2)
        println("Nothing Passed")}   //no need to write open as interface is by default open
    fun div(n1:Int,n2:Int) {println(n1/n2)}
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int) {
        println(n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println(n1/n2)
    }

}

class AdminOp:op {
    override fun sum(n1: Int, n2: Int) {
        println(n1 + n2 - 2)
    }

    override fun div(n1: Int, n2: Int) {
        println(n1 / n2 - 2)
    }
}

class ManagerOp:op{}

fun main(args:Array<String>){

    var adminop=AdminOp()
    adminop.sum(10,20)
    var managerop=ManagerOp()
    managerop.sum(30,40)
    var userop=UserOp()
    userop.div(20,10)
}