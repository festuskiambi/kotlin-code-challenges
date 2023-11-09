package pointers

fun main() {

    val test = intArrayOf(-1,0,1,2,-1,-4)

    println(threeSum(test))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val res = mutableListOf<List<Int>>()
    var j = 0
    var k = 0
    if (nums.size < 3) return res

    if (nums.size == 3 && nums.sum() == 0) {
        res.add(nums.toList())
        return res
    }
    nums.sort()

    for (i in 0 until nums.size -2) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue
        }

         j = i + 1
         k = nums.size - 1

        while (j < k) {

            val threeSum = nums[i] + nums[k] + nums[j]
            if (threeSum > 0) {
                k-=1
            } else if (threeSum < 0) {
                j+=1
            } else {
                res.add(listOf(nums[i], nums[j], nums[k]))
                j++
                while (nums[j] == nums[j - 1] && j < k) {
                    j++
                }
            }

        }
    }


    return res
}