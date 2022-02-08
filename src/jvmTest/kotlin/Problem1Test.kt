import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problem1Test {

    val problem = Problem1()

    @Test
    fun solve() {
        assertEquals(233168, problem.solve().result)
    }
}