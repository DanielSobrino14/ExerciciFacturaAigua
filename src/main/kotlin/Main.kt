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
    var (quotaFixa, costConsum) = consumLitresAigua(litresConsumits)

    val esFamiliaNombrosa = familiaNombrosa()
    val boSocial = readBoolean("Té bo social (True / False) ?", "Error!!")

    var descompte = 0.0

    if (esFamiliaNombrosa && !boSocial) {
        val numMembres = membres()
        descompte = descompteFamilia(true, numMembres).toDouble()
        println("Descompte de $descompte% aplicat per ser família nombrosa.")
    } else if (!esFamiliaNombrosa && boSocial) {
        descompte = descompteBoSocial()
        println("Descompte del $descompte% aplicat per Bo Social.")
        quotaFixa = 3.0
    }

    val costTotal = quotaFixa + costConsum
    val descompteFinal = costTotal * (descompte / 100)
    val costFinal = costTotal - descompteFinal

    println("Detalls de la factura:")
    println("Quota fixa: $quotaFixa €")
    println("Consum de litres d'aigua: $costConsum €")
    println("Cost total (incloent descomptes): $costFinal €")
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