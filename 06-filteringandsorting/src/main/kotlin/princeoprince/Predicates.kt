package princeoprince

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)
    val greaterThanThree = { v: Int -> v > 3 }

    var largeInts = ints.all(greaterThanThree)
    println(largeInts)
    largeInts = ints.any(greaterThanThree)
    println(largeInts)
    val numberOfLargeInts = ints.count(greaterThanThree)
    println(numberOfLargeInts)
    var found = ints.find(greaterThanThree)
    println(found)
    found = ints.find { it > 6 }
    println(largeInts)
}