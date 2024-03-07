package sorting

fun main() {
    val arrayToSort = intArrayOf(64, 25, 12, 22, 11)

    println("Original Array: ${arrayToSort.contentToString()}")

    insertionSort(arrayToSort)

    println("Sorted Array: ${arrayToSort.contentToString()}")
}

fun insertionSort(arr: IntArray) {

    val n = arr.size

    for (i in 1 until n) {
        val temp = arr[i]
        var j = i
        while (j > 0 && arr[j - 1] > temp) {
            arr[j] = arr[j -1]
            j--
        }
        arr[j] = temp
    }
}