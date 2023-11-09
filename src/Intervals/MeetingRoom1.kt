package Intervals

fun meetingRoom1(intervals: Array<IntArray>): Boolean {
    intervals.sortBy { it.first() }
    var prevEnd = intervals[0][1]

    for (i in 1 until intervals.size) {
        if (intervals[i][0] < prevEnd) {
            return false
        }

    }

    return true
}