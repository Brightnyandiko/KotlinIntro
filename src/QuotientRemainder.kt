fun main() {
    print("Enter a number i: ")
    val i = Integer.valueOf(readln())

    println("")

    print("Enter another number j: ")
    val j = Integer.valueOf(readln())

    println("")

    val quotient = i / j
    val remainder = i % j


    println("quotient of the two numbers is: $quotient")
    println("")
    print("remainder of the two numbers is: $remainder")


}