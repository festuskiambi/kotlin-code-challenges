fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
   reverseWordsInString("a ab a")
}

fun reverseWordsInString(string: String): String {
    var beginWordIndex = 0
    val wordsList = mutableListOf<Any>()
    for (i in string.indices){
     if (string[i].isWhitespace()) {
         println(i)
//         wordsList.add(string.subSequence(beginWordIndex..i-1))
         wordsList.add(string[i])
         beginWordIndex = i+1
     }
    }
    wordsList.add(string.slice(beginWordIndex..string.length-1))
    val reversedWordsList = mutableListOf<Any>()
    for(i in wordsList.size-1 downTo 0){
     reversedWordsList.add(wordsList[i])
    }
    println(string.length)
    println(reversedWordsList.joinToString(""))
    println(reversedWordsList.joinToString("").length)

    return reversedWordsList.joinToString("")
}
