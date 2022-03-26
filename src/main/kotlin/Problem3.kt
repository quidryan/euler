/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 : EulerProblem<Long> {

    fun primeFactors(starting: Long): List<Long> {
        // Print the number of 2s that divide n
        var n = starting
        val factors = mutableListOf<Long>()
        while (n % 2 == 0L) {
            factors.add(2)
            n /= 2
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        var i = 3L
        while (i <= Math.sqrt(n.toDouble())) {

            // While i divides n, print i and divide n
            while (n % i == 0L) {
                factors.add(i)
                n /= i
            }
            i += 2
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) factors.add(n)

        return factors
    }

    override fun solve(t: Long): EulerSolution<Long> {
        return EulerSolution(primeFactors(t).last())
    }

}