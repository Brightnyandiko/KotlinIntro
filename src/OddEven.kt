fun main() {
    print("Enter a number: ")
    val number= Integer.valueOf(readln())

    if(number % 2 == 0){
        println("this is an even number")
    }else
        println("this is an odd number")

    val evenOdd = if (number % 2 == 0) "even" else "odd"

    println("$number is $evenOdd number")
}