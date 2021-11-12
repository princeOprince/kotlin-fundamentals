package princeoprince

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < 4 }

    for (i: Int in smallInts) println(i)

    println()

    val squaredInts = ints.map { it * it }

    for (i: Int in squaredInts) println(i)

    println()

    val smallSquaredInts = ints.filter { it < 5 }.map { it * it }

    for (i: Int in smallSquaredInts) println(i)

    println()

//    TRANSFORM FROM ONE TYPE TO ANOTHER
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

//    val titles = meetings.map { it.title }
    val titles = meetings.filter { it.title.startsWith("C") }.map { it.title }
    for (t in titles) println(t)
}

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Sam"), Person("Alex"))
}
