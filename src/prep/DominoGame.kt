package prep

//John is very fond of his domino set. Due to his friends' lack of interest in the game, he has had to invent a new version of the game that he can play on his own. His latest favorite domino game has very simple rules. First, John places domino tiles vertically, close to each other, so that he can easily distinguish the upper and lower parts of each tile. Then he picks number K. Now, he has to find the minimal number of rotations needed to obtain a sum of at least K dots in all upper panels.
//
//Write a function that, given two arrays, A and B, each containing N integers, denoting the counts of the dots on both ends of the N domino tiles (A[0] and B[0] describe the first domino tile, A[1] and B[1] describe the second domino tile, etc.), returns the minimal number of rotations needed to obtain a sum of at least K dots in A. If it is not possible to obtain a sum of at least K, your function should return −1.
//
//
//For example:
//Given: A = [2, 3, 1, 4, 2, 1], B = [3, 2, 3, 6, 1, 4] and K = 19 your function should return 3 because you can rotate the first, fourth and sixth tiles, so that A will be equal to [3, 3, 1, 6, 2, 4] and the sum of its elements is 19.
//
//Given A = [1, 2, 1, 2], B = [3, 4, 1, 2] and K = 20 your function should return −1.
//
//Write an efficient algorithm for the following assumptions:
//N is an integer within the range [1..100,000];
//K is an integer within the range [1..10,000,000];
//The arrays A and B are non-empty and have the same size, and each element of the arrays A, B is an integer within the range [1..6]
fun main() {
    val a = intArrayOf(1, 2, 1, 2)
    val b = intArrayOf(3, 4, 1, 2)

    println(domino(a, b, 19))

}

fun domino(a: IntArray, b: IntArray, k: Int): Int {
    val diffArr = mutableListOf<Int>()
    for (i in 0 until a.size) {
        val diff = b[i] - a[i]
        diffArr.add(diff)
    }

    var sumA = a.sum()
    var count = 0
    var right = diffArr.size - 1

    diffArr.sort()

    while (sumA <= k && right >= 0) {
        sumA += diffArr[right]
        count += 1
        right--
    }


    return if (sumA >= k) count else -1
}
