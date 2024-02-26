fun main() {
    print("Enter a decimal number x: ")
    var x = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter a decimal number y: ")
    var y = readLine()?.toDoubleOrNull() ?: 0.0

    val product = x * y
    println("The product of the two numbers is: %.2f".format(product))
}