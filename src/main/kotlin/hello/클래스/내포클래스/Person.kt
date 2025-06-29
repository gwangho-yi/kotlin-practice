package hello.클래스.내포클래스

/**
 * ### 중첩 클래스
 * - nested class: 자바의 static inner class와 동일
 * - 외부 클래스의 인스턴스에 대한 참조를 가지지 않는다.
 * - 외부 클래스의 인스턴스 없이도 생성 가능.
 * - 외부 클래스의 private 멤버에 접근 불가능
 * */
class Person(
    val id: Id, val age: Int
) {
    class Id(val firstName: String, val lastName: String) {
        fun doing() {
            // println(age) 실행 불가
        }
    }

    fun showMe() = println("Person(id=${id.firstName} ${id.lastName}, age=$age)")

    val fullName : String = "${id.firstName} ${id.lastName}"

}