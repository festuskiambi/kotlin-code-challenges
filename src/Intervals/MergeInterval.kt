package Intervals

import java.util.*

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */

fun main() {
    // expect [[1,6],[8,10],[15,18]]

    val test = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(2, 6),
        intArrayOf(8, 10),
        intArrayOf(15, 18),
    )


    println(merge(test).map { it.contentToString() })
}

fun merge(intervals: Array<IntArray>): Array<IntArray> {

    intervals.sortBy { it.first() }

    val res = LinkedList<IntArray>()

    for (interval in intervals) {
        if (res.size == 0 || res.last[1] < interval[0]) {
            res.add(interval)
        } else {
            res.last[1] = maxOf(res.last[1], interval[1])
        }
    }

    return res.toTypedArray()

}