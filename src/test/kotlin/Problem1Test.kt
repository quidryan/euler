import org.junit.Test
import kotlin.test.assertEquals

internal class Problem1Test {

    val problem = Problem1()

    @Test
    fun solve() {
        assertEquals(233168, problem.solve().result)
    }
}