package dynamicProgramming


fun main() {
    val test = "leetcode"
    val wordDict = listOf("leet", "code")

    println(wordBreak(test, wordDict))
}

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val dp = BooleanArray(s.length + 1)
    dp[s.length] = true

    for (c in s.length - 1 downTo 0) {
        for (w in wordDict) {
            if (c + w.length <= s.length && s.substring(c, c + w.length) == w) {
                if (dp[c + w.length]) {
                    dp[c] = true
                }
            }
        }
    }

    return dp[0]
}