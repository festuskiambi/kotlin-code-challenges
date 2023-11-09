package dynamicProgramming

fun main() {
    val test1 = "babad"
    println(longestPalindromeString(test1))
    val test2 = "cbbd"
    println(longestPalindromeString(test2))
    val test3 = "tattarrattat"
    println(longestPalindromeString(test3))



}

fun longestPalindromeString(s: String): String {
    var res = ""
    var longestLength = 0
    for (i in 0 until s.length) {
        //odd palindlomes
        var oddLeft = i
        var oddRight = i

        while (oddLeft >= 0 && oddRight < s.length && s[oddLeft] == s[oddRight]) {
            if (oddRight - oddLeft + 1 > longestLength) {
                res = s.substring(oddLeft, oddRight + 1)
                longestLength = oddRight-oddLeft + 1
            }
            oddLeft--
            oddRight++
        }

        //even palindlomes
        var evenLeft = i
        var evenRight = i + 1

        while (evenLeft >= 0 && evenRight < s.length && s[evenLeft] == s[evenRight]) {
            if (evenRight - evenLeft + 1 > longestLength) {
                res = s.substring(evenLeft, evenRight + 1)
                longestLength = evenRight-evenLeft + 1

            }
            evenLeft--
            evenRight++
        }

    }

//    for (i in 0 until s.length) {
//        //odd palindlomes
//        var oddLeft = i
//        var oddRight = i
//
//        println(oddLeft)
//        while (oddLeft >= 0 && oddRight < s.length && s[oddLeft] == s[oddRight]) {
//            if (oddRight - oddLeft + 1 > longestLength) {
//                res = s.substring(oddLeft, oddRight + 1)
//            }
//            oddLeft--
//            oddRight++
//        }
//
//        //even palindlomes
//        var evenLeft = i
//        var evenRight = i + 1
//        println(evenLeft.toString()+"eve")
//
//        while (evenLeft >= 0 && evenRight < s.length && s[evenLeft] == s[evenRight]) {
//            if (evenRight - evenLeft + 1 > longestLength) {
//                res = s.substring(evenLeft, evenRight + 1)
//            }
//            evenLeft--
//            evenRight++
//        }
//
//    }


    return res
}