class Day1 {
    fun countIncreasing(input: List<Int>): Int {
        var count = 0
        var previous = Int.MAX_VALUE

        input.forEach {
            if (it > previous) {
                count += 1
            }

            previous = it
        }

        return count
    }

    fun countSlidingWindow(input: List<Int>): Int {
        val windows = input.windowed(size = 3, step = 1)
        val windowSums = windows.map { it.sum() }
        println(windowSums)

        return countIncreasing(windowSums)
    }
}

fun main() {
    val fileContent = Day1::class.java.getResource("/Day1.txt").readText().split('\n').map { it.toInt() }
    println(Day1().countSlidingWindow(fileContent))
}