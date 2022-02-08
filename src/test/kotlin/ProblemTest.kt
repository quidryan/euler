import org.junit.Test
import kotlin.test.assertEquals

internal class ProblemTest {

    @Test
    fun solve1() {
        assertEquals(233168, Problem1().solve().result)
    }

    @Test
    fun solve2() {
        assertEquals(4613732, Problem2().solve().result)
    }
}