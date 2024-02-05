fun main() {
    val nums = intArrayOf(1, 1, 1, 1, 2, 2, 3)
     kMostFrequentElements(nums, 2)
}

fun kMostFrequentElements(nums: IntArray, k: Int): IntArray {

    val res = mutableListOf<Int>()
    val count = hashMapOf<Int, Int>()

    val freq = MutableList<MutableList<Int>>(nums.size +1){
        mutableListOf()
    }

    for(num in nums){
        count[num] = count.getOrDefault(num, 0) + 1
    }

    for((k,v) in count){
        freq[v].add(k)
    }

    for(i in freq.size downTo 0){
        for(el in freq[i]){
            if (res.size>= k){
                return res.toIntArray()
            } else {
                res.add(el)
            }
        }
    }

    return intArrayOf()
}