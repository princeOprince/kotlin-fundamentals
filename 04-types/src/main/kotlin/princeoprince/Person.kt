package princeoprince



class Prog {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val prince = Student(1, "Prince", "Odia")
//    val prince2 = Student("Prince", "Odia", 1, "Myself")
            println(prince.id)

//    companion objects
            Student.createPostgrad("Prince")
            Student.createUndergrad("Odia")

        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {
//    private var firstName: String = ""
//    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

//class Student(val id: Int): Person() {
open class Student(_id: Int, firstName: String, lastName: String, var tutor: String = "") : Person(firstName, lastName) {
    //    val id: Int = _id
//    var tutor: String
    val id: Int

    init {
        id = _id
//        tutor = ""
    }

    fun enrol(courseName: String) {
        val course = Courses.allCourses.filter{it.title == courseName}.firstOrNull()
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

    companion object: XmlSeriliser<Student> {
        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }
    }
}

class Undergraduate(firstName: String): Student(1, firstName, "")

class Postgraduate(firstName: String): Student(1, firstName, "")

interface XmlSeriliser<T> {
    fun toXml(item: T)
}