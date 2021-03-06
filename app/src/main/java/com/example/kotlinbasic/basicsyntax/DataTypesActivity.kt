package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class DataTypesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_types)
        interview()
    }

    private fun interview() {
        dataTypes()
        characterDataType()
        stringDataType()
        booleanDataTypes()
        arrayDataTypes()
        dataTypesConversion()
    }

    private fun dataTypesConversion() {
        println("------------dataTypesConversion------------")
        //Kotlin Data Type Conversion
        /*toByte()
        toShort()
        toInt()
        toLong()
        toFloat()
        toDouble()
        toChar()*/
        val x: Int = 100
        //val y: Long = x  // Not valid assignment
        val y: Long = x.toLong();

        println(y)
    }

    private fun arrayDataTypes() {
        //Kotlin Array Data Type
        println("------------arrayDataTypes------------")
        val number : IntArray = intArrayOf(1,2,3,4,5,6,7)
        println("Value at 3rd position : " + number[2])
    }

    private fun booleanDataTypes() {
        //Kotlin Boolean Data Type
        println("------------booleanDataTypes------------")
        val A: Boolean = true   // defining a variable with true value
        val B: Boolean = false   // defining a variable with false value
        val boolNull: Boolean? = null

        println("Value of variable A $A")
        println("Value of variable B $B")
        println("Value of variable $boolNull")
    }

    private fun stringDataType() {
        //Kotlin String Data Type
        println("------------stringDataType------------")
        val escapedString : String  = "I am escaped String!\n"
        var rawString :String  = """This is going to be a 
            multi-line string and will
            not have any escape sequence""".trimMargin();

        print(escapedString)
        println(rawString)
    }

    private fun characterDataType() {
        //Kotlin Character Data Type
        println("------------characterDataType------------")
        val letter: Char = 'A'    // defining a Char variable        // Assigning a value to it
        println("$letter")

        //  following escape sequences are supported in Kotlin: \t, \b, \n, \r, \', \", \\ and \$.
        println('\n') //prints a newline character
        println('\$') //prints a dollar $ character
        println('\\') //prints a back slash \ character
    }

    private fun dataTypes() {
        //Data Types
        println("------------dataTypes------------")

        val a: Int = 10000
        val d: Double = 100.00
        val f: Float = 100.00f
        val l: Long = 1000000004
        val s: Short = 10
        val b: Byte = 1

        println("Int Value is $a")
        println("Double  Value is $d")
        println("Float Value is $f")
        println("Long Value is $l")
        println("Short Value is $s")
        println("Byte Value is $b")
    }
}