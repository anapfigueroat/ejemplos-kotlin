// Ejemplos extraidos de ChatGPT

// Paradigma de programacion orientada a objetos
open class Animal {
    open fun sound() {
        println("Animal sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Woof")
    }
}

fun main() {
    val myDog = Dog()
    myDog.sound()  // Salida: Woof
}

// Paradigma de programacion funcional
val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }
println(doubled)  // Salida: [2, 4, 6, 8, 10]


// Paradigma de programacion imperativa
var sum = 0
for (i in 1..10) {
    sum += i
}
println(sum)  // Salida: 55
