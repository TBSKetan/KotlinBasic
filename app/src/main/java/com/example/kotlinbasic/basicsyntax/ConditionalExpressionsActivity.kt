package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class ConditionalExpressionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conditional_expressions)
        interview()
    }
    private fun interview() {
        ifExpressions()
        ifElseExpressions()
        elseIfExpressions()
        nestedConditionals()
        whenExpressions()
    }

    private fun elseIfExpressions() {
        println("------------elseIfExpressions------------")
        var age = 65
        if (age < 18) {
            println("You are considered a minor.")
        } else if (age < 60) {
            println("You are considered an adult.")
        } else {
            println("You are considered a senior.")
        }
    }

    private fun ifElseExpressions() {
        println("------------ifElseExpressions------------")
        var rained = false
        if (rained) {
            println("No need to water the plants today.")
        } else {
            println("Plants need to be watered!")
        }
    }

    private fun ifExpressions() {
        println("------------ifExpressions------------")
        var morning = true
        if (morning) {
            println("Hello, GoodMorning")
        }
    }

    private fun nestedConditionals() {
        println("------------nestedConditionals------------")
        var studied = true
        var wellRested = true

        if (wellRested) {
            println("Best of luck today!")
            if (studied) {
                println("You should be prepared for your exam!")
            } else {
                println("Take a few hours to study before your exam!")
            }
        }
    }

    private fun whenExpressions() {
        println("------------whenExpressions------------")
        var grade = "A"

        when (grade) {
            "A" -> println("Excellent job!")
            "B" -> println("Very well done!")
            "C" -> println("You passed!")
            else -> println("Close! Make sure to prepare more next time!")
        }
    }
}