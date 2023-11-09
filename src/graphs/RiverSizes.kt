fun main(args: Array<String>) {
    println(
        riverSizes(
            listOf(
                listOf(1, 0, 0, 1, 0),
                listOf(1, 0, 1, 0, 0),
                listOf(0, 0, 1, 0, 1),
                listOf(1, 0, 1, 0, 1),
                listOf(1, 0, 1, 1, 0)
            )
        )
    )
}

fun riverSizes(matrix: List<List<Int>>): List<Int> {
    println(matrix)
    // Write your code here.
    val result = mutableListOf<Int>()
    val visited = mutableListOf<MutableList<Boolean>>()

    for (i in matrix) {
        val vals = mutableListOf<Boolean>()
        for (j in matrix[0]) {
            vals.add(false)
        }
        visited.add(vals)
    }

    for (i in matrix.indices) {
        for (j in matrix[i].indices ) {

            if (visited[i][j]) {
                continue
            } else {
                traverseNode(i, j, matrix, visited, result)
            }

        }

    }
    return result

}

fun traverseNode(
    i: Int,
    j: Int,
    matrix: List<List<Int>>,
    visited: MutableList<MutableList<Boolean>>,
    result: MutableList<Int>
) {
    var currentRiverSize = 0
    val nodesToExplore = mutableListOf<MutableList<Int>>()
    nodesToExplore.add(mutableListOf(i, j))
    while (nodesToExplore.isNotEmpty()) {
        println(nodesToExplore)
        val currentNode = nodesToExplore.removeAt(0)
        val first = currentNode[0]
        val sec = currentNode[1]
        if (visited[first][sec]) {
            continue
        }
        visited[first][sec] = true

        if (matrix[first][sec] == 0) {
            continue
        }
        currentRiverSize += 1
        val unvisitedNeighbours = getUnvisitedNeighbours(first, sec, matrix, visited)
        for (item in unvisitedNeighbours) {
            nodesToExplore.add(item)
        }
    }
    if(currentRiverSize > 0) result.add(currentRiverSize)

}

fun getUnvisitedNeighbours(
    i: Int,
    j: Int,
    matrix: List<List<Int>>,
    visited: MutableList<MutableList<Boolean>>
): MutableList<MutableList<Int>> {
    val unvisited = mutableListOf<MutableList<Int>>()

    if (i > 0 && !visited[i - 1][j]) {
        unvisited.add(mutableListOf(i - 1, j))
    }
    if (i < (matrix.size)-1 && !visited[i + 1][j]) {
        unvisited.add(mutableListOf(i + 1, j))
    }

    if (j > 0 && !visited[i][j - 1]) {
        unvisited.add(mutableListOf(i, j - 1))
    }

    if (j < (matrix[0].size)-1  && !visited[i][j+1]){
        unvisited.add(mutableListOf(i, j+1))
    }

    return unvisited
}
