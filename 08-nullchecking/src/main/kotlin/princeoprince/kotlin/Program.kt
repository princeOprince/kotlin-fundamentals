package princeoprince.kotlin

fun main() {
    var m:Meeting? = null
    var newMeeting = Meeting()

    closeMeeting(m)

    m?.let { closeMeetingNonNull(m) }

}

fun closeMeetingNonNull(m: Meeting): Boolean {
    return if (m.canClose) m.close()
            else false
}

fun closeMeeting(m: Meeting?): Boolean {

//    SAFE CALL
//    return if (m?.canClose == true) m.close()
//            else false

//    NULL ASSERTION
    return if (m!!.canClose) m.close()
            else false
}

class Meeting {
    val canClose: Boolean = false
    lateinit var address: Address

    fun close(): Boolean {
        return true
    }

//    SAFE CAST
    fun save(o: Any) {
        (o as? ISaveable)?.save()
    }

    fun init(addr: Address) {
        address = addr
    }
}

interface ISaveable {
    fun save()
}

interface Address
