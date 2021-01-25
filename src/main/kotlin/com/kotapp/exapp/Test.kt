//package com.kotapp.exapp
//
//
//fun main() {
//
//    val a = "Test"
//    val longStr = """ Somebody
//once told me"""
//
////    a.also {  }
//
////    println("Whats going on $a")
////    println("Whats going on $longStr")
////
////    var range = Array(5) { it * it }
////
////    for (d in range) println(d)
////
////    var test = 7
////    when (test) {
////        6 -> createClass(test)
////        else -> println("Nothing was find")
////    }
////
////    println("the result = ${add(1, 2)}")
////    println("Th result 4-5 ${subtract(num2 = 4, num1 = 5)}")
////    val (first, second) = someFun(6)
////    println("Hello from pair $first and  $second")
////
////    val function = { num1: Int, num2: Int -> num1 * num2}
////
////    println(sumSome(1, 10, 3, 4, 5, 6))
////
////    println(function(4,5))
//
//    println(factorial(5))
//    println(factorialModern(1))
//
//    val s = 1..20
//    val sA = arrayListOf(1, 2, 3, 4, 5)
//    println(sA)
//    println("Sep-----------")
//    println(s)
//
//    val fold = s.fold(4) { acc, i -> acc + i }
//    println(fold)
//
//    val map = mutableMapOf(1 to "Matvey", 2 to 25)
//    val map2 = mutableMapOf("a" to 1, "b" to 2)
//
//    map[2] = "hello"
//    map[26] = "ooll"
//    map2["a"] = 44
//    println(map)
//    println(map2)
//
//    println(4L.getMax())
//
//    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
//
//    fun getPattern(): String = """\d{2} ${month} \d{4}"""
//    println(getPattern())
//
//}
//
//
//
//fun Long.getMax(): Long {
//    return 16L
//}
//
//fun factorial(num: Int = 1): Int {
//    if (num == 0) return 1
//    return num * factorial(num - 1)
////    return result
//}
//
//
//fun factorialModern(num: Int): Int {
//    tailrec fun funcTail(y: Int, z: Int): Int {
//        return if (y == 0) z
//        else funcTail(y - 1, y * z)
//    }
//    return funcTail(num, 1)
//}
//
//fun add(num1: Int, num2: Int): Int = num1 + num2
//fun subtract(num1: Int, num2: Int) = num1 - num2
//
//fun createClass(test: Int) {
//    println("Cool $test")
//}
//
//fun someFun(num1: Int) = Pair(num1, "Second num")
//
//fun sumSome(vararg nums: Int): Int {
//    var sum = 0
//    nums.forEach { i -> sum += i }
//    val get = nums
//            .filter { i -> i == 10 }
//            .map { i -> "Now it string ${i * 3}" }
//    println(get)
//    return sum
//}
//
//open class Animal(
//        val name: String,
//        var height: Long,
//        var weight: Double){
//    init {
////        require()
//    }
//}
//
//
//
//
