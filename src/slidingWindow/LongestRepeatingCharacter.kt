import java.util.Collections.max

/**
 * 424. Longest Repeating Character Replacement

 * You are given a string s and an integer k. You can choose any character of the string and change it to
 * any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */

fun main() {
    //test expect 4
    val test  = "ABAB"
    val k = 2

    println(characterReplacement(test, k))

    // test2 expect 4
    val test2  = "AABABBA"
    val k2 = 1
    println(characterReplacement(test2, k2))

}

fun characterReplacement(s: String, k: Int): Int {
    var result = 0
    val count = hashMapOf<Char, Int>()
    var left = 0

    for (right in 0 until s.length) {
        count[s[right]] = count.getOrDefault(s[right], 0) + 1

        while ((right - left + 1) - max(count.values) > k) {
            count[s[left]] = count.getOrDefault(s[left], 0) - 1
            left++
        }

       result = maxOf(result, right-left+1)
    }

    return result
}