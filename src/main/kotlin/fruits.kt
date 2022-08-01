class fruits {
    var type = ""
    var color = ""
    var amount = 0

}

fun main(args: Array<String>) {
    val matunda = fruits()
    matunda.type = "Bananas "
    matunda.color = "Yellow "
    matunda.amount = 20
    println(matunda.type + matunda.color + matunda.amount)

    val  matunda2 = fruits()
    matunda2.type = "Apples "
    matunda2.color = "Red "
    matunda2.amount = 30
    println(matunda2.type + matunda2.color + matunda2.amount)

    val matunda3 = fruits()
    matunda3.type = "Kiwis "
    matunda3.color = "Green "
    matunda3.amount = 25
    println(matunda3.type + matunda3.color + matunda3.amount)
}