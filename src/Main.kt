fun printSome(item: String = "Hi", vararg word: String){
    print("$item: ")
    word.forEach {
        el -> print("$el ")
    }
    println("")
}

fun main(args: Array<String>) {
    var names = arrayOf("Bob", "John", "Alex")

    printSome()
    printSome(word = arrayOf("Hi"))
    printSome(word = arrayOf("Hi"),item = "Some")
    printSome("Hi","Some", "Hello")
    printSome("Hi","Some", "Hello", *names)
}