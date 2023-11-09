fun main() {
val test = intArrayOf(7,1,5,3,6,4)
    println(maxProfit(test))
}

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var left = 0
    var right = 1

    while (right < prices.size) {
       println(prices[left])
        if (prices[left] < prices[right]) {
            val profit = prices[right] - prices[left]
            maxProfit = maxOf(profit, maxProfit)
        } else {
            left = right
        }
        right++
    }

    return maxProfit
}