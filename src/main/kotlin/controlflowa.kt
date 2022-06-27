fun main(args: Array<String>) {
    var number = 56
    if (number<40){
        println("You don't qualify")
    }else{
        println("You qualify")
    }

    var marks = 90
    if (marks<0) {
        println("Invalid marks")
    }else if(marks>0 && marks<=30){
        println("You have failed.")
    }else if (marks>=31 && marks<=58){
        println("Below average.")
    }else if (marks>=59 && marks<=70){
        println("You have tried.")
    }else if (marks>=71 && marks<=100){
        println("You have excelled!!")
    }
}