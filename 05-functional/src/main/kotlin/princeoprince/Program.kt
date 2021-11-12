package princeoprince

fun main(args: Array<String>) {
    var program = Program()
    var total = 0

//    region STRATEGY 1 - BASIC FUNCTION
//    program.fibonacci(8)
//    endregion

//    region STRATEGY 2 - INTERFACE METHOD
//    program.fibonacci(8, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })
//    endregion

//region STRATEGY 3 - LAMBDA FUNCTION IN PARAMETER
//    program.fibonacci(8, {n -> println(n)})
//endregion

// region STRATEGY 4 - LAMBDA FUNCTION IN BODY
//    program.fibonacci(8) {n -> println(n)}
//endregion

// region STRATEGY 5 - DEFAULT IT
//    program.fibonacci(8) {println( it )}
//    println()
//    program.fibonacci(8, {println( it )})
//endregion

// region STRATEGY 6 - FUNCTION REFERENCE
//    program.fibonacci(8, ::println)
//endregion

// region CLOSURES - MUTATING VALUES OUTSIDE LAMBDA
    program.fibonacci(8) {
        total += it
    }
//endregion

    println(total)
}

interface Process {
    fun execute(value: Int)
}

class Program {
    //    1, 1, 2, 3, 5, 8, 13
    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}