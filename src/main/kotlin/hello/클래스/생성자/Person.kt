package hello.클래스.생성자

/**
 * ### 생성자
 * - **주생성자(Primary Constructor)**
 * - **초기화블록(init)**
 * - **부생성자(Secondary Constructor)**
 * */
class Person( // 주생성자: 클래스 헤더에 선언
    firstName: String,
    familyName: String
) {
    val fullName = "$firstName $familyName"

    val firstName2 : String
    val familyName2 : String

    init { // 초기화 블록
        println("person = $fullName")

        val names = fullName.split(" ")
        if (names.size != 2) throw IllegalArgumentException("Invalid name: $fullName")

        firstName2 = names[0]
        familyName2 = names[1]

    }

    var fullName2 : String = ""

    var age: Int = 0

    // 부생성자
    constructor(firstName: String, familyName: String, age: Int) : this(firstName, familyName) {
        this.age = age
        this.fullName2 = "$firstName $familyName"
    }

}