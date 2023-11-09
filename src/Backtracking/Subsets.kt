package Backtracking

fun main() {
  val test = intArrayOf(1,2,3)
//expect = [[1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []]
  println(subsets(test))

}

fun subsets(nums: IntArray): List<List<Int>> {
    val res = mutableListOf<List<Int>>()

    val subset = mutableListOf<Int>()
    fun dfs(i: Int) {
       if(i >= nums.size) {
           println("at end $i"+subset)
           res.add(subset.toList())
           return
       }



        println("at $i"+subset)
       subset.add(nums[i])

       dfs(i+1)

       subset.removeLast()
        println("at without  $i"+subset)

        dfs( i + 1)
    }

    dfs(0)

    return res
}