package princeoprince.kotlin

import princeoprince.jav.Meeting
import princeoprince.jav.Organizer

fun main() {
//    var people: List<Person?>? = null
    var people: MutableList<Person?>? = null

//    people = listOf(Person(23), Person(23))
    people = mutableListOf(Person(23), Person(23))
    people.add(null)

    for (person in people.filterNotNull()) {
//        println(person?.age)
        println(person.age)
    }
}

class Person(val age: Int): Organizer {
    override fun processMeeting(meetings: MutableList<Meeting>?) {
    }

}