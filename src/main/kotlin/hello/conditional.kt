package hello



/**
 * <h3>조건문</h3>
 * <p>if 문을 식으로 사용가능</p>
 * <p>삼항연산자가 없음</p>
 *
 * */


fun main() {

    // if 문 case 1
    val s = readLine()!!
    val i = s.indexOf("/")

    val result = if( i > 0 ) {
        val a = s.substring(0,i).toInt()
        val b = s.substring(i+1).toInt()
        (a / b).toString()
    }
    else ""

    println(result)

}

// if 문 case 2
fun max(a: Int, b: Int): Int = if( a > b ) a else b


/**
 *
 * */