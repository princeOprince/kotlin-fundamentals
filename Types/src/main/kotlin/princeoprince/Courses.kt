package princeoprince

class Course(val id: Int, val title: String)

object Courses {
    var allCourses = arrayListOf<Course>()

    fun initialise() {
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }
}