fun main() {

    println(fibonacciRecursive(3))
    println(fibonacciIterative(15))

}

fun fibonacciRecursive(n: Int): Int {
    return if (n <= 1) {
        n
    } else fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
}

fun fibonacciIterative(n: Int): Int {
    if (n <= 1) {
        return n
    }
    var prev = 0
    var current = 1

    for (i in 2..n ) {
        val next = prev + current
        prev = current
        current = next
    }
    return current
}