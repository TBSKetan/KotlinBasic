fun main() {
    val aa: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val bb: IntArray = intArrayOf(1, 2, 3, 4, 5)

    println("**********Loops*****************")
    //loops
    var i = 1

    while (i <= 10) {
        println("$i")
        i += 2
    }

    println("**********do while*****************")
    var ii = 1
    do {
        println("$ii")
        ii += 2
    } while (ii <= 10)

    println("**********for*****************")
    for (x in 1..10) {
        println("$x")
    }

    println("**********from array*****************")
    for (y in aa.indices) {
        println(aa[y])
    }
    println("**********Step*****************")
    for (i in 1..10 step 2) {
        println(i)
    }

    println("**********Until*****************")
    for (i in 1 until 5) {
        println(i)
    }

    println("**********Down To*****************")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    println("**********Table*****************")
    val number = 2
    for (i in 1..10) {
        //println(number.toString() + " x " + i + " = " + (number * i))
        println("$number X $i = ${number * i}") // string temp
    }
}