var quotaFixa = 6.0
/**
 * Calcula el costo de los litros de agua consumidos.
 *
 * @param consumLitres Cantidad de litros consumidos.
 * @return Una lista que contiene la tarifa fija y el costo del consumo.
 */
fun consumLitresAigua(consumLitres: Int): List<Double> {
    val costConsum = when {
        consumLitres < 50 -> 0.0
        consumLitres in 50..200 -> (consumLitres * 0.15)
        else -> (consumLitres * 0.30)
    }
    return listOf(quotaFixa, costConsum)
}

/**
 * Verifica si el usuario pertenece a una familia numerosa.
 *
 * @return Verdadero si el usuario es parte de una familia numerosa, falso en caso contrario.
 */
fun familiaNombrosa(): Boolean {
    return readBoolean("Sou familia nombrosa (True / False) ?", "Error!!")
}

/**
 * Pide al usuario que ingrese el número de miembros en la familia.
 *
 * @return Número de miembros en la familia.
 */
fun membres(): Int {
    return llegirInt("Quants integrants té la familia ?", 1, 10)
}

/**
 * Calcula el descuento aplicable para una familia numerosa.
 *
 * @param familia Indica si el usuario es parte de una familia numerosa.
 * @param membres Número de miembros en la familia.
 * @return Descuento aplicable para una familia numerosa.
 */
fun descompteFamilia(familia: Boolean, membres: Int): Int {
    var descompte = 0
    if (familia) {
        descompte = membres * 10
        if (descompte > 50)
            println("Nomes s'aplica fins a un descompte màxim del 50% !")
        descompte = 50
    }
    return descompte
}

/**
 * Devuelve el descuento fijo para el descuento social (Bo Social).
 *
 * @return Descuento fijo para el descuento social.
 */
fun descompteBoSocial(): Double {
    return 80.0
}
