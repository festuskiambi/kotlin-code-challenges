package graphs

fun main() {
    val test = arrayOf<CharArray>(
        charArrayOf('X', 'X', 'X', 'X'),
        charArrayOf('X', 'O', 'O', 'X'),
        charArrayOf('X', 'X', 'O', 'X'),
        charArrayOf('X', 'O', 'X', 'X'),
    )
}

fun solve(board: Array<CharArray>): Unit {
    val rows = board.size
    val cols = board[0].size

    fun dfs(r: Int, c: Int) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O') {
            return
        }
        board[r][c] = 'T'

        dfs(r + 1, c)
        dfs(r - 1, c)
        dfs(r, c + 1)
        dfs(r, c - 1)

    }

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            if (r == 0 || r == rows - 1 || c == 0 || c == cols - 1) {
                if (board[r][c] == 'O') {
                    dfs(r, c)
                }
            }
        }
    }

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            if (board[r][c]=='O'){
                board[r][c] = 'X'
            }
        }
    }

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            if (board[r][c]=='T'){
                board[r][c] = 'O'
            }
        }
    }

}