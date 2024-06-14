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
fun operation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

val sum = operation(10, 5) { a, b -> a + b }
println(sum)  // Salida: 15


val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }
println(doubled)  // Salida: [2, 4, 6, 8, 10]


// Paradigma de programacion imperativa
var sum = 0
for (i in 1..10) {
    sum += i
}
println(sum)  // Salida: 55

// Paradigma de programacion paralela
// Ejemplo de Kotlin Coroutines
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job1 = launch {
        delay(1000L) // Simulando una tarea que toma tiempo
        println("Task 1 completed")
    }

    val job2 = launch {
        delay(500L) // Otra tarea que toma menos tiempo
        println("Task 2 completed")
    }

    // Espera a que ambas tareas se completen
    job1.join()
    job2.join()

    println("All tasks completed")
}


// Uso de hilos
import kotlin.concurrent.thread

fun main() {
    val thread1 = thread {
        Thread.sleep(1000L) // Simulando una tarea que toma tiempo
        println("Task 1 completed")
    }

    val thread2 = thread {
        Thread.sleep(500L) // Otra tarea que toma menos tiempo
        println("Task 2 completed")
    }

    thread1.join()
    thread2.join()

    println("All tasks completed")
}



