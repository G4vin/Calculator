//superclass
open class Parent {
    var num1 = 64
    var jina = "Gavin"
    var car = "Toyota Supra"
}
class child1: Parent(){
    fun display(){
        println("My number is $num1")
    }
}
class child2: Parent(){
    fun display(){
        println("My name is $jina")
    }
}
class child3: Parent(){
    fun display(){
        println("My car is a $car")
    }
}
fun main(args: Array<String>) {
    val myobject = child1()
    println(myobject.display())

    val myname = child2()
    println(myname.display())

    val mycar = child3()
    println(mycar.display())

}