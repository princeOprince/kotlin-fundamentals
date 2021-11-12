package princeoprince

data class Person(val name: String)

fun main() {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

//    val people = meetings.map(Meeting::people)
    val people = meetings.flatMap(Meeting::people).distinct()

    println(people)

    for (p in people) println(p.name)
}