fun main(args: Array<String>) {
    //test
    val a = intArrayOf(1, 3, 6, 4, 1, 2)
    val test2 = intArrayOf(1, 2, 3)
    val test3 = intArrayOf(-1, -3, 1)
    println(solution(a))
    println(solution(test2))
    println(solution(test3))

}

fun solution(A: IntArray): Int {
    A.sort()
    if (A.last() <= 0) {
        return 1
    }
    var currentMin = 1
    for (i in A.indices) {
        if (A[i] > 0) {
            try {
                if (A[i + 1] - A[i] > 1) {
                    return A[i] + 1
                }
            } catch (E: ArrayIndexOutOfBoundsException) {
                currentMin = A[A.size - 1] + 1
            }
        }
    }
    // Implement your solution here

    return currentMin
}