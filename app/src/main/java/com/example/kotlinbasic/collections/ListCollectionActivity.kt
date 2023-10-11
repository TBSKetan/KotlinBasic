package com.example.kotlinbasic.collections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class ListCollectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_collection)
        interview()
    }

    private fun interview() {
        simpleCollectionList()
    }

    private fun simpleCollectionList() {
        println("------------simpleCollectionList------------")
        var numberList = listOf("One", "Two", "Three", "Four")
        println(numberList)
        println(numberList.toString())

        println("------------listIterator------------")

        val itr = numberList.listIterator()
        while (itr.hasNext()) {
            println(itr.next())
        }

        println("------------mutableListOf------------")
        val mutableList = mutableListOf("One", "Two", "Three", "Four")
        println(mutableList)

        println("------------mutableListOf------------")
        for (i in numberList.indices)
            println(numberList[i])

        println("------------forEach------------")
        numberList.forEach { println(it) }

        println("------------Size------------")
        println("Size ot the list " + numberList.size)

        println("------------In------------")
        if ("Two" in numberList) {
            println(true)
        } else {
            println(false)
        }
        println("------------Contain------------")
        if (numberList.contains("two")) {
            println(true)
        } else {
            println(false)
        }
        println("------------isEmpty------------")

        if(numberList.isEmpty()){
            println(true)
        }else{
            println(false)
        }
        println("------------indexOf------------")
        println("Index of 'two' :  " + numberList.indexOf("Two"))

        println("------------get() ------------")
        println("Element at 3rd position " + numberList.get(2))

        println("------------List Addition------------")
        val firstList = listOf("one", "two", "three")
        val secondList = listOf("four", "five", "six")
        val resultList = firstList + secondList
        println(resultList)

        println("------------List Subtraction------------")
        val firstList1 = listOf("one", "two", "three")
        val secondList1 = listOf("one", "five", "six")
        val resultList2 = firstList1 - secondList1

        println(resultList2)

        println("------------Slicing a List------------")
        val theList = listOf("one", "two", "three", "four", "five")
        val resultList3 = theList.slice( 2..4)
        println(resultList3)

        println("------------Removing null a List------------")
    }
}