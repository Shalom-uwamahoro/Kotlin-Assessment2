
fun main() {
    stringFun("Barnie bakes brown bagels and buns")

    sumCountAver(arrayOf(23,56,78,69))

    volumeFun(14.56)
    println(isPalindrome("Madam"))
    println(isPalindrome("pop"))
    println(isPalindrome("Shalom"))
}
fun stringFun(word: String) {

    println(word.lowercase().split('b'))
    //the .lowercase() ensures that even letter b that were in capital letter are removed
}

//fun arrayInt(num: Array<Int>): Int{
//    var addition= num.sum()
//    var averageNum= num.average().toInt()
//    var countNum= num.count()
//    return addition
//    return averageNum
//    return countNum
//  The above is a very wrong approach because you cannot return more than one value in rows
//  So we use data class concept in such cases
//}

data class Calc( var sum: Int, var count: Int, var avg: Double) {
}
fun sumCountAver(nums: Array<Int>): Calc {
    var summation = nums.sum()
    var counting = nums.count() //or nums.size
    var averageNum = nums.average()
    var result = Calc(summation, counting, averageNum)
    println(result)
    return result
}
fun volumeFun(r: Double): Double{
    val pi= 3.14159
    val num=4/3
    var volume= pi*num*r*r*r
    println(volume)
    return volume
}
fun isPalindrome(word: String): Boolean {
    if (word.lowercase()==word.lowercase().reversed())

    { return true }
    else
    { return false }

//    var palindrome= word.lowercase()==palindromeWord
//    println(palindrome)
//    return palindrome
    //The above creation of variable can work too but it is hard coding
}




