package princeoprince.kotlin

import princeoprince.java.Created
import princeoprince.java.User

fun main() {
    var user = User("Odia")
    var user2 = User("Prince")

    var count = 0
    var eventListener = Created { println("user $it has been created") }

//    SAME INSTANCE REUSED
    user.create { println("user $it has been created") }
    user.create(eventListener)
    println()
//    DIFFERENT ANONYMOUS INSTANCES
    user2.create { println("user2 $it has been created: ${++count} times") }
    user2.create { println("user2 $it has been created: ${++count} times") }


}