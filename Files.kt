import java.io.FileWriter

fun main(args:Array<String>)
{
    file("Toto")
}

fun file(str:String)
{
    try {
        var fo = FileWriter("file.txt",true)
        fo.write(str + "\n ")
        fo.close()
    }catch(ex:Exception)
    {
        println(ex.message)
    }
}