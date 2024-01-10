fun main () {
    mostrarMenu()
    val opcio= demanarOpcio()

    when (opcio){
        1 -> mostrarFactura()
        2 -> litresConsumits()
        3 -> descomptesAplicables()
        4 -> println("Has sortit de l'aplica")
    }












}

fun mostrarMenu(){
    println(" Benvingut/da a la calculadora de preu de la teva factura de l'aigua")
    println(" A continuació calcularé el preu de la teva propera factura:")
    println("1. Mostro la Factura")
    println("2. Introduint numero de litres consumits")
    println("3. Introduint els descomptes ")
    println("4. Sortint de la aplicació")
}


fun demanarOpcio(): Int {
    return llegirInt("Introdueix el numero adecuat per fer la operació que necessitis ",
        1,
        4)
}