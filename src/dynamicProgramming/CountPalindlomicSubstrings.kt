package dynamicProgramming

fun main() {
    val test = "aaa"

 println(countSubstrings(test) == 6)
    println('A' - '0')
}

fun countSubstrings(s: String): Int {
    var res = 0

    for (i in s.indices) {
        res += countPalindlimeLenght(i, i, s)
        res += countPalindlimeLenght(i, i+1, s)
    }

    return res
}

fun countPalindlimeLenght(l: Int, r: Int, s: String): Int {
    var res = 0
    var left = l
    var right = r
    while (left >= 0 && right < s.length && s[left] == s[right]) {
        res++
        left--
        right++
    }

    return res
}