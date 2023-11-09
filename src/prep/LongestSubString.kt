fun main() {
    val test = ""
    println(lengthOfLongestSubstring(test))
}

fun lengthOfLongestSubstring(s: String): Int {

    val charSet = mutableSetOf<Char>()
    var left = 0
    var right = 1
    var result = 0

    for (r in 0 until s.length ){
      println(  s[r])

        while (charSet.contains(s[r])){
            charSet.remove(s[left])
            left ++
        }
        charSet.add(s[r])

        result = maxOf(result, r-left + 1)
    }

    return result

}