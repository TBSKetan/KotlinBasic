fun main() {
    var a = 23
    var b = 12



    println(a + b) // 35
    println(a - b) // 11
    println(a * b) // 276
    println(a.toFloat() / b) //1.916666

    // module operator
    println("module operator")
    println(a % b) // 11

    //Relational operator
    println("Relational operator")
    println(a > b) //
    println(a < b) //
    println(a >= b) //
    println(a <= b) //
    println(a == b) //
    println(a != b) //


    println("Logical && || ! Operator")

    val above70 = false
    val knowsPrograming = true  

    var calledForInterview = above70 && knowsPrograming
    println(calledForInterview)

    calledForInterview = above70 || knowsPrograming
    println(calledForInterview)
}