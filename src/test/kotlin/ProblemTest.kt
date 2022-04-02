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
        assertEquals( 29, Problem3().solve(13195).result)
        assertEquals( 6857, Problem3().solve(600851475143).result)
    }

    @Test
    fun solve4() {
        //assertEquals( 9009, Problem4().solve(2).result)
        assertEquals( 906609, Problem4().solve(3).result)
    }

    @Test
    fun solve5() {
        assertEquals( 2520, Problem5().solve(10).result)
        assertEquals( 232792560, Problem5().solve(20).result)
    }

    @Test
    fun solve6() {
        assertEquals( 2640, Problem6().solve(10).result)
        assertEquals( 25164150, Problem6().solve(100).result)
    }

    @Test
    fun solve7() {
        assertEquals( 13, Problem7().solve(6).result)
        assertEquals( 104743, Problem7().solve(10001).result)
    }

    @Test
    fun solve8() {
        assertEquals( 5832, Problem8().solve(4).result)
        assertEquals( 23514624000, Problem8().solve(13).result)
    }

}