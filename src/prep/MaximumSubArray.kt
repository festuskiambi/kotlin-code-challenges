fun main() {
    val test1 = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val test2 = intArrayOf(1)
    val test3 = intArrayOf(5, 4, -1, 7, 8)

    println(maxSubArray(test1))
    println(maxSubArray(test2))
    println(maxSubArray(test3))
}

fun maxSubArray(nums: IntArray): Int {
    var currentSum = nums[0]
    var maxSum = nums[0]

    for (i in 1 until nums.size) {
        currentSum = maxOf(nums[i], nums[i] + currentSum)
        maxSum = maxOf(maxSum, currentSum)
    }
    return maxSum
}