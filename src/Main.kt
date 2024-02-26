import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("enter a number: ")

    var integer= reader.nextInt()
    println("You have entered: $integer")

    //How to print an integer without using scanner
    println("Enter a number: ")

    val input= readln()
    println("you entered: $input")
}