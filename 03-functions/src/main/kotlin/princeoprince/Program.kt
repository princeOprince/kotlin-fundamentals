package princeoprince

fun main() {
//    region EXTENSION FUNCTIONS
    val text = "With     multiple  \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpace())

//    endregion


//    region NAMED PARAMETERS
//    log(loglevel = 2, message = "Hello, World!")
//    endregion
}

fun replaceMultipleWhiteSpace(value: String): String {
    val regex = Regex("\\s+")
    return regex.replace(value, " ")
}

@JvmName("replaceMultipleWhiteSpaceEx")
fun String.replaceMultipleWhiteSpace(): String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}
//region DEFAULT PARAMETERS
@JvmOverloads
fun log(message: String, loglevel: Int = 1) {
    println(message + loglevel)
}
//endregion