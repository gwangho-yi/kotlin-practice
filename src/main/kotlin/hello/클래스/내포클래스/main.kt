package hello.클래스.내포클래스

fun main() {
    val id = Person.Id("gwangho", "yi")
    val person = Person(id, 30)
    println(person.showMe())

    // val person2 = Person2.Id2("gwangho", "yi") // Id2 생성불가.

}