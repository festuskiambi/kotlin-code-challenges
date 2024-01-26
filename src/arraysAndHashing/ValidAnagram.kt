package arraysAndHashing

fun main() {
    //test expect true

    val s = "anagram"
    val t = "nagaram"

    println(isAnagram(s, t))

}

fun isAnagram(s: String, t: String): Boolean {
    val charCountS = IntArray(26)
    val charCountT = IntArray(26)

    for( c in s){
        val index = c - 'a'
        charCountS[index] +=1
    }

    for( c in t){
        val index = c - 'a'
        charCountT[index] +=1
    }

    return charCountS.joinToString() == charCountT.joinToString()
}