fun main(args: Array<String>) {
    println(sayHello())
}

fun sayHello(): String =
     "Hello"


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun max(a: Int, b: Int): Int =
     if(a > b) a else b

fun calculateMiddleIndex(array: IntArray): Int {
    val start = 0
    val end = array.size - 1
    return start + (end - start) / 2
}