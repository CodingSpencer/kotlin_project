
fun get_name() {
    println("What's your name?")
    val name: String = readln()
    val message = String.format("Hello, %s!", name)
    println(message)
}



fun main() {
    get_name()
}

// added