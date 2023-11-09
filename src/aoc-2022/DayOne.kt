import java.io.File

/*
* Link to the challenge  https://adventofcode.com/2022/day/1
*
*  */

fun main() {
    val input = File("src/aoc-2022/day01-input.txt").readText()

    check(part1(input) == 72602)

    println(part1(input))
    println(part2(input))
}

fun part1(input: String): Int {
    val data = parseString(input)
    return data.maxOf { it.sum() }
}

fun part2(input: String): Int {
    val data = parseString(input)

    println(data)
    println(data.map { it.sum() })

    return data
        .map { it.sum() }
        .sortedDescending()
        .take(3)
        .sum()


}

private fun parseString(input: String) = input.split("\n\n").map { elf ->
    elf.lines().map { it.toInt() }
}



