package dynamicProgramming

fun main() {
    val test1 = intArrayOf(2)

    println(houseRobber2(test1))
}

fun houseRobber2(houses: IntArray): Int {
    return maxOf(houses[0], helper(houses.drop(1).toIntArray()), helper(houses.dropLast(1).toIntArray()))
}

fun helper(houses: IntArray): Int {
    var rob1 = 0
    var rob2 = 0

    for (h in houses) {
        val temp = maxOf(rob2, h + rob1)
        rob1 = rob2
        rob2 = temp
    }

    return rob2
}