import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val left = ArrayList<Int>()
        val right = ArrayList<Int>()
        for (line in input) {
            left.add(Integer.valueOf(line.split("   ")[0]))
            right.add(Integer.valueOf(line.split("   ")[1]))
        }
        left.sort()
        right.sort()
        var total = 0;
        for (x in 0..<left.size) {
            total += abs(left[x] - right[x])
        }
        return total
    }

    fun part2(input: List<String>): Int {
        val left = ArrayList<Int>()
        val right = ArrayList<Int>()
        for (line in input) {
            left.add(Integer.valueOf(line.split("   ")[0]))
            right.add(Integer.valueOf(line.split("   ")[1]))
        }
        left.sort()
        right.sort()
        var total = 0;
        for (x in 0..<left.size) {
            total += left[x] * right.count { it == left[x] }
        }
        return total
    }

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("day1_test")
    check(part1(testInput) == 11)
    check(part2(testInput) == 31)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("day1")
    part1(input).println()
    part2(input).println()
}
