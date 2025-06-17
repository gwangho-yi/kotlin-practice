package hello

import kotlin.math.PI

fun circleArea(radius: Double): Double {
    return PI * radius * radius
}

fun main() {
    print("EnterRadius: ")
    val radius = readLine()!!.toDouble()
    val area = circleArea(radius)
    println("Area: $area")



    val width = 10.0
    val height = 5.0
    /**
     * named argument, 이름 붙은 인자
     * 파라미터의 이름을 명시적으로 전달할 수 있다.
     *  */
    rectangleArea(width=width, height=height)


    // 순서만 맞다면 섞어서 쓰는것도 가능하다.
    rectangleArea(width, height = height)


}

/**
 * <h2>파라메터</h2>
 * <li> 파라메터는 반드시 불변 </li>
 * 자바는 final 붙이면 불변이지만 코틀린은 기본 적으로 불변이다.
 * <li> 파라메터의 타입은 반드시 지정되어야 한다. </li>
 * 컴파일러 타입 추론 X
 * 왜? 코틀린은 정적타입 언어이기 때문에 컴파일 시점에 파라메터 타입이 결정되야 한다.
 * 함수는 다른 코드에서 호출되는데, 외부에서 무엇을 넘길지 명확하게 정해줘야한다.
* */
fun cantChange(a: Int): Int {
    // a = 10
    return a
}



/*
* 식이 본문인 함수는 {} -> = 로 치환 가능
* */
fun circleArea2(radius: Double): Double = PI * radius * radius



fun rectangleArea(width: Double, height: Double): Double = width * height


