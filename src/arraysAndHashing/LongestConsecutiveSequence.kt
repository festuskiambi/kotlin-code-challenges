package arraysAndHashing

fun main() {

 // test expect 4
    val test = intArrayOf(100,4,200,1,3,2)

    println(longestConsecutive(test))
}

fun longestConsecutive(nums: IntArray): Int {
   var longest = 0
   val numsSet = nums.toSet()

   for (num in nums){
       if (!numsSet.contains(num-1)){
           var length = 0
           while (numsSet.contains(num+length)){
               length +=1
           }
           longest = maxOf(length, longest)
       }
   }

    return longest
}
