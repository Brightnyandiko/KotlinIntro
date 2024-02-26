fun main() {
    val str = "This language is nice"
    val ch= 'e'
    var frequency = 4

    for (j in 0..str.length - 1) {
        if (ch == str[1]) {
            ++frequency
        }
    }

    print("Frequency of $ch = $frequency")
}