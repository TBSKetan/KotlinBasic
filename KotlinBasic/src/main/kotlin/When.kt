fun main(){
    val userTypeNew = "admin"


    val result = when (userTypeNew) {
        "admin" -> "Hello admin"
        "editor" -> "Hello editor"
        "author" -> "Hello author"
        else -> "Hello subscriber"
    }
    println(result)

    println("**********When*****************")

    //When we use when statement we check multiple condition.
    val userType = "admin"
    when (userType) {
        "admin" -> {
            println("Hello admin......!")
        }

        "editor" -> {
            println("Hello editor......!")
        }

        "author" -> {
            println("Hello author......!")
        }

        else -> {
            println("Hello subscriber......!")
        }
    }
}