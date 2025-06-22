package hello

/**
* <h3>when</h3>
 * 값을 기준으로 분기
 * 조건 기반 분기 (if-else)
 * 표현식으로 분기
 * 타입, 범위, 복합조건 모두 가능
* */
fun main() {
    val x = 2

    // 값을 기준으로 분기
    val result = when(x) {
        1,2 -> "x is 1 or 2"
        else -> "x is unknown"
    }

    // 조건 기반 분기
    when {
        x % 2 == 0 -> println("짝수입니다.")
        x % 2 == 1 -> println("홀수입니다.")
        else -> println("숫자가 아닙니다.")
    }

    // 표현식 분기
    val grade = 'A'

    val message = when (grade) {
        'A' -> "우수"
        'B' -> "보통"
        'C' -> "미흡"
        else -> "재수강"
    }

    // 범위 조건
    when (x) {
        in 1..5 -> println("1에서 5 사이")
        !in 6..10 -> println("6~10 사이 아님")
        else -> println("그 외")
    }

    // 타입 검사
    val obj: Any = "Hello"
    when (obj) {
        is String -> println("문자열입니다: $obj")
        is Int -> println("정수입니다: $obj")
        else -> println("기타 타입")
    }

}