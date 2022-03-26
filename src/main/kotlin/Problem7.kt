/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
class Problem7 : EulerProblem<Int> {
    fun isPrimeNumber(num: Int): Boolean {
        var flag = true

        for (i in 2..num / 2) {

            if (num % i == 0) {
                flag = false
                break
            }
        }

        return flag
    }

    override fun solve(t: Int): EulerSolution<Int> {
        return EulerSolution(
            generateSequence(1) { it + 1 }
            .filter { isPrimeNumber(it) }
            .take(t+1)
            .last()
        )
    }
}