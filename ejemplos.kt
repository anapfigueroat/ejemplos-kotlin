// Ejemplos de la implementacion de cada paradigma de programacion en Kotlin
// Ejemplos extraidos de ChatGPT

// Paradigma de programacion orientada a objetos
open class Animal { // Definicion de clase llamada "Animal"
    open fun sound() { // Definicion de una funcion de la clase
        println("Animal sound")
    }
}

class Dog : Animal() { // Definicion de clase "Dog" que hereda de clase "Animal"
    override fun sound() { // Sobrescribe la función sound para proporcionar una implementación específica para el perro.
        println("Woof")
    }
}

fun main() {
    val myDog = Dog() // Crea una instancia de la clase Dog.
    myDog.sound()   // Llama a la función sound de la instancia de Dog, que ejecutará la versión sobrescrita de la función.
}

// Paradigma de programacion funcional

fun operation(x: Int, y: Int, operation: (Int, Int) -> Int): Int { // Define una función de orden superior llamada 'operation'.
                                                                   // Esta función recibe tres parámetros: dos enteros 'x' e 'y', y una función 'operation' que toma dos enteros y devuelve un entero.
    return operation(x, y)
}

val sum = operation(10, 5) { a, b -> a + b } // Pasa los valores 10 y 5 como los dos primeros parámetros y una lambda como el tercer parámetro.
                                             // La lambda { a, b -> a + b } toma dos parámetros 'a' y 'b' y devuelve su suma.
println(sum)  // Salida: 15


val numbers = listOf(1, 2, 3, 4, 5) // Crea una lista inmutable de números enteros del 1 al 5.
val doubled = numbers.map { it * 2 } // Aplica la función de orden superior 'map' para duplicar cada número en la lista.
                                     // 'it' es la referencia implícita a cada elemento de la lista.
println(doubled)  // Salida: [2, 4, 6, 8, 10]


// Paradigma de programacion imperativa
var sum = 0 // Declara variable "sum" con valor de 0
for (i in 1..10) { // Crea un loop en el cual "i" itera de 1 a 10
    sum += i // Suma "i" a la variable "sum" en cada iteracion
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



