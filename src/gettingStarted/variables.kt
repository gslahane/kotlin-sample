package gettingStarted

fun main(args: Array<String>) {

    // Mutable variable
    var a: Int = 10
    var b = 20 // Inferred Int type

    // Immutable variables
    val char: Char = 'x'
    val str = "JetBrains" // Inferred type of string
    val str1: String
    str1 = "IntelliJ Idea"

    // String types
    val countryName: String = "India"
    val strLength = countryName.length
    println(strLength)
}