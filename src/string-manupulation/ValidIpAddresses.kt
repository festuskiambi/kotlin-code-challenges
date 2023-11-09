package `string-manupulation`

fun main() {
    val test1 = "121212"
    println(validIpAddresses(test1).size)
    println(validIpAddresses(test1).toString())
}

fun validIpAddresses(s: String): List<String> {
    //valid ip

    val res = mutableListOf<String>()

    if (s.length < 3 || s.length > 12) {
        return res
    }

    for (i in 0 until s.length) {
        for (j in i + 1 until s.length) {
            for (k in j + 1 until s.length) {
                val ip = generateIp(s, i, j, k)

                if (ip.isNotBlank())
                    res.add(ip)
            }
        }
    }
    return res
}

fun generateIp(s: String, i: Int, j: Int, k: Int): String {
    var str = ""

    val s1 = s.substring(0, i + 1)
    val s2 = s.substring(i + 1, j + 1)
    val s3 = s.substring(j + 1, k + 1)
    val s4 = s.substring(k + 1)

    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
        str = "$s1.$s2.$s3.$s4"
    }

    return str
}

fun isValid(s: String): Boolean {
    if (s.length <= 0 || s.length > 3) {
        return false
    }
    if (s[0].digitToInt() == 0 && s.length < 2) {
        return false
    }

    if (s.toInt()< 0 || s.toInt()> 255){
        return false
    }

    return true
}