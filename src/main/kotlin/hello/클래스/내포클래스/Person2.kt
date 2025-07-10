package hello.클래스.내포클래스


/**
 * ### 내부 클래스
 * - inner class: 자바의 inner class와 동일
 * - 외부 클래스의 인스턴스에 대한 참조를 가진다
 * - 외부 클래스의 인스턴스 없이는 생성할 수 없다
 * - 외부 클래스의 멤버에 직접 접근할 수 있다.
 * - 외부 클래스에 접근이 필요할 때 사용한다.
 * */
class Person2(
    val age: Int
) {
    inner class Id2(val firstName: String, val lastName: String) {
        fun doing() {
            println(age) // 외부 클래스 멤버에 접근 가능
        }
    }


    inner class Possession(val desc: String) {
        fun getOwner() = this@Person2
    }
}