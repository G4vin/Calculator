class wanafunzi (val jina:String, val jinsia:String, val miaka:Int, val height:Int){
}

fun main(args: Array<String>) {
    val obj=wanafunzi("Gavin", "Male", 18, 173)
    println("Student name "+obj.jina +". The student is a "+obj.jinsia +". The student is "+obj.miaka +"years old. The studennt is "+obj.height +"cm tall.")

    val obj2=wanafunzi("Ken", "Male",60, 180)
    println("Student name "+obj2.jina +", The student is a "+obj2.jinsia +"The student is "+obj2.miaka +"years old. ")
}