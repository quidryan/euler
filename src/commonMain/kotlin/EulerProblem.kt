interface EulerProblem<T> {
    fun solve() : EulerSolution<T>
}

class EulerSolution<T>(t: T){
    val result = t
}