package arraysAndHashing

fun main() {
 //encode and decode test test expect
    // expect ["Lint", "Code", "Love", "You"]

    val strs = listOf("Lint", "Code", "Love", "You")

    val str = encode(strs)

    println(str)

    val result = decode(str)

    println(result)



}

fun encode(strs: List<String>): String {
    var result = ""
    for (str in strs) {
        val enc = "${str.length}#${str}"
        println(enc)
        result += enc

        println(result)
    }

    return result
}

fun decode(str: String): List<String> {
    val result = mutableListOf<String>()
    var i = 0

    while(i < str.length){
        var j = i
        while (str[j] !='#'){
            j++
        }
        val length = str.substring(i,j).toInt()
        val word = str.substring(j+1, j+1+length)
        result.add(word)
        i = j+1+length
    }

    return result
}