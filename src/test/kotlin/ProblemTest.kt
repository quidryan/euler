import org.junit.Test
import kotlin.test.assertEquals

internal class ProblemTest {

    @Test
    fun solve1() {
        assertEquals(233168, Problem1().solve(1000).result)
    }

    @Test
    fun solve2() {
        assertEquals(4613732, Problem2().solve(4_000_000).result)
    }

    @Test
    fun solve3() {
        assertEquals( 6857, Problem3().solve(600851475143).result)
    }

}