package Greedy

fun main() {
    val test = intArrayOf(2,3,1,1,4)
    println(canJump(test))
}

fun canJump(nums: IntArray): Boolean {
    var goal = nums.size -1

    for (i in nums.size - 2 downTo 0){
        if (i + nums[i] >= goal){
            goal = i
        }
    }

 return goal == 0
}