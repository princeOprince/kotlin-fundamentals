package princeoprince

fun main() {
    var prince = Stud(1, "Prince")
    var odia = Stud(1, "Prince")

    println(prince)

    if (prince == odia) {
        println("Equal")
    }
    else {
        println("Not equal")
    }

    var newPrince = prince.copy(name = "PrinceOPrince")
    println(newPrince)
}


data class Stud(val id: Int, val name: String)