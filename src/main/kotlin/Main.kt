fun main() {
    mostrarMenu()
    val opcio = demanarOpcio()
    when (opcio) {
        1 -> mostrarFactura()
        2 -> {
            val litresConsumits = llegirInt("Introdueix el número de litres que has consumit: ", 1, 1000)
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
        val esFamiliaNombrosa = familiaNombrosa()
        if (esFamiliaNombrosa) {
            println("No pots tenir el descompte Bo Social si ja tens descompte de família nombrosa.")
        } else {
            val boSocial = readBoolean("Té bo social (True / False) ?", "Error!!")
            val descompte = if (boSocial) {
                descompteBoSocial()
            } else {
                0.0
            }
            println("Descompte del $descompte%")
        }
    }

        5 -> println("Has sortit de l'aplicació. Fins Aviat!!")
    }
}
fun mostrarFactura() {
    val litresConsumits = llegirInt("Introdueix el número de litres que has consumit: ", 1, 1000)
    val costConsum = consumLitresAigua(litresConsumits)

    val esFamiliaNombrosa = familiaNombrosa()
    val descompteFamilia =
        if (esFamiliaNombrosa) {
            descompteFamilia(esFamiliaNombrosa, membres())
        } else 0
    val boSocial = readBoolean("Té bono social (True / False) ?", "Error!!")
    val descompteBoSocial = if (boSocial) {
        costConsum * 0.2 + 3
    } else {
        0.0
    }

    println("Desglossament de la factura:")
    println("Quota fixa: ${if (boSocial) 3 else 6}€")
    println("Consum de litres d'aigua: $litresConsumits litres y preu a pagar: $costConsum")
    println("Descompte Família Nombrosa: $descompteFamilia%")
    println("Descompte Bo Social: $descompteBoSocial%")
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