class Day2 {
    fun calculatePosition(commands: List<String>): Int {
        var horizontal = 0
        var depth = 0

        commands.forEach {
            val parts = it.split(" ")
            val direction = parts[0]
            val distance = parts[1].toInt()

            if (direction == "forward") {
                horizontal += distance
            } else if (direction == "down") {
                depth += distance
            } else if (direction == "up") {
                depth -= distance
            }
        }

        return depth * horizontal
    }

    fun calculatePositionWithAim(commands: List<String>): Int {
        var aim = 0
        var horizontal = 0
        var depth = 0

        commands.forEach {
            val parts = it.split(" ")
            val direction = parts[0]
            val distance = parts[1].toInt()

            if (direction == "forward") {
                horizontal += distance
                depth += (aim * distance)
            } else if (direction == "down") {
                aim += distance
            } else if (direction == "up") {
                aim -= distance
            }
        }

        return depth * horizontal
    }
}

fun main() {
    val fileContent = Day2::class.java.getResource("/Day2.txt").readText().split('\n')
    println(Day2().calculatePositionWithAim(fileContent))
}