fun main () {
    mostrarMenu()
    val opcio= demanarOpcio()

    when (opcio){
        1 -> mostrarFactura()
        2 -> consumLitresAigua()
        3 -> descompteFamiliaNombrosa()
        4 -> descompteBoSocial()
        5 -> println("Has sortit de l'aplicació. Fins Aviat!!")
    }












}

fun mostrarMenu(){
    println(" Benvingut/da a la calculadora de preu de la teva factura de l'aigua")
    println(" A continuació calcularé el preu de la teva propera factura:")
    println("1. Mostro la Factura")
    println("2. Introduint numero de litres consumits")
    println("3. Descompte Familia Nombrosa ")
    println("4. Descompte per Bo Social")
    println("5. Sortint de la aplicació")
}


fun demanarOpcio(): Int {
    return llegirInt("Introdueix el numero adecuat per fer la operació que necessitis ",
        1,
        4)
}