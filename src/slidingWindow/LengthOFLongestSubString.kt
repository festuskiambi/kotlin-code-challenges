package slidingWindow

fun main() {
    // test expect 3
    val test = "abcabcbb"

    println(lengthOfLongestSubstring(test))
}

fun lengthOfLongestSubstring(s: String): Int {
    var result = 0
    var left = 0
    var charSet = mutableSetOf<Char>()

    for (right in 0 until s.length) {
        while (charSet.contains(s[right])) {
            charSet.remove(s[left])
            left++
        }
        charSet.add(s[right])

        result = maxOf(result, right - left + 1)
    }
    return result
}