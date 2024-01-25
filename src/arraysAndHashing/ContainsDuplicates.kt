package arraysAndHashing

fun main(){
   val test = intArrayOf(1, 2, 3, 1)
   // expect true
   println(containsDuplicate(test))
}

fun containsDuplicate(nums: IntArray): Boolean {
   val hashMap = mutableMapOf<Int, Boolean>()

    for( i in nums){
        if(hashMap.containsKey(i)){
            return true
        } else {
            hashMap[i]= true
        }
    }

   return false
}