import java.util.*

fun main(args: Array<String>) {
    println("main")

    val q = Question()
    val m : Question? = null

    println(m?.Answer)

    q.Answer = "42"
    q.Answer = "fire"

//#region Try Expression
    val number: Int? = try {
        Integer.parseInt(q.Answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")
//#endregion

//#region For Loop Construct
//    You can have a range over anything that implements the comparable interface
//    e.g. character values, strings, as long as one can be compared over another
//    range = 'a'..'z'
    val range = 1..10

//  Inclusive for loop - closed ranges
    println()
    println("Range = 1..10")
    for (i in range) {
        println(i)
    }
    println()
    println("Range + step")
    for (i in 1..10 step 2) {
        println(i)
    }
    println()
    println("Range -> downTo + step")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

//  Half closed range
    println()
    println("Range -> until")
    for (i in 1 until 10) {
        println(i)
    }

//  Iterating over a list
    println()
    println("Iterating over a list")
    val numbers = listOf(1, 2, 3, 4, 5)
    for (i in numbers) {
        println(i)
    }

//  Iterating over an array
    println()
    println("Iterating over an array")
//    val arrnums = arrayOf(1, 2, 3, 4, 5)
    val arrnums = arrayOf("one", "two", "three", "four", "five")
    for (i in arrnums) {
        println(i)
    }
    for ((index, element) in arrnums.withIndex()) {
        println("index - $index, element - $element")
    }

//  Iterating with index
    println()
    println("Iterating with index")
    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

//  Iterating over a map
    println()
    println("Iterating over a map")
    val ages = TreeMap<String, Int>()
    ages["Prince"] = 1
    ages["James"] = 5
    ages["Peter"] = 15
    ages["Mark"] = 123
    ages["Paul"] = 145

    println("ages = $ages")
    for ((name, age) in ages) {
        println("$name is $age")
    }
//#endregion

}

class Question {
    var Answer: String? = "what"
}