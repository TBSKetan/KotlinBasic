//Globe variables
var userName: String = "Ketan"
var password: String = "Nakum123"


// How to define Null safety in kotlin
//var collegeName: String = null //gave an error
var collegeName: String? = null; // if you want define null value the use ?

fun main() {
    //Difference between var an val variables
    val firstName: String = "Ketan"
    var lastName: String = "Nakum"

    var score: Int = 100
    var temperature: Double = 99.99
    var isRaining: Boolean = false
    var alphabet: Char = 'K'
    var message : String = "Hello Good Morning"

    //firstName = "ABC"
    //lastName = "Test"

    println(firstName)
    println(lastName)
    println("Full Name : $firstName $lastName")
    println("Username $userName")
    println("Password $password")
    println("CollegeName $collegeName")
    println("CollegeName ${collegeName?.length}") // it is null save
    //println("CollegeName ${collegeName!!.length}") // it means bypass the null when you sure the value of variables value not get null if you assigned null the at that time through error NullPointerException
    collegeName = " T N Rao "
    println("Password ${collegeName?.length}") // count the value of assigned variables
}