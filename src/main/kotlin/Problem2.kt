/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
class Problem2 : EulerProblem<Int> {

    fun fibonacci() = sequence {
        var terms = Pair(0, 1)
        // this sequence is infinite
        while (true) {
            yield(terms.first)
            terms = Pair(terms.second, terms.first + terms.second)
        }
    }

    override fun solve(t: Int): EulerSolution<Int> {
        return EulerSolution(
            fibonacci()
                .takeWhile { it < t }
                .filter { it % 2 == 0 }
                .sum())
    }

}