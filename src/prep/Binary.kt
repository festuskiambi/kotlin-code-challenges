fun main(args: Array<String>) {
    val num: Long? = "z1111100010001".toLongOrNull()
    val decimal = num?.let { convertBinaryToDecimal(it) }

    println("$num in binary = $decimal in decimal")

    val binary = decimal?.let { Integer.toBinaryString(it) }
    println("$decimal in decimal = $binary in binary")
    println(45.67.toInt())

}

fun convertBinaryToDecimal(binaryNuber: Long): Int {
    var num = binaryNuber
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}