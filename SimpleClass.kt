class Car(Type:String,Model:Int,Price:Double,Miles:Int,Owner:String)
{
    var Owner:String?=null
    var Price:Double?=null
    var Miles:Int?=null        //null means if it isnt specified then it is null by default
    init
    {
        println("Type is $Type")
        println("Model is $Model")
        println("Price is $Price")
        println("Miles is $Miles")
        println("Owner is $Owner")
        this.Owner=Owner        //here this refers to class car's Owner
        this.Price=Price
        this.Miles=Miles
    }                           //it can also be called via Car.Owner
    fun GetPrice():Double?
    {
        return this.Price!! -(this.Miles!!.toDouble())     //as price in double and miles in int
    }
    fun GetOwner():String?
    {
        return this.Owner
    }
}

fun main(args:Array<String>)
{
    var mycar= Car("BMW",2010,6500.56,234,"Ayush")
    println("New Owner is "+mycar.GetOwner())
    println("New Price is "+mycar.GetPrice())
}
