package Backtracking

fun main() {
    val board: Array<CharArray> = arrayOf(
        charArrayOf('A','B','C','E'),
        charArrayOf('S','F','C','S'),
        charArrayOf('A','D','E','E'),
    )
     println(exist(board,"SEE"))
}

fun exist(board: Array<CharArray>, word: String): Boolean {
    for (r in 0 until board.size) {
        for (c in 0 until board[0].size) {
            if (dfs(r, c, 0, board, word)) return true
        }
    }
    return false
}

fun dfs(r: Int, c: Int, i: Int, board: Array<CharArray>, word: String): Boolean {
    if (i == word.length) {
        return true
    }

    if (r < 0 || r >= board.size || c < 0 || c >= board[0].size || word[i] != board[r][c]) {
        return false
    }
    board[r][c] = '#'

    val result = (dfs(r + 1, c, i + 1, board, word)) or
            (dfs(r - 1, c, i + 1, board, word)) or
            (dfs(r, c + 1, i + 1, board, word)) or
            (dfs(r, c - 1, i + 1, board, word))

    board[r][c] = word[i]

    return result
}