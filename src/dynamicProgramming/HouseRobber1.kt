fun main() {
    val test1housees = intArrayOf(1,2,3,1)

    println(houseRobber(test1housees))
    println(houseRobberVariable(test1housees))

}

fun houseRobber(houses: IntArray): Int {
    val dp = IntArray(houses.size + 1)
    dp[0] = 0
    dp[1] = houses[0]

    for (h in 1 until houses.size){
        dp[h+1] = maxOf(dp[h], houses[h] + dp[h-1])
    }

    return dp[houses.size]
}

fun houseRobberVariable(houses: IntArray): Int {
    var rob1 = 0
    var rob2 = 0

    for (h in houses){
        val temp = maxOf(h + rob1, rob2)
        rob1= rob2
        rob2 = temp
    }

    return rob2
}