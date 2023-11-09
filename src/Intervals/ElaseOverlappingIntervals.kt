package Intervals

fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
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