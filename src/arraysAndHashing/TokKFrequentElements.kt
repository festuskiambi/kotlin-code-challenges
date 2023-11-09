fun main() {
    val nums = intArrayOf(1)
    tokKFrequentElements(nums, 1).forEach {
        println(it)
    }
}
fun tokKFrequentElements(nums: IntArray, k: Int): IntArray {
    val result = mutableListOf<Int>()
    val count = hashMapOf<Int, Int>()

    val freq = MutableList<MutableList<Int>>(nums.size+1) {
        mutableListOf()
    }

    for (i in nums) {
        count[i] = count.getOrDefault(i, 0) + 1
    }

    for ((k, v) in count) {
        freq[v].add(k)
    }

    for(i in freq.size-1 downTo 0){
        for(j in freq[i]){
            result.add(j)
            if (result.size == k)
                return result.toIntArray()
        }
    }


    return result.toIntArray()
}