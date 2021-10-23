import com.princeoprince.Person

fun main() {
    println("Hello, World!")

    val prince = Person("Prince")

    println("My name is ${prince.name}")

    prince.display()

    prince.displayWithLambda(::printName)
}

fun printName(name: String) {
    println(name)
}