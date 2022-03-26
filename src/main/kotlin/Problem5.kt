/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem5 : EulerProblem<Int> {

    fun evenly(num: Int, max: Int) : Boolean {
        return (1..max).takeWhile { num % it == 0 }.size == max
    }

    override fun solve(t: Int): EulerSolution<Int> {
        val smallest = generateSequence(1) { it + 1 }
            .filter { evenly(it, t) }
            .first()
        return EulerSolution (smallest)
    }
}