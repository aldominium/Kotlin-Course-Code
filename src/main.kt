fun main(args:Array<String>){

    val entero = 10
    val decimal= 12.5

    val nombre = "Aldo"

    val signoExclamacion = '!'

    val saludo = "Hola "

    println("Hola $nombre")

    println("La suma de $entero y $decimal es ${entero + decimal}")

    val coordenadas = Pair(4, 5)

    val coordenadas3D = Triple(4,5,6)

    val (_, _, z) = coordenadas3D

    println(z)

    //Any, Unit, Nothing

    //Any
    val numero: Any = 1
    val cadena:Any = "Cadena"

    //Unit
    fun add(){
        val suma = 1 + 1
        println(suma)
    }

    //Nothing
    fun nuncaTermina(): Nothing{
        while (true){

        }
    }
}