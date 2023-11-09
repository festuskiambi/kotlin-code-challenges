package dynamicProgramming

fun main() {
    val test = intArrayOf(2,1,3,-2,4)

    println(maxProduct(test))
}



fun maxProduct(nums: IntArray): Int {
    var res = nums.maxOf { it }

    var min = 1
    var max = 1

    for (n in nums){
       val tempMax = n * max
        max = maxOf(n,n*min, tempMax )
        min = minOf(n, n*min, tempMax)
        res = maxOf(max, res)
    }

    return res
}