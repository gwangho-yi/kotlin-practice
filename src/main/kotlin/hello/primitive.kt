package hello


fun main() {

    /**
     * 정수형 Int, Long, Short, Byte
     * */

    val a = 1.5.toInt()

    println(a)

    /*
    * 자바의 int 와 달리 Int 클래스 타입 사용.
    * 컴파일 시에 int형으로 사용한다.
    * 자바와는 달리 기본형이 아니라 박싱을 사용한다.
    * Int를 사용하면 자바의 int와 Integer를 상황에 따라 사용한다.
    * */

    val b = 1_000_000 // Int 타입 추론

    val long = 100L // Long 타입 추론

    println(b)

    println(long)


    /**
     * 부동 소수점 Float, Double
     * */


    val c: Float = 3.14f   // f를 붙여야 Float로 인식
    val d: Double = 3.14   // 기본이 Double

    /*
    * 기본적으로 Double 사용한다.
    * */

    /**
     * 논리 연산 or, and, xor, not
     * */

    val x = 1
    println((x == 1) or (x == 2))
    println((x == 1) and (x == 2))
    println(x xor 2)
    println(!((x == 1) and (x == 2)))
    println(x!=1 && x!=2)
    /*
    *
    * */
}