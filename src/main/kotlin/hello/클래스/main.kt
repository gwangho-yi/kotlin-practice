package hello.`object`

import hello.클래스.접근제어자.Person
import hello.클래스.생성자.Person2

fun main() {
    val person = Person()
    person.firstName = "jinseong"
    person.familyName = "hwang"
    person.age = 20


    val person2 = Person.person("jinseong", "hwang", 20)

    println(person2.fullName)


    val person3 = Person2("jinseong", "hwang")
    println(person3.fullName)
}