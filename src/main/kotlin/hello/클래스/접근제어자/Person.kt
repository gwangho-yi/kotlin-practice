package hello.클래스.접근제어자

/**
 * <h3>클래스</h3>
 * 코틀린은 기본적으로 가시성 public <=> 자바는 protected
 * 자바의 protected = internal + protected
 * internal : 패키지/모듈 레벨 접근
 * protected : 상속 레벨 접근
 *
 *
 *
 * * */
// 코틀린은 기본적으로 public
internal class Person {
    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0

    fun fullName() = "$firstName $familyName"
    fun showMe() {
        println("person = ${fullName()}: $age")
    }

    class person(
        val firstName: String,
        val familyName: String,
        val age: Int
    ) {
        val fullName = "$firstName $familyName"
    }


    fun showAge(p: Person) = println(
        p.age
    )

    fun readAge(p: Person) {
        p.age = readLine()!!.toInt()
    }
}