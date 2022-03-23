package com.example.kotlinbasic.basicsyntax

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinbasic.R

class BasicSyntaxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_syntax)

        //simple print hello world in kotlin
        var strHelloWorld: String = "Hello World"
        Log.i(TAG, "onCreate 1: $strHelloWorld")

        //variable declaration
        var name = "Ketan Nakum"
        var age = 25
        var height = "5.8"
        println("Name = " + name)
        println("Age = $age")
        println("Height = $height")
        Log.i(TAG, "onCreate 2: Name is $name Age : $age and height is $height")

        //Kotlin Mutable Variables
        /*Mutable means that the variable can be reassigned to a different value after initial assignment.
        To declare a mutable variable, we use the var keyword as we have used in the above examples:*/
        name = "Nakum Ketan"
        age = 35
        println("Name = $name")
        println("Age = $age")

        //Kotlin Read-only Variables
        /*A read-only variable can be declared using val (instead of var)
         and once a value is assigned, it can not be re-assigned.*/
        val firstName = "Ketan"
        val userAge = 35
        Log.i(TAG, "onCreate 3: Name is $firstName Age : $userAge")

        //firstName = "Nakum Ketan" //val cannot reassigned

        //Kotlin Variable Types
        /*Kotlin is smart enough to recognise that "Ketan Nakum" is a string,
         and that 19 is a number variable. However, you can explicitly specify a variable type while creating it:*/
        var empName : String = "Ketan Nakum"
        var empAge : Int = 20
        Log.i(TAG, "onCreate 4: Name is $empName and Age : $empAge")




    }
}