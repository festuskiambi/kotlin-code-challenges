package graphs

fun main() {
    val grid1: Array<IntArray> = arrayOf(
        intArrayOf(0,0,1,0,0,0,0,1,0,0,0,0,0),
        intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
        intArrayOf(0,1,1,0,1,0,0,0,0,0,0,0,0),
        intArrayOf(0,1,0,0,1,1,0,0,1,0,1,0,0),
        intArrayOf(0,1,0,0,1,1,0,0,1,1,1,0,0),
        intArrayOf(0,0,0,0,0,0,0,0,0,0,1,0,0),
        intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
        intArrayOf(0,0,0,0,0,0,0,1,1,0,0,0,0),
    )
//    expect 6

    println(maxAreaOfIsland(grid1))
}

fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    var area = 0

    fun dfs(r: Int, c: Int): Int {
        if (r < 0 || r >= grid.size || c < 0 || c >= grid[0].size || grid[r][c] == 0) {
            return 0
        }

        grid[r][c] = 0

        return 1 + dfs(r + 1, c) +
                dfs(r - 1, c) +
                dfs(r, c + 1) +
                dfs(r, c - 1)
    }

    for (r in 0 until grid.size){
        for (c in 0 until grid[0].size){
            if (grid[r][c] == 1){
                area = maxOf(area, dfs(r,c))
            }
        }
    }


    return area
}