package princeoprince

import java.util.*

fun main() {
//    region FILTER AND MAP
//    val ints = listOf(1, 2, 3, 4, 5)
//
//    val smallInts = ints.filter { it < 4 }
//
//    for (i: Int in smallInts) println(i)
//
//    println()
//
//    val squaredInts = ints.map { it * it }
//
//    for (i: Int in squaredInts) println(i)
//
//    println()
//
//    val smallSquaredInts = ints.filter { it < 5 }.map { it * it }
//
//    for (i: Int in smallSquaredInts) println(i)
//
//    println()
//    endregion

//    region TRANSFORM FROM ONE TYPE TO ANOTHER
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))
//
//    val titles = meetings.map { it.title }
//    val titles = meetings
//            .filter { println("filter($it)"); it.title.startsWith("C") }
//            .map { println("map($it)"); it.title }
//    println()
//    for (t in titles) println(t)
//    endregion

//    region SEQUENCE
//    val titles = meetings.map { it.title }
//    val titles = meetings
//            .asSequence()
//            .filter { println("filter($it)"); it.title.endsWith("g") }
//            .map { println("map($it)"); it.title }
//    println()
//    for (t in titles) println(t)
//    endregion

//    region TERMINAL SEQUENCE 1
    val titles = meetings
            .asSequence()
            .filter { println("filter($it)"); it.title.endsWith("g") }
            .map { println("map($it)"); it.title }
    println()
    iter(titles)
//    endregion
//
//    region TERMINAL SEQUENCE 2
//    val titles = meetings.map { it.title }
//    val title = meetings
////            .asSequence()
//            .map { println("map($it)"); it.title.uppercase(Locale.getDefault()) }
//            .find { println("find($it)"); it.startsWith("BOARD") }
//    println()
//    println(title)
//    endregion

}


fun iter ( seq: Sequence<String>) {
    for (t in seq) println(t)
}

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Sam"), Person("Alex"))
}
