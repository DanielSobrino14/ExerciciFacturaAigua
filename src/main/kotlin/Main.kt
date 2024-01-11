fun colorAzul() = "\u001B[34m"
fun colorRojo() = "\u001B[31m"
fun colorLila() = "\u001B[35m"


/**
 * Este programa calcula y muestra el costo de una factura de agua basado en varios criterios
 * como el consumo de agua, descuentos por familia numerosa y el descuento social (Bo Social).
 *
 * La aplicación proporciona un menú para que el usuario elija entre diferentes opciones para
 * ver la factura, ingresar el consumo de agua, obtener descuentos y salir del programa.
 *
 * El cálculo del costo se realiza teniendo en cuenta el consumo de agua, la tarifa fija,
 * los descuentos por ser familia numerosa y el descuento social.
 *
 * @author Daniel Sobrino
 */

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

/**
 * Muestra los detalles de la factura, incluido el cálculo del costo final con descuentos aplicados.
 */
fun mostrarFactura() {
    val litresConsumits = llegirInt("Introdueix el número de litres que has consumit: ", 1, 1000)
    var (quotaFixa, costConsum) = consumLitresAigua(litresConsumits)

    val esFamiliaNombrosa = familiaNombrosa()
    val boSocial = readBoolean("Té bo social (True / False) ?", "Error!!")

    var descompte = 0.0

    if (esFamiliaNombrosa && !boSocial) {
        val numMembres = membres()
        descompte = descompteFamilia(true, numMembres).toDouble()
        println(" ${colorLila()}Descompte de $descompte% aplicat per ser família nombrosa.")
    } else if (!esFamiliaNombrosa && boSocial) {
        descompte = descompteBoSocial()
        println(" ${colorLila()}Descompte del $descompte% aplicat per Bo Social.")
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

/**
 * Muestra el menú de opciones para el usuario.
 */
fun mostrarMenu(){
    println(" ${colorAzul()}Benvingut/da a la calculadora de preu de la teva factura de l'aigua")
    println(" A continuació calcularé el preu de la teva propera factura:")
    println("1. Mostro la Factura")
    println("2. Introduint numero de litres consumits y preu pagat")
    println("3. Descompte Familia Nombrosa ")
    println("4. Descompte per Bo Social")
    println("5. Sortint de la aplicació")
}

/**
 * Pide al usuario que ingrese una opción y devuelve la opción seleccionada.
 *
 * @return La opción seleccionada por el usuario.
 */
fun demanarOpcio(): Int {
    return llegirInt("Introdueix el numero adequat per fer la operació que necessitis ",
        1,
        5)
}