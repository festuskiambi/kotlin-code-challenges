package sorting

fun main() {
    val arrayToSort = intArrayOf(64, 25, 12, 22, 11)

    println("Original Array: ${arrayToSort.contentToString()}")

    selectionSort(arrayToSort)

    println("Sorted Array: ${arrayToSort.contentToString()}")
}

fun selectionSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n) {
        var minIn = i

        for (j in i + 1 until n) {
            if (arr[j] < arr[minIn]) {
                minIn = j
            }
        }
        val temp = arr[minIn]
        arr[minIn] = arr[i]

        arr[i] = temp

    }
}