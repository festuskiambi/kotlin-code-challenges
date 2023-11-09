package dynamicProgramming

fun main() {
    val text2 = "ace"
    val text1 = "abcde"
    println(longestCommonSubsequence(text1, text2))
}

fun longestCommonSubsequence(text1: String, text2: String): Int {
    val dp = Array(text2.length + 1) { IntArray(text1.length + 1) { 0 } }

    for (i in text2.length - 1 downTo 0) {
        for (j in text1.length - 1 downTo 0) {
            if (text2[i] == text1[j]) {
                dp[i][j] = dp[i +1][j+1] + 1
            } else {
                dp[i][j] = maxOf(dp[i + 1][j], dp[i][j + 1])
            }
        }
    }

    return dp[0][0]
}