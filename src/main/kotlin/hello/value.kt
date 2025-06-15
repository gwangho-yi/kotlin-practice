package hello

fun main() {


    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    println(a + b)



    /*  변수 선언
        * val 은 값을 뜻하는 value. 불변이다.
        * !!  는 '널 아님 단언' ,'not-null assertion' 이라고 한다. null 일 경우, 예외 발생
        * 자바와 달리 int 기본형 선언을 안 해줬는데 왜 실행이 될까? 타입 추론이 가능하기 때문
        * ctrl + shift + p 누르면 추론 타입 볼 수 있음
    */



    val n: Int = 10
    val text: String = "Hello, Kotlin!"

    val d: String
    d = "Hello, Kotlin!"
    println(d)



    /*
    * 필요할 경우 타입 명시 가능
    * */


    /*
        * 변수와 프로퍼티?
        * 변수 : 값을 읽거나 쓰는 것.
        * 프로퍼티 : 값을 읽거나 쓸 때 계산 수행 가능.
        *
    * */
}