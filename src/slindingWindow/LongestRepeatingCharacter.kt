import java.util.Collections.max

fun main() {
    val test  = "ABAB"
    val k = 2

    println(characterReplacement(test, k))


    val test2  = "AABABBA"
    val k2 = 1

    println(characterReplacement(test, k))

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