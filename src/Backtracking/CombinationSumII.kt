package Backtracking

fun main() {
    val test = intArrayOf(10, 1, 2, 7, 6, 1, 5)

//    expect = [
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]

    println(combinationSum2(test, 8))

}

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    candidates.sort()
    val result = mutableListOf<List<Int>>()

    val curr = mutableListOf<Int>()

    fun dfs(pos: Int, total: Int) {
        if (total == target) {
            result.add(curr.toList())
            return
        }

        if (total > target) return

        for (i in pos until candidates.size) {
            if (i  == pos  || candidates[i] != candidates[i - 1]) {
                curr.add(candidates[i])
                dfs(i + 1, total + candidates[i])
                curr.removeAt(curr.lastIndex)
            }
        }
    }

    dfs(0, 0)

    return result
}