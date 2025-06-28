package hello.클래스.내포클래스

/**
 * ### 내포된 클래스
 * - inner : 자바 내부 static class와 동일
 *
 * */
class Person(
    val id: Id, val age: Int
) {
    inner class Id(val firstName: String, val lastName: String) {
        fun showFullName() = println(fullName) // inner 키워드  - 외부 클래스 인스턴스 접근
    }
    fun showMe() = println("Person(id=${id.firstName} ${id.lastName}, age=$age)")

    val fullName : String = "${id.firstName} ${id.lastName}"

    inner class Possession(val desc: String) {
        fun getOwner() = this@Person
    }


}