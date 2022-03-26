interface EulerProblem<T> {
    fun solve(t: T): EulerSolution<T>
}

class EulerSolution<T>(t: T){
    val result = t
}