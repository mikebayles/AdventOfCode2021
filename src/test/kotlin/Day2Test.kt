import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day2Test {

    @Test
    fun `part 1 sample input`() {
        val input = listOf(
                "forward 5",
                "down 5",
                "forward 8",
                "up 3",
                "down 8",
                "forward 2",
        )

        val actual = Day2().calculatePosition(input)

        assertEquals(150, actual)
    }

    @Test
    fun `part 2 sample input`() {
        val input = listOf(
                "forward 5",
                "down 5",
                "forward 8",
                "up 3",
                "down 8",
                "forward 2",
        )

        val actual = Day2().calculatePositionWithAim(input)

        assertEquals(900, actual)
    }
}

