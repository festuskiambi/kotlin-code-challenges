package Greedy

fun main() {
    val test = listOf(
        intArrayOf(5, 1),
        intArrayOf(2, 1),
        intArrayOf(1, 1),
        intArrayOf(8, 1),
        intArrayOf(10, 0),
        intArrayOf(5, 0),

        )

    println(luckBalance(3, test.toTypedArray()))
}

fun luckBalance(k: Int, contests: Array<IntArray>): Int {
    val sortedContest = contests.sortedByDescending { it[0] }
    var sum = 0
    var k = k


    for (contest in sortedContest) {
        if (contest[1] == 0 ) {
          sum += contest[0]
        } else if(contest[1] == 1 && k > 0){
            sum += contest[0]
            k --
        } else sum -= contest[0]
    }

    return sum
}

