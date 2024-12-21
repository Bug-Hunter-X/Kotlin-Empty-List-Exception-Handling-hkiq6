fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //Safe call operator handles potential empty list
    val firstDoubled = doubledList.firstOrNull()
    println(firstDoubled ?: "List is empty")

    //Alternative approach using if statement
    val anotherList = emptyList<Int>()
    val firstOfAnotherList = if (anotherList.isNotEmpty()) anotherList.first() else 0
    println(firstOfAnotherList)
}