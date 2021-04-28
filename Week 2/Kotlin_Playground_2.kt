//Change the 'sum' function so that it was declared as an extension to List<Int>.

fun List<Integer>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i.toInt();
    }
    return result
}

fun main(args: Array<String>) {
    val ans = listOf(1, 2, 3).sum();
    println(ans)    // 6
}