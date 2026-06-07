class BMICalculator {
    fun calculate() {
        print("Enter weight (kg): ")
        val weight = readLine()!!.toDouble()

        print("Enter height (m): ")
        val height = readLine()!!.toDouble()

        val bmi = weight / (height * height)

        println("Your BMI is %.2f".format(bmi))

        when {
            bmi < 18.5 -> println("Underweight")
            bmi < 25 -> println("Normal weight")
            bmi < 30 -> println("Overweight")
            else -> println("Obese")
        }
    }
}
    fun main() {
        val calculator = BMICalculator()
        calculator.calculate()
}