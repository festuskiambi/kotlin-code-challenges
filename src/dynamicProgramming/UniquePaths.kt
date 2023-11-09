package dynamicProgramming

fun main() {
    println(uniquePaths(3, 7))
}

fun uniquePaths(m: Int, n: Int): Int {
    val dp = Array(m + 1) { IntArray(n + 1) { 0 } }
    val indexM = m - 1
    val indexn = n - 1

    for (i in indexM downTo 0) {
        for (j in indexn downTo 0) {
            if (i == indexM && j == indexn) {
                dp[i][j] = 1
            } else {
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1]
            }
        }
    }

    return dp[0][0]
}