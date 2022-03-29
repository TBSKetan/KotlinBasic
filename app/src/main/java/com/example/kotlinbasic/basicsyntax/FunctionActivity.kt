package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class FunctionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)
        interview()
    }

    private fun interview() {
        builtInFunction()
        printHello()
        functionParameters()
        functionWithReturnValue()
        //recursiveFunction()
        higherOrderFunction()
        lambdaFunction()
        inlineFunction()
    }

    private fun inlineFunction() {
        println("------------inlineFunction------------")
        myFunction { println("Inline function para") }
    }

    private inline fun myFunction(function: () -> Unit) {
        println("I am inline function - A")
        function()
        println("I am inline function - B")
    }

    private fun lambdaFunction() {
        println("------------lambdaFunction------------")
        val upperCase = {str: String-> str.uppercase()}
        println(upperCase("Hello Ketan"))
    }

    private fun higherOrderFunction() {
        println("------------higherOrderFunction------------")
        val func = operation()
        println( func(4) )
    }

    fun square(x: Int) = x * x

    fun operation(): (Int) -> Int {
        return ::square
    }
    private fun recursiveFunction() {
        println("------------recursiveFunction------------")
        val a = 4
        val result = factorial(a)
        println(result)
    }

    private fun factorial(a: Int): Int {
        val result: Int
        if (a <= 1) {
            result = a
        } else {
            result = a * factorial(a - 1)
        }
        return result
    }

    private fun functionWithReturnValue() {
        val a = 10
        val b = 20
        val result = sumTwo(a, b)
        println("Sum of two value :  $result")
    }

    private fun sumTwo(a: Int, b: Int): Int {
        println("------------functionWithReturnValue------------")
        val sum = a + b
        return sum
    }

    private fun functionParameters() {
        println("------------functionParameters------------")
        val a = 10
        val b = 20
        sumCalculate(a, b)
    }

    private fun sumCalculate(a: Int, b: Int) {
        println(a + b)
    }

    private fun printHello() {
        println("------------printHello------------")
        println("Hello")
    }

    private fun builtInFunction() {
        println("------------builtInFunction------------")
        println("Hello Ketan")
    }
}