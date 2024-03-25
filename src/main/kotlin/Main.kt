
fun main() {
    stringFun("Barnie bakes brown bagels and buns")

    var arrayInt= arrayOf(23, 56, 78)
    println(arrayInt.sum())
    println(arrayInt.count())
    println(arrayInt.average())


   println(volumeFun(14.56))

   println(isPalindrome("madam"))
    println(isPalindrome("shalom"))



}

fun stringFun(word: String) {
//    println(word.replace("b", ""))
    println(word.split("b"))
}

fun arrayInt(num1: Int, num2: Int, num3: Int) {
    var sum = num1 + num2 + num3
    var average= sum/3

}
fun volumeFun(r: Double): Double{
    var volume= 4/3 *3.14159* r
    return volume
}


fun isPalindrome(word: String) {
    var palindrome = word.reversed()
    if (word == palindrome) {
        println("true")
    } else {
        println(false)
    }
}



