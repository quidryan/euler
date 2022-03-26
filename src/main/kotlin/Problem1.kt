/**
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 : EulerProblem<Int> {
    override fun solve(t: Int): EulerSolution<Int> {
        return EulerSolution(
            (1 until t)
            .filter { it % 3 == 0 || it % 5 == 0 }
            .sum())
    }

}