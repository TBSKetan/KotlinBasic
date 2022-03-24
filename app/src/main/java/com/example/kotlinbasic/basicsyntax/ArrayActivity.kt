package com.example.kotlinbasic.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R

class ArrayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)
        interView()
    }

    private fun interView() {

        val fruits = arrayOf("Apple", "Banana", "Mango", "Orange")
        val fruits1 = arrayOf<String>("Apple", "Banana", "Mango", "Orange", "Apple")

        simpleArray(fruits)
        elementOfArray(fruits)
        arrayLength(fruits)
        loopThroughArray(fruits)
        checkElementExists(fruits)
        distinctValueArray(fruits1)
        droppingElementFromArray(fruits1)
        checkingEmptyArray()
    }

    private fun simpleArray(fruit: Array<String>) {
        println("------------Simple Array------------")
        println(fruit)
    }

    private fun elementOfArray(fruits: Array<String>) {
        println("------------Element Array------------")
        println(fruits[0])
        println(fruits[3])

        //Set the value at 3rd index
        fruits.set(3, "Guava")
        println(fruits.get(3))
    }

    private fun arrayLength(fruits: Array<String>) {
        println("------------Array Length------------")
        println("Size of fruits array " + fruits.size)
    }

    private fun loopThroughArray(fruits: Array<String>) {
        println("------------Loop Through Array------------")
        for (item in fruits) {
            println(item)
        }
    }

    private fun checkElementExists(fruits: Array<String>) {
        println("------------Loop Through Array------------")
        if ("Mango" in fruits) {
            println("Mango exists in fruits")
        } else {
            println("Mango does not exist in fruits")
        }
    }

    private fun distinctValueArray(fruits1: Array<String>) {
        println("------------distinct Value Array------------")
        val distinct = fruits1.distinct()
        for (item in distinct) {
            println(item)
        }
    }

    private fun droppingElementFromArray(fruits1: Array<String>) {
        println("------------dropping Element From Array------------")
        val result = fruits1.drop(2) // drops first two elements
        for (item in result) {
            println(item)
        }
    }

    private fun checkingEmptyArray() {
    val fruit = arrayOf<String>()
        println("Array is empty : ${fruit.isEmpty()}")
    }
}