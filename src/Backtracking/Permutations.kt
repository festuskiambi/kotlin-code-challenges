package Backtracking

fun main() {
val test = intArrayOf(1,2,3)

//expect [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    println(permute(test))
}


fun permute(nums: IntArray): List<MutableList<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    val queue = ArrayDeque<Int>(nums.toList())

    if(nums.size == 1){
        return listOf(queue.toMutableList())
    }

    for (i in nums.indices){
        val n = queue.removeFirst()
        val perms = permute(queue.toIntArray())

        for (perm in perms){
            perm.add(n)
            result.add(perm)
        }
        queue.addLast(n)
    }

    return result
}