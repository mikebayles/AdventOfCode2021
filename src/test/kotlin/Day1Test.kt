import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun `part 1 sample input is correct`() {
        val input = listOf(
                199,
                200,
                208,
                210,
                200,
                207,
                240,
                269,
                260,
                263)

        val actual = Day1().countIncreasing(input)

        assertEquals(7, actual)
    }

    @Test
    fun `part 2 sample input is correct`() {
        val input = listOf(
                199,
                200,
                208,
                210,
                200,
                207,
                240,
                269,
                260,
                263)

        val actual = Day1().countSlidingWindow(input)

        assertEquals(5, actual)
    }
}