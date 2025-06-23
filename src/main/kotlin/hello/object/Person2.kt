package hello.`object`

/**
 * <h3>sdds</h3>
 * 클래스의 생성자
 * 주생성자
 * 초기화 블록
 * */
class Person2( // 이 부분을 클래스 헤더라고 한다. 클래스 헤더의 파라메터 목록을 주생성자 선언이라고 한다.
    firstName: String,
    familyName: String
) {
    val fullName = "$firstName $familyName"

    init { // 초기화 블록
        println("person2 = $fullName")
    }
}