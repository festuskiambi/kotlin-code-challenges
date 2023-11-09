package Greedy

fun main() {
    val test1 = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    println(maxSubArray(test1))
}

fun maxSubArray(nums: IntArray): Int {
    var currentSum = nums[0]
    var maxSum = nums[0]

    for(i in 1 until nums.size){
        currentSum = maxOf(nums[i], nums[i] + currentSum)
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
}