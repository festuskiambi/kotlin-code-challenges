package arraysAndHashing

fun main(){
    //test expect 0,1
    val tarhet = 9
    val nums = intArrayOf(2,7,11,15)

    println(twoSum(nums, tarhet).joinToString())


}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numsMap = mutableMapOf<Int, Int>()

    for (i in 0 until nums.size) {

        val diff = target - nums[i]
        if (numsMap.containsKey(diff)) {
            return intArrayOf(numsMap[diff]!!, i)

        } else {
            numsMap[nums[i]] = i
        }
    }

    return intArrayOf()
}