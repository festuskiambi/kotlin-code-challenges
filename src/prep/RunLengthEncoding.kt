
fun main(){
 runLengthEncoding("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
}
fun runLengthEncoding(string: String): String {
    // Write your code here.
    var currentLetter = string[0]
    var currentLetterCount = 0
    var encodedStringList = mutableListOf<String>()
    for (i in string.indices){
        if (string[i] == currentLetter){
            currentLetterCount +=1
        } else {
            while (currentLetterCount > 9){
                encodedStringList.add("9$currentLetter")
                currentLetterCount -=9
            }
            encodedStringList.add("$currentLetterCount$currentLetter")
            currentLetter = string[i]
            currentLetterCount = 1
        }
    }
    while (currentLetterCount > 9){
        encodedStringList.add("9$currentLetter")
        currentLetterCount -=9
    }
    encodedStringList.add("$currentLetterCount$currentLetter")
    println(currentLetter)
    println(currentLetterCount)
    println(encodedStringList)



    return encodedStringList.joinToString("")
}