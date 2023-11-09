fun main() {
 println(climbStairs(2))
 println(climbStairs(3))
 println(climbStairs(5))
}

fun climbStairs(n: Int): Int {

    if(n<= 3){
        return n
    }

    var prev = 2
    var current = 3

    for(i in 4..n){
        val temp = prev + current
        prev = current
        current = temp
    }

    return current
}