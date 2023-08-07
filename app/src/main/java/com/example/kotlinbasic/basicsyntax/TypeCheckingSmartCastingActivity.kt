package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class TypeCheckingSmartCastingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_checking_smart_casting)
        interview()
    }

    private fun interview() {
        typeCheckingUsingIfElse()
        typeCheckingUsingWhen()
        smartCasting()
        smartCastingUseingOperator()
    }

    private fun typeCheckingUsingIfElse() {
        println("------------typeChecking------------")
        val name = "Ketan"
        val age = 35
        val salary = 5000.55
        val employeeDetail: List<Any> = listOf(name, age, salary)
        for (attribute in employeeDetail) {
            if (attribute is String) {
                println("Name: $attribute")
            } else if (attribute is Int) {
                println("Age: $attribute")
            } else if (attribute is Double) {
                println("Salary: $attribute")
            } else {
                println("Not an attribute")
            }

        }
    }

    private fun typeCheckingUsingWhen() {
        println("------------typeCheckingUsingWhen------------")
        val name = "Ketan"
        val age = 35
        val salary = 5000.55
        val emp_id = 12345f
        val employeeDetail: List<Any> = listOf(name, age, salary, emp_id)
        for (attribute in employeeDetail) {
            when (attribute) {
                is String -> println("Name: $attribute")
                is Int -> println("Name: $attribute")
                is Double -> println("Name: $attribute")
                else -> println("Not an attribute")
            }
        }
    }

    private fun smartCasting() {
        println("------------smartCasting------------")
        val str1: String? = "Hello Good Morning"
        var str2: String? = null // prints String is null

        if (str1 is String) {
            // No Explicit type Casting needed.
            println("length of String ${str1.length}")
        } else {
            println("String is null")
        }

    }
    private fun smartCastingUseingOperator() {
        println("------------smartCastingUseingOperator------------")
        val str1:String? = "Ketan Nakum"
        var str2:String? =  null //prints String is null
        if (str1 !is  String)
        {
            println("String is null")
        }else{
            println("Length of String ${str1.length}")
        }
    }
}