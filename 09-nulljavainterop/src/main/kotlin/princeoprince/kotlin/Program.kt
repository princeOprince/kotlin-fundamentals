package princeoprince.kotlin

import princeoprince.java.Address
import princeoprince.java.Meeting

fun main() {

    val m = Meeting()

//    m.addTitle("Title")
//    m.addTitle(null.toString())

//    val title: String? = m.meetingTitle()
    val title: String = m.titleCanBeNull() ?: "nobody"

    println(title)

}

class HomeAddress: Address {
    override fun getFirstAddress(): String {
        return ""
    }
}

class WorkAddress: Address {
    override fun getFirstAddress(): String? {
        return null
    }
}