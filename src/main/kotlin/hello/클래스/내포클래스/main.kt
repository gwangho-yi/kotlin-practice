package hello.클래스.내포클래스

fun main() {
    val id = Person.Id("jinseonghwang", "hwang")
    val person = Person(id, 30)
    println(person.showMe())
}