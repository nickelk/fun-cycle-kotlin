//fun printSome(item: String = "Hi", vararg word: String){
//    print("$item: ")
//    word.forEach {
//        el -> print("$el ")
//    }
//    println("")
//}
//
//fun main(args: Array<String>) {
//    var names = arrayOf("Bob", "John", "Alex")
//
//    printSome()
//    printSome(word = arrayOf("Hi"))
//    printSome(word = arrayOf("Hi"),item = "Some")
//    printSome("Hi","Some", "Hello")
//    printSome("Hi","Some", "Hello", *names)
//}
fun main(args: Array<String>) {
    var items = 5
    while(items > 0){
        print("$items ")
        items--
    }
    println("")
    do {
        println("Items: $items")
    } while (items == 5)

//    for(i in 1..10 step 2){
//        print("$i ")
//    }
//    for (i in 10 downTo 0 step 2){
//        print("$i ")
//    }
//    for (el in 'a'..'z' step 3){
//        print("$el ")
//    }
    for (el in 'z' downTo 'a' step 5){
        print("$el ")
    }

    val x = 20
    if (x !in 5..30){
        print("Variable: $x")
    }
}