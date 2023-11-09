package graphs

fun main() {

    val grid1: Array<CharArray> = arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '0', '1', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '0', '0', '0')
    )

    val grid2: Array<CharArray> = arrayOf(
        charArrayOf('1','1','0','0','0'),
        charArrayOf('1','1','0','0','0'),
        charArrayOf('0','0','1','0','0'),
        charArrayOf('0','0','0','1','1')
    )

    val solution = Solution(grid1)

    println(solution.numIslands())
    val solution1 = Solution(grid2)

    println(solution1.numIslands())

}

class Solution(val grid: Array<CharArray>) {

    fun numIslands(): Int {
        var count = 0

        for (i in 0 until grid.size) {
            for (j in 0 until grid[0].size) {
                if (grid[i][j] == '1') {
                    dfs(i, j)
                    count++
                }
            }
        }


        return count
    }

    fun dfs(i: Int, j: Int) {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] == '0') {
            return
        }
        grid[i][j] = '0'

        dfs(i + 1, j)
        dfs(i - 1, j)
        dfs(i, j + 1)
        dfs(i, j - 1)
    }
}