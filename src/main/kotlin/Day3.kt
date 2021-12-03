class Day3 {
    private fun getBitCounts(input: List<String>): IntArray {
        val lineLength = input[0].length
        val counts = IntArray(lineLength) { 0 }

        input.forEach { line ->
            line.forEachIndexed { index, bit ->
                if (bit == '1') {
                    counts[index] += 1
                }
            }
        }

        return counts
    }


    fun calculatePowerConsumption(input: List<String>): Int {
        val counts = getBitCounts(input)

        println(counts.toList())

        val gamma = counts.map { if (it >= input.size / 2) 1 else 0 }.joinToString(separator = "")
        val epsilon = counts.map { if (it >= input.size / 2) 0 else 1 }.joinToString(separator = "")

        return Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2)
    }

    fun calculateLifeSupportRating(input: List<String>): Int {
        return calculateOxygen(input.map { it }) * calculateC02(input.map { it })
    }

    private fun calculateOxygen(input: List<String>): Int {
        val lineLength = input[0].length

        var currentInput = input

        for (index in 0 until lineLength) {
            if (currentInput.size == 1) {
                break
            }
            val counts = getBitCounts(currentInput)
            val mostPopular = if (counts[index] >= currentInput.size - counts[index]) '1' else '0'
            currentInput = currentInput.filter { it[index] == mostPopular }

        }


        return Integer.parseInt(currentInput[0], 2)
    }

    private fun calculateC02(input: List<String>): Int {
        val lineLength = input[0].length

        var currentInput = input

        for (index in 0 until lineLength) {
            if (currentInput.size == 1) {
                break
            }
            val counts = getBitCounts(currentInput)
            val mostPopular = if (counts[index] >= currentInput.size - counts[index]) '0' else '1'
            currentInput = currentInput.filter { it[index] == mostPopular }

        }

        return Integer.parseInt(currentInput[0], 2)
    }
}

fun main() {
    val fileContent = Day3::class.java.getResource("/Day3.txt").readText().split('\n')
    println(Day3().calculateLifeSupportRating(fileContent))
}