package hello.`object`

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