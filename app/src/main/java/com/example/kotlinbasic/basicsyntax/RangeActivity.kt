package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class RangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_range)
        interview()
    }

    private fun interview() {
        rangesUsingRangeTo()
        rangeUsingOperator()
        rangeUsingDownToOperator()
        rangeStepFunction()
        rangeCharacters()
        rangeReversed()
        rangeUntil()
    }



    private fun rangesUsingRangeTo() {
        println("------------rangesUsingRangeTo------------")
        for (num in 1.rangeTo(4)) {
            println(num)
        }
    }

    private fun rangeUsingOperator() {
        println("------------rangeUsingOperator------------")
        for (num in 1..4) {
            println(num)
        }
    }

    private fun rangeUsingDownToOperator() {
        println("------------rangeUsingDownToOperator------------")
        for (num in 4 downTo 1) {
            println(num)
        }
    }

    private fun rangeStepFunction() {
        println("------------rangeStepFunction------------")
        for (num in 1..10 step 2) {
            println(num)
        }
        println("------------------------")
        println((5..10).first)
        println((5..10 step 2).step)
        println((5..10).reversed().last)

    }
    private fun rangeCharacters() {
        println("------------rangeCharacters------------")
        for (ch in 'a'.. 'k')
        {
            println(ch)
        }
    }
    private fun rangeReversed(){
        println("------------rangeReversed------------")
        for (num in (1..5).reversed()){
            println(num)
        }
    }
    private fun rangeUntil() {
        println("------------rangeUntil------------")
        for (num in 1 until 5)
        {
            println(num)
        }
    }
}