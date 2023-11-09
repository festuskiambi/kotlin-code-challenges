package dynamicProgramming

fun main() {
    val test = "026"
    println(numDecodings(test))
}

fun numDecodings(s: String): Int {
    if(s.length == 1){
        return  if(s[0]== '0') 0 else 1
    }

    val dp = IntArray(s.length + 1).apply {
        this[lastIndex - 1] = if (s.last() == '0') 0 else 1
        this[lastIndex] = if("${s[s.lastIndex -1]}${s[s.lastIndex]}".toInt() <= 26) 1 else 0
    }

    for(i in s.lastIndex -1 downTo 0){
        if(s[i] == '0'){
            dp[i] = 0
            continue
        }

        dp[i] += dp[i + 1]
        dp[i] += dp[i+2].takeIf{
            (s[i] == '1' && s[i+1] in '0'..'9') || (s[i] == '2' && s[i+1] in '0'..'6')
        } ?: 0
    }

    return dp[0]
}