package hello

fun printSorted(vararg items: Int) {
    items.sort()
    print(items.contentToString())
}

fun main() {

    val numbers = intArrayOf(3, 2, 1)

    printSorted(*numbers) // 스프레딩으로 넣어야 한다.

}