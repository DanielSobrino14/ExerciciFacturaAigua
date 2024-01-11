var quotaFixa = 6.0

fun consumLitresAigua(consumLitres: Int): List<Double> {
    val costConsum = when {
        consumLitres < 50 -> 0.0
        consumLitres in 50..200 -> (consumLitres * 0.15)
        else -> (consumLitres * 0.30)
    }
    return listOf(quotaFixa, costConsum)
}

fun familiaNombrosa(): Boolean {
    return readBoolean("Sou familia nombrosa (True / False) ?", "Error!!")
}

fun membres(): Int {
    return llegirInt("Quants integrants té la familia ?", 1, 10)
}

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

fun descompteBoSocial(): Double {
    return 80.0
}
