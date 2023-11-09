package graphs

fun main() {
    val heights = arrayOf(
        intArrayOf(1,2,2,3,5),
        intArrayOf(3,2,3,4,4),
        intArrayOf(2,4,5,3,1),
        intArrayOf(6,7,1,4,5),
        intArrayOf(5,1,1,2,4)
    )


    val heights1 = arrayOf(
        intArrayOf(1,1),
        intArrayOf(1,1),
        intArrayOf(1,1),
    )
    println(pacificAtlantic(heights1))
}

fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
    if (heights.isNullOrEmpty()) return listOf(listOf())
    val result = mutableListOf<List<Int>>()

    val pacific = Array(heights.size) { BooleanArray(heights[0].size) }
    val atlantic = Array(heights.size) { BooleanArray(heights[0].size) }

    for (i in 0 until heights.size ) {

        dfs(0, i,Integer.MIN_VALUE, pacific, heights)
        dfs(heights.size - 1, i, Integer.MIN_VALUE, atlantic, heights)
    }

    for (j in 0 until heights[0].size) {
        dfs(j, 0, Integer.MIN_VALUE, pacific, heights)
        dfs(j, heights[0].size - 1, Integer.MIN_VALUE, atlantic, heights)
    }

    for (i in 0 until heights.size) {
        for (j in 0 until heights[0].size) {
            if (pacific[i][j] && atlantic[i][j]) {
                result.add(listOf(i, j))
            }
        }
    }

    return result
}

fun dfs(i: Int, j: Int, prevHeight: Int, visited: Array<BooleanArray>, heights: Array<IntArray>) {
    if (i < 0 || i == heights.size || j < 0 || j >= heights[0].size || visited[i][j] || heights[i][j] < prevHeight) {
        return
    }
    visited[i][j] = true
    dfs(i + 1, j, heights[i][j], visited, heights)
    dfs(i - 1, j, heights[i][j], visited, heights)
    dfs(i, j + 1, heights[i][j], visited, heights)
    dfs(i, j - 1, heights[i][j], visited, heights)
}