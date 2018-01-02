
class UserAdmins<T,F>(credit:T,id:F){

    init {
        print(credit)
        println(" "+ id)
    }
}

fun main(args:Array<String>)
{
    var useradmins=UserAdmins<String,Int>("YO YO",23)
    var useradmins1=UserAdmins<Int,Double>(10,22.4)
    var useradmins2=UserAdmins<Double,Int>(44.6,10)


}