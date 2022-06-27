fun main(args: Array<String>) {

    println("Enter first number: ")
    var numone = Integer.valueOf(readln())

    println("Enter operator +(addition), -(subtraction), /(division), *(multiplication): ")
    var operator = readln()

    println("Enter second number: ")
    var numtwo = Integer.valueOf(readln())

    if (operator == "+"){
        var ans = numone + numtwo
        println("$numone + $numtwo = "+ ans)
    }
    else if (operator == "-"){
        var ans = numone - numtwo
        println("$numone - $numtwo = "+ ans)
    }
    else if (operator == "/"){
        var ans = numone / numtwo
        println("$numone / $numtwo = "+ ans)
    }
    else if (operator == "*"){
        var ans = numone * numtwo
        println("$numone * $numtwo = "+ ans)
    }
    else {
        println("Invalid")
    }

}