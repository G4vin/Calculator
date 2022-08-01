class Hesabu {
    //datamember
    var num1: Int = 210
    var num2: Int = 96

    //member function
    fun arithmetic():Int{
        return num1 + num2
    }
}

fun main(args: Array<String>) {
    //creating object
    val myobj = Hesabu()
    println(myobj.arithmetic())
}