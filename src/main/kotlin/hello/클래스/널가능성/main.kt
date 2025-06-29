package hello.클래스.널가능성

/**
 *
 * ### 널 가능성
 * - 자바 : 자바는 모든 참조 타입 변수에 null 값을 대입 가능. -> 하지만 런타임 실행 시 NPE 발생.
 * - 코틀린 :  널 값이 될 수 있는 참조 타입과 null 값이 될 수 없는 참조 타입을 확실히 구분해야 함.
 *
 * nullable : ?
 * - 코틀린에서는 optional 사용하지 않는다
 * - String? 처럼 Type? 으로 nullable 표시한다.
 * - Int?, Boolean? 원시 타입은 int, boolean이 아니라 Int, Boolean 레퍼 타입이 된다.
 *
 * non-null assertion : !!
 * - null 아님 단언이라고 부른다.
 * - KotlinNullPointerException 발생 시킬 수 있다.
 * */
fun main() {

    println(isLetterString("abc")) // 실행 가능
    // println(isLetterString(null)) // 컴파일 오류 null 대입 불가

    val n: Int = 1 // int 원시 타입
    val x: Int? = 1 // Integer int 박싱한 타입


    throw KotlinNullPointerException()

}


fun isLetterString(s: String) :  Boolean {
    if (s.isEmpty()) return false
    for (ch in s)
        if (!ch.isLetter()) return false
    return true
}

fun isLetterString2(s: String?): Boolean {
    if (s == null) return false

    if (s.isEmpty()) return false

    for (ch in s) if (!ch.isLetter()) return false

    return true
}


fun describeNumber(n: Int?) = when(n) {
    null -> "null"
    in 0..10 -> "small"
    in 11..100 -> "large"
    else -> "out of range"
}