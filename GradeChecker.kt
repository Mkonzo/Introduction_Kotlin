class GradeChecker {
    fun checkGrade() {
        print("Enter marks: ")
        val marks = readLine()!!.toInt()

        when {
            marks >= 80 -> println("Grade A")
            marks >= 70 -> println("Grade B")
            marks >= 60 -> println("Grade C")
            marks >= 50 -> println("Grade D")
            else -> println("Grade E")
        }
    }
}
        fun main() {
            val checker = GradeChecker()
            checker.checkGrade()

}