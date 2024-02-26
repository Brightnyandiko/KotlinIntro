import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val number: Double = reader.nextDouble()

    print("When rounded off, the number is: %4f".format(number))
}