package princeoprince

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: PrinceTime) = setTime(time.hours)
//    fun setTime(time: PrinceTime) {}
}

interface EndOfTheWorld {
    fun setTime(time: PrinceTime) {}
}

class PrinceTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime: Time, EndOfTheWorld {
    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("Not yet implemented")
    }

    override fun setTime(time: PrinceTime) {
        super<Time>.setTime(time)
        super<EndOfTheWorld>.setTime(time)
    }
}

