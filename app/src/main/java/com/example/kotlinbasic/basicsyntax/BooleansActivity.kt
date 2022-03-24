package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class BooleansActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booleans)
        interview()
    }

    private fun interview() {
        booleanVariables()
        booleanOperators()
        booleanExpression()
        kotlinFunction()
        booleanString()
    }

    private fun booleanVariables() {
        //Boolean Variables
        println("------------Boolean Variables------------")
        val isSummer: Boolean = true
        val isCold: Boolean = false

        println(isSummer)
        println(isCold)
    }

    private fun booleanOperators() {
        //Boolean Operators
        println("------------Boolean Operators------------")
        var x: Boolean = true
        var y: Boolean = false

        println("x && y = " + (x && y))
        println("x || y = " + (x || y))
        println("!y = " + (!y))
    }

    private fun booleanExpression() {
        //Boolean Expression
        println("------------Boolean Expression------------")
        val x: Int = 40
        val y: Int = 20

        println("x > y = " + (x > y))
        println("x < y = " + (x < y))
        println("x >= y = " + (x >= y))
        println("x <= y = " + (x <= y))
        println("x == y = " + (x == y))
        println("x != y = " + (x != y))
    }

    private fun kotlinFunction() {
        println("------------and()and or() Functions------------")
        val a: Boolean = true
        val b: Boolean = false
        val c: Boolean = true

        println("a.and(b) = " + a.and(b))
        println("a.or(b) = " + a.or(b))
        println("a.and(c) = " + a.and(c))
    }


    private fun booleanString() {
        println("------------Boolean String------------")

        val x: Boolean = true
        var y: String
        y = x.toString()
        println("x.toString() = $x")
        println("y = $y")
    }
}