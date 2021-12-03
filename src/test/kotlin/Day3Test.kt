import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day3Test {
    @Test
    fun `part 1 sample input`() {
        val input = listOf(
                "00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010",
        )

        val actual = Day3().calculatePowerConsumption(input)

        assertEquals(198, actual)
    }

    @Test
    fun `part 2 sample input`() {
        val input = listOf(
                "00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010",
        )

        val actual = Day3().calculateLifeSupportRating(input)

        assertEquals(230, actual)
    }
}