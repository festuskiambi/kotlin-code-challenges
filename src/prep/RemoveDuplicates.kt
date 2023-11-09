fun main() {
    val test1 = intArrayOf(1, 1, 2)
    val test2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println(removeDuplicates(test1))
    println(removeDuplicates(test2))
}

fun removeDuplicates(nums: IntArray): Int {
     var i = 0
     var j = 1

    while (j< nums.size){
        if (nums[j] != nums[i]){
            i++
            nums[i] = nums[j]
        }
        j++
    }

    return nums.size
}