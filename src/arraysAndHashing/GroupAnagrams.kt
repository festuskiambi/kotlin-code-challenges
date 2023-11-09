fun main() {
    val str = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

    println(groupAnagrams(str))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val anagramMap = hashMapOf<String, MutableList<String>>()

    for (s in strs) {
        val count = IntArray(26)

        for (c in s) {
            val index = c - 'a'
            count[index] += 1
        }

        anagramMap[count.joinToString()] =
            anagramMap.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(s) }
    }

    return anagramMap.values.toList()

}