fun emobilis(){
    var num1 = 27
    var num2 = 94

    println("The sum of $num1 and $num2 is " +(num1+num2))
}
fun myname(fname: String , sname: String, age: Number ){
    println("My name is "+fname + " " + sname + " I am "+ age + " "+ "years old" )


}
fun main(args: Array<String>) {
    emobilis()
    myname("Gavin", "Ochira", 18)
    myname("Joe", "Rogan", 46)
    myname("Ken", "Block", 60)

    println("Enter a positive integer number: ")
    val number: Int =Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
}
//recursive funtion
fun fact(num: Int): Int{
    return if(num == 1){
        num
    }
    else{
        //calling fact function
        num*fact(num-1)
    }
}