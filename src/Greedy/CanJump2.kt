package Greedy

fun main() {
    val test = intArrayOf(2,3,1,1,4)
    println(jump(test))

}

fun jump(nums: IntArray): Int {

    var res = 0
    var left = 0
    var right = 0

    while (right < nums.size-1) {
        var furthest = 0
        println(right)
        println(left)

        for (i in left..right) {
            println(nums[i])
            furthest = maxOf(furthest, i + nums[i])
            println(furthest)
        }
        println("new right" + right)
        left = right + 1
        right = furthest
        res += 1
    }
    return res
}