package princeoprince

import java.util.*

class Meeting {
    var title: String = ""
    var wwhen: Date = Date()
    var who = mutableListOf<String>()

    fun create() {}
}

fun main() {
    val m = Meeting()
    m.title = "Board Meeting"
    m.wwhen = Date(2017, 1, 1,)
    m.who.add("Prince")

    with(m) {
        title = "Board Meeting"
        wwhen = Date(2017, 1, 1,)
        who.add("Prince")
    }

    m.apply {
        title = "Board Meeting"
        wwhen = Date(2017, 1, 1,)
        who.add("Prince")
    }.create()
}