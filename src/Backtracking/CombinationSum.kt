package Backtracking

fun main() {
    val test1 = intArrayOf(2,3,6,7)

    println(combinationSum(test1,7))
}

//fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
//   val res = mutableListOf<List<Int>>()
//    dfs(candidates,target,0, mutableListOf<Int>(), res )
//    return res
//}
//
//fun dfs(nums: IntArray, target: Int, pos: Int, curr: MutableList<Int>, res: MutableList<List<Int>> ){
//
//    if(target == 0){
//        res.add(ArrayList(curr))
//        return
//    }
//
//    if(pos >= nums.size || target < 0){
//        return
//    }
//
//    for (i in pos until nums.size){
//        curr.add(nums[i])
//        dfs(nums, target - nums[i], i, curr, res)
//        curr.removeLast()
//    }
//
//}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val res = mutableListOf<List<Int>>()
    val curr = mutableListOf<Int>()

    fun dfs(i: Int, total: Int){
        if (total == target){
            res.add(curr.toList() )
            return
        }

        if(total > target || i >= candidates.size){
            return
        }
        curr.add(candidates[i])
        dfs(i, total + candidates[i])
        curr.removeLast()
        dfs(i+1, total)
    }

    dfs(0,0)

    return res
}
