import java.util.*

fun main() {
println(isValid("()({{))"))
}

fun isValid(s: String): Boolean {
    val matchingBrackets = hashMapOf(
        '(' to ')',
        '[' to ']',
        '{' to '}',
    )

    val stack = Stack<Char>()

    for (c in s) {
        if (matchingBrackets.containsKey(c))
            stack.push(c)
        else if (stack.isEmpty() || matchingBrackets[stack.pop()] != c) {
            return false
        }
    }

    return stack.isEmpty()
}