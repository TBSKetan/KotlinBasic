package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class OperatorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operators)
        interview()
    }
    private fun interview() {
        val a: Int = 40
        val b: Int = 20
        arithmeticOperators(a,b)
        relationalOperators(a,b)
        assignmentOperators(a,b)
        unaryOperators(a,b)
        logicalOperators()
        bitwiseOperators()
        comparisonOperators()
    }

    private fun comparisonOperators() {
        println("------------comparisonOperators------------")
        var myAge = 19
        var sisterAge = 11
        var cousinAge = 11

        myAge > sisterAge  // true
        myAge < cousinAge  // false
        myAge >= cousinAge // true
        myAge <= sisterAge // false

        println(myAge)
    }

    private fun arithmeticOperators(a: Int, b: Int) {
        //Kotlin Arithmetic Operators
        println("------------arithmeticOperators------------")
        println("a + b = " +  (a + b))
        println("a - b = " +  (a - b))
        println("a / b = " +  (a / b))
        println("a * b = " +  (a * b))
        println("a % b = " +  (a % b))
    }
    private fun relationalOperators(a: Int, b: Int) {
        //Kotlin Relational Operators
        println("------------relationalOperators------------")
        println("a > b = " +  (a > b))
        println("a < b = " +  (a < b))
        println("a >= b = " +  (a >= b))
        println("a <= b = " +  (a <= b))
        println("a == b = " +  (a == b))
        println("a != b = " +  (a != b))
    }
    private fun assignmentOperators(a: Int, b: Int) {
        //Kotlin Assignment Operators
        println("------------assignmentOperators------------")
        println("a = $a")
        println("b = $b")
        var a : Int =  a

        a += 10
        println("Resign value of a = $a")

        a += 5
        println("a += 5 = $a")

        a = 40;
        a -= 5
        println("a -= 5 = $a")

        a = 40
        a *= 5
        println("a *= 5 = $a")

        a = 40
        a /= 5
        println("a /= 5 = $a")

        a = 43
        a %= 5
        println("a %= 5 = $a")
    }
    private fun unaryOperators(a: Int, b: Int){
        //Kotlin Unary Operators
        println("------------Unary Operators------------")
        var x: Int = a
        var b:Boolean = true

        println("+x = " +  (+x))
        println("-x = " +  (-x))
        println("++x = " +  (++x))
        println("--x = " +  (--x))
        println("!b = " +  (!b))
    }
    private fun logicalOperators() {
        //Kotlin Logical  Operators
        println("------------Logical Operators------------")

        var x: Boolean = true
        var y:Boolean = false

        println("x && y = " +  (x && y))
        println("x || y = " +  (x || y))
        println("!y = " +  (!y))

        var humid = true
        var raining = true
        var jacket = false

        println(!humid)
        // Prints: false

        println(jacket && raining)
        // Prints: true

        println(humid || raining)
        // Prints: true
    }
    private fun bitwiseOperators() {
        //Kotlin Bitwise Operators
        println("------------bitwiseOperators------------")
        var x:Int = 60	  // 60 = 0011 1100
        var y:Int = 13	  // 13 = 0000 1101
        var z:Int

        z = x.shl(2)       // 240 = 1111 0000
        println("x.shl(2) = $z")

        z = x.shr(2)       // 15 = 0000 1111
        println("x.shr(2) = $z")

        z = x.and(y)       // 12 = 0000 1100
        println("x.and(y)  = $z")

        z = x.or(y)        // 61 = 0011 1101
        println("x.or(y)  = $z")

        z = x.xor(y)       // 49 = 0011 0001
        println("x.xor(y)  = $z")

        z = x.inv()        // -61 = 1100 0011
        println("x.inv()  = $z")
    }
}