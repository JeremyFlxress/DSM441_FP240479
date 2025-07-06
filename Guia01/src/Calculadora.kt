
fun main (){
    Calculadora()
}


fun Calculadora (){

    print("Buen día, Ingrese su nombre: ")
    val nombre = readLine()

    print("Ingrese el primer numero: ")
    val primerNumero = readLine()!!.toInt()
    print("Ingrese el segundo numero: ")
    val segundoNumero = readLine()!!.toInt()

    print("Por favor ingrese un operador: + - * /: ")
    val operador = readLine()

    when(operador) {
        "+" -> println("$nombre El resultado es ${primerNumero + segundoNumero}")
        "-" -> println("$nombre El resultado es ${primerNumero - segundoNumero}")
        "*" -> println("$nombre El resultado es ${primerNumero * segundoNumero}")
        "/" -> println("$nombre El resultado es ${primerNumero / segundoNumero}")
        else -> println("Operador desconocido")
    }


}