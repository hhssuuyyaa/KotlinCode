import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>)
{
    println("Enter 1 for Read and 2 for Write")
    var ch=readLine()!!.toInt()
    when(ch){
        1-> readfile()
        2->     {
                    println("Enter text you want to write")
                    var str1:String=readLine().toString()
                    writefile(str1)
                }
            }
}

fun writefile(str:String)
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

fun readfile()
{
    try{
        var fin=FileReader("file.txt")
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        }while(c!=-1)

    }catch(ex:Exception)
    {
        println(ex.message)
    }
}