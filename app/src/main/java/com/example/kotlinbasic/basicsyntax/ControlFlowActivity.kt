package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class ControlFlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control_flow)
        interview()
    }

    private fun interview() {
        ifExpressions()
        ifElseIfLadder()
        whenExpression()
        whenExpression2()
        combineWhenConditions()
        rangeInWhenConditions()
        whileConditions()
        doWhileConditions()
        breakStatement()
        labeledBreakStatement()
        continueStatement()
        labeledContinueStatement()
    }



    private fun ifExpressions() {
        println("------------ifExpressions------------")
        val age: Int = 10
        if (age > 18) {
            println("Adult")
        } else {
            println("Minor")
        }
    }

    private fun ifElseIfLadder() {
        println("------------ifElseIfLadder------------")
        val age: Int = 13
        val result = if (age > 19) {
            "You are Adult"
        } else if (age > 12 && age < 20) {
            "You are Teen"
        } else {
            "You are Minor"
        }
        println("The value of result : $result")
    }

    private fun whenExpression() {
        //when expression is similar to the switch statement in java
        println("------------whenExpression------------")
        val day = 2
        val result = when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day"
        }
        println(result)
    }

    private fun whenExpression2() {
        println("------------whenExpression 2------------")
        val day = 2

        when (day) {
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            6 -> println("Saturday")
            7 -> println("Sunday")
            else -> println("Invalid day.")
        }
    }

    private fun combineWhenConditions() {
        println("------------combineWhenConditions------------")
        var day = 2
        when (day) {
            1, 2, 3, 4, 5 -> println("Weekday")
            else -> println("Weekend")
        }
    }

    private fun rangeInWhenConditions() {
        println("------------rangeInWhenConditions------------")
        val day = 2
        when (day) {
            in 1..5 -> println("Weekday")
            else -> println("Weekend")
        }
    }

    private fun whileConditions() {
        println("------------whileConditions------------")
        var i = 5
        while (i > 0) {
            println(i)
            i--
        }
    }

    private fun doWhileConditions() {
        println("------------doWhileConditions------------")
        var i = 5
        do {
            println(i)
            i--
        }while (i >0)
    }

    private fun breakStatement() {
        println("------------breakStatement------------")
        var i = 0;
        while (i++ < 100) {
            println(i)
            if( i == 3 ){
                break
            }
        }
    }
    private fun labeledBreakStatement() {
        println("------------labeledBreakStatement------------")
        outerLoop@ for (i in 1..3) {
            innerLoop@ for (j in 1..3) {
                println("i = $i and j = $j")
                if (i == 2){
                    break@outerLoop
                }
            }
        }
    }

    private fun continueStatement() {
        println("------------continueStatement------------")
        var i =0
        while (i++ <6)
        {
            if (i ==3)
            {
                continue
            }
            println(i)
        }
    }
    private fun labeledContinueStatement() {
        println("------------labeledContinueStatement------------")
        outerLoop@ for (i in 1..3) {
            innerLoop@ for (j in 1..3) {
                if (i == 2){
                    continue@outerLoop
                }
                println("i = $i and j = $j")
            }
        }
    }
}

