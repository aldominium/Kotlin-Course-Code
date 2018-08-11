fun main(args:Array<String>){
    //Este es un comentario y es ignorado por el compilador

    /*
    * Esto es un comentario
    * de multiples
    * lineas
     */

    println("Hola Mundo Estoy Programando en Kotlin")

    println(2 + 6)
    println(5 - 3)
    println(2 * 2)
    println(4 / 2)
    println(5 % 2)
    println(5.0 / 2.0)
    println((7 + 2) * 5)// 45

    val edad: Int = 35

    println(edad)

    val pi: Double = 3.1415

    println(pi)

    var  numeroVariable: Int = 45
    numeroVariable = 46_000_000

    println(numeroVariable)

    var manzanas: Int = 4

    manzanas /= 2

    println(manzanas)
}