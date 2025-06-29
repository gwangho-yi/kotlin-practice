package hello.클래스.내포클래스

import hello.클래스.내포클래스.Person2

fun main() {
    val id = Person.Id("jinseong", "hwang")
    val person = Person(id, 30)
    println(person.showMe())

    // val person2 = Person2.Id2("jinseong", "hwang") // Id2 생성불가.

}