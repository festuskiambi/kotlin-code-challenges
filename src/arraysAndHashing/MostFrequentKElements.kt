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

    println(freq)

    return intArrayOf()
}