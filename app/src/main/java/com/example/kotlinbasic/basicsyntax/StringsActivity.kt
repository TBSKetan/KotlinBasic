package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class StringsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strings)
        interView()
    }

    private fun interView() {
        val name: String = "Ketan Nakum"
        val firstName: String = "Ketan"
        val lastName: String = "Nakum"

        stringFunction()
        stringTemplates(name)
        stringIndexes(name)
        stringLength(name)
        stringLastIndex(name)
        stringChangingCase(name)
        stringConcatenation(firstName, lastName)
        stringTrimCharacters(name)
        quotesInsideString()
        findAStringInSideString()
        stringComparing()
        stringGetOrNull()

    }

    private fun stringFunction() {
        println("------------stringFunction------------")
        val escapedString: String = "I am escaped String!\n"
        var rawString: String = """This is going to be a
   multi-line string and will
   not have any escape sequence""";
        var name: String = "Ketan Nakum"

        print(escapedString)
        println(rawString)
        println(name.toString())
    }

    private fun stringTemplates(strName: String) {
        //String Templates
        println("------------String Templates------------")
        println("Name - $strName")  // Using template with variable name
        println("Name length - ${strName.length}") // Using template with expression.
    }

    private fun stringIndexes(strName: String) {
        //String Indexes
        println("------------String Indexes------------")

        println(strName[3])
        println(strName[6])
    }

    private fun stringLength(strName: String) {
        println("------------string Length------------")
        println("The length of name :" + strName.length)
        println("The length of name :" + strName.count())
    }

    private fun stringLastIndex(name: String) {
        println("------------string Last Index------------")
        println("The index of last character in name :" + name.lastIndex)
    }

    private fun stringChangingCase(name: String) {
        println("------------string Changing Case------------")
        println("Upper case of name :" + name.uppercase())
        println("Lower case of name :" + name.lowercase())
    }

    private fun stringConcatenation(firstName: String, lastName: String) {
        println("------------string Concatenation------------")
        println("Full Name :" + firstName + lastName)
        println("Full Name :" + firstName.plus(lastName))
    }

    private fun stringTrimCharacters(name: String) {
        println("------------string Trim Characters------------")
        println("Remove first two characters from name : " + name.drop(2))
        println("Remove last two characters from name : " + name.dropLast(2))
    }

    private fun quotesInsideString() {
        println("------------string quotes Inside ------------")
        var str1: String = "This's it"
        var str2: String = "It's OK"
        println("Str1 : $str1")
        println("Str2 : $str2")
    }

    private fun findAStringInSideString() {
        var str: String = "Meditation and Yoga are synonymous with India"
        println("Index of Yoga in the string - " + str.indexOf("Yoga"))
    }

    private fun stringComparing() {
        var str1: String = "Ketan"
        var str2: String = "Ketan"
        println(str1.compareTo(str2))
    }

    private fun stringGetOrNull() {
        var name: String = "Ketan"

        println(name.getOrNull(0))
        println(name.getOrNull(2))
        println(name.getOrNull(10))
    }
}