package Backtracking

fun main() {
    val test  = intArrayOf(1,2,2)
//    expect = [[],[1],[1,2],[1,2,2],[2],[2,2]]
    println(subsetsWithDup(test))
}

fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    nums.sort()
    val result = mutableListOf<List<Int>>()
    val subset = mutableListOf<Int>()

    fun dfs(i : Int = 0){
        if (i >= nums.size){
            result.add(subset.toList())
            return
        }
        subset.add(nums[i])
        dfs(i+1)
        subset.removeLast()
        var j = i
        while (j < nums.size && j + 1 < nums.size && nums[j] == nums[j+1] ){
            j++
        }
        dfs(j +1)
    }
    dfs()

    return result
}