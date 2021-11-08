package princeoprince

fun main() {
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1 plus h2

    println(h3.name)

    val h4 = h1 + h2
    println(h4.name)
}

class Header(var name: String) {}

infix operator fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}