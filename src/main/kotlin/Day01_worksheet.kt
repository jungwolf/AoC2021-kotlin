val input: List<Int> = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

fun main() {                        // 2
// playing around
    println("Hello, World!")        // 3

    println(input)

    for (i in input) {
        println(i)
    }

    var a = 0

    for (i in input) {
        println(a-i)
        a = i
    }


}

