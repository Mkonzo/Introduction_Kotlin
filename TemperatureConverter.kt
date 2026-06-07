class TemperatureConverter {

    fun covertTemperature() {
        print("Enter temperature in Celsius: ")
        val celsius = readLine()!!.toDouble()

        val fahrenheit = (celsius * 9 / 5) + 32

        println("$celsius °C = $fahrenheit °F")
    }
}

fun main() {
    val converter = TemperatureConverter()
    converter.covertTemperature()

}