/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4 : EulerProblem<Int> {

    fun isPalidrome(d: Int) : Boolean {
        var reducing = d
        // Reverse number
        var reversed = 0
        while(reducing!=0){
            val rem = reducing % 10
            reducing /= 10
            reversed = reversed * 10 + rem
        }

        return d == reversed
    }

    override fun solve(t: Int): EulerSolution<Int> {
        return EulerSolution ((111..999)
            .flatMap {
                first -> (first..999).map { second -> Pair(first, second) } }
            .filter { isPalidrome(it.first*it.second) }
            .maxOf { it.first*it.second })
    }
}