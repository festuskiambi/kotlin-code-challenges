package Intervals


/**
 * Given an array of intervals intervals where intervals[i] = [starti, endi],
 * return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
 */
fun main(){

    // expect 1

    val test = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 3),
        intArrayOf(3, 4),
        intArrayOf(1, 3),
    )

    println(eraseOverlapIntervals(test))
}
fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {

    intervals.sortBy { it.first() }
    var count = 0

    var prevEnd = intervals[0][1]

    for(i in 1 until intervals.size){
        if (intervals[i][0] >= prevEnd){
            prevEnd = intervals[i][1]
        } else {
            count ++
            prevEnd =minOf(prevEnd, intervals[i][1])
        }
    }

    return count
}