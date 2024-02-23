fun main() {
enterName("Faith Mutava")
    modulus(77,32)
    sumOfNum(45,7,16,2)
    intFact("i love stoic philosophy,sun and moon")
}
fun enterName(name:String){
    println(name)
}
fun modulus(num1: Int, num2: Int){
    var result= num1 % num2
    println(result)
}
fun sumOfNum(num1: Int,num2: Int,num3: Int,num4: Int):Int {
    var sum = num1 + num2 + num3 + num4
    println(sum)
    return sum
}
fun intFact(fact: String){
    println(fact)
}