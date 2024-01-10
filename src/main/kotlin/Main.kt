fun main() {
    mostrarMenu()
    val opcio = demanarOpcio()
    when (opcio) {
        1 -> mostrarFactura()
        2 -> {
            val litresConsumits = llegirInt("Introdueix el número de litres que has consumit: ", 0, 1000)
            val costFinal = consumLitresAigua(litresConsumits)
            println("El cost del consum d'aigua és: $costFinal €")
        }
        3 -> {
            val esFamiliaNombrosa = familiaNombrosa()
            if (esFamiliaNombrosa) {
                val numMembres = membres()
                val descompte = descompteFamilia(esFamiliaNombrosa, numMembres)
                println("Descompte de $descompte% aplicat")
            } else {
                println("No sou una família nombrosa.")
            }
        }
        4 -> {
            val descompte = descompteBoSocial()
            println("Descompte del $descompte% aplicat amb quota fixa de 3€.")
        }
        5 -> println("Has sortit de l'aplicació. Fins Aviat!!")
    }
}

fun mostrarFactura() {
    val litresConsumits = llegirInt("Introdueix el número de litres consumits: ", 1, 1000)
    var cost = 0.0
    cost+= consumLitresAigua(litresConsumits)

    val esFamiliaNombrosa = familiaNombrosa()
    if (esFamiliaNombrosa) {
        val numeroMembres = membres()
        val descompte = descompteFamilia(esFamiliaNombrosa, numeroMembres)

    }

    val descompte = descompteBoSocial()


    println("Desglossament de la factura:")
    println("Quota fixa: 6€")
    println("Consum de litres d'aigua: $litresConsumits litres")
    println("Cost total: $cost €")
}

fun mostrarMenu(){
    println(" Benvingut/da a la calculadora de preu de la teva factura de l'aigua")
    println(" A continuació calcularé el preu de la teva propera factura:")
    println("1. Mostro la Factura")
    println("2. Introduint numero de litres consumits y preu pagat")
    println("3. Descompte Familia Nombrosa ")
    println("4. Descompte per Bo Social")
    println("5. Sortint de la aplicació")
}


fun demanarOpcio(): Int {
    return llegirInt("Introdueix el numero adequat per fer la operació que necessitis ",
        1,
        5)
}