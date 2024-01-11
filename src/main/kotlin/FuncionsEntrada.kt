import java.util.*
/**
 * Función para leer un número entero dentro de un rango especificado.
 * @param pMessage Mensaje a mostrar al usuario.
 * @param pMin Valor mínimo permitido.
 * @param pMax Valor máximo permitido.
 * @return Número entero válido dentro del rango especificado.
 */
fun llegirInt(pMessage : String, pMin : Int, pMax : Int) : Int{
    var valor : Int = 0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextInt()

        if(!correctType){
            println("${colorRojo()}ERROR")
        }else{
            valor = scan.nextInt()

            if(valor < pMin || valor > pMax){
                println("${colorRojo()}ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}

/**
 * Función para leer un número long dentro de un rango especificado.
 * @param pMessage Mensaje a mostrar al usuario.
 * @param pMin Valor mínimo permitido.
 * @param pMax Valor máximo permitido.
 * @return Número long válido dentro del rango especificado.
 */
fun llegirLong(pMessage: String, pMin: Double, pMax: Double): Long {
    var valor: Long = 0
    val scan: Scanner = Scanner(System.`in`)
    var correctType: Boolean

    do {
        println(pMessage)
        correctType = scan.hasNextLong()

        if (!correctType) {
            println("ERROR")
        } else {
            valor = scan.nextLong()

            if (valor < pMin || valor > pMax) {
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    } while (!correctType)
    return valor
}

/**
 * Función para leer un número decimal/double dentro de un rango especificado.
 * @param pMessage Mensaje a mostrar al usuario.
 * @param pMin Valor mínimo permitido.
 * @param pMax Valor máximo permitido.
 * @return Número decimal/double válido dentro del rango especificado.
 */
fun llegirDouble(pMessage : String, pMin : Double, pMax : Double) : Double {
    var valor : Double = 0.0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextDouble()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextDouble()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    }while(!correctType)
    return valor
}

fun llegirString(pMessage: String, validOptions: List<String>): String {
    val scan = Scanner(System.`in`)
    var userInput: String

    do {
        println(pMessage)
        userInput = scan.nextLine().toLowerCase()

        if (!validOptions.contains(userInput)) {
            println("ERROR: Opció no vàlida.")
        }
    } while (!validOptions.contains(userInput))

    return userInput
}


