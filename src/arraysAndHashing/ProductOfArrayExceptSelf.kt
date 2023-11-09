fun main() {
val nums = intArrayOf(1,2,3,4)
   productOfArrayExceptSelf(nums).forEach {
       println(it)
   }
}
fun productOfArrayExceptSelf(nums: IntArray): IntArray{
    val result = IntArray(nums.size)

    var pref = 1

    for(i in 0 until nums.size){
        result[i] = pref
        pref *=nums[i]
    }

    result.forEach {
        println(it)
    }
    var pos = 1

    for(i in nums.size-1 downTo 0){
        result[i] *= pos
        pos *= nums[i]
    }


    return result
}