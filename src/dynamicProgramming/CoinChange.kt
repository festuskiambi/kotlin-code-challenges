fun main() {
    val coins = intArrayOf(1, 2, 5)
    println(coinChange(coins, 11))
}

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1) { amount + 1 }

    dp[0] = 0

    for (a in 1 until amount + 1) {
        for (c in coins) {
            if (a - c >= 0) {
                dp[a] = minOf(dp[a], 1 + dp[a - c])
            }
        }
    }

    return if (dp[amount] < amount + 1) dp[amount] else -1
}