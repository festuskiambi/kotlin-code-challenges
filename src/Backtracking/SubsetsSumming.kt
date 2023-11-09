package Backtracking


fun main() {
    val test = intArrayOf(1,2,3)
//expect = [[1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []]

    //expect 2
    println(subsetsSumming(test, 3))

}

fun subsetsSumming(nums: IntArray, k: Int): Int {
    val res = mutableListOf<List<Int>>()

    val subset = mutableListOf<Int>()
    fun dfs(i: Int, sum: Int) {
        if(sum > k) return
        if(i >= nums.size) {
            println("at end $i"+subset)
            res.add(subset.toList())
            return
        }



        println("at $i"+subset)
        subset.add(nums[i])

        dfs(i+1, sum + nums[i])

        subset.removeLast()
        println("at without  $i"+subset)

        dfs( i + 1, sum)
    }

    dfs(0, 0)

    var count = 0

    for(item in res){
        count= maxOf(count, item.size )
    }

    println(res.toString())

    return count
}