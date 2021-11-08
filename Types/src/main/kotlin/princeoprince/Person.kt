package princeoprince

fun main() {
    val prince = Student(1, "Prince", "Odia")
//    val prince2 = Student("Prince", "Odia", 1, "Myself")
    println(prince.id)
}

abstract class Person(var firstName: String, var lastName: String) {
//    private var firstName: String = ""
//    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

//class Student(val id: Int): Person() {
class Student(_id: Int, firstName: String, lastName: String, var tutor: String = "") : Person(firstName, lastName) {
    //    val id: Int = _id
//    var tutor: String
    val id: Int

    init {
        id = _id
//        tutor = ""
    }

//    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(_id, firstName, lastName) {
//        this.tutor = tutor
//    }

    override fun getName(): String {
        return ""
    }

    override fun getAddress(): String {
        return ""
    }
}