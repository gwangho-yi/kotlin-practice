package hello

/**
 * <h3>Unit<h3/>
 * <br>
 * 자바의 void = Unit
 * Unit을 사용하면 일급 객체로 사용 가능
 * Unit은 한가지 인스턴스가 존재하는데, 이 인스턴스는 보통 유용한 값이 없다는 사실을 표현한다.
 * */
fun voidfunction(): Unit {
    println("voidfunction")
}

/**
 * <h3>Nothing</h3>
 * <br>
 * 아예 값이 없다는 것을 뜻한다.
 * 절대 값을 반환하지 않음을 뜻한다.
 * 모든 타입의 서브 타입이기 때문에 String 같은 타입도 대체 가능
* */

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun getUserName(name: String?): String { // Nothing 은 모든 타입의 서브타입이기 때문에 String을 대체해서도 사용 가능.
    return name ?: fail("이름이 null 일 수 없습니다.")
}

fun main() {
    getUserName(null)
    getUserName("gwangho")
}
