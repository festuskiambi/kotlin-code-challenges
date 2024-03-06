package sorting

fun main() {
    val arrayToSort = intArrayOf(64, 34, 25, 12, 22, 11, 90)

    println("Original Array: ${arrayToSort.contentToString()}")

    bubbleSort(arrayToSort)

    println("Sorted Array: ${arrayToSort.contentToString()}")
}

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
}