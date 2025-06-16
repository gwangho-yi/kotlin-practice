package hello.imports

import hello.imports2.readInt as readInt1
import hello.imports.readInt as readInt2

fun main() {
    readInt1()
    readInt2()

    /*
    * as 사용시 같은 메서드 다른 이름으로 사용가능
    * 자바에는 없는 기능
    * */
}
