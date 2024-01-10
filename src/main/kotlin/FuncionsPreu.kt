var quotaFixa = 6.0
fun consumLitresAigua(consumLitres: Int): Double {
    quotaFixa= 6.0
    return when {
        consumLitres < 50 -> quotaFixa
        consumLitres in 50..200 -> quotaFixa + (consumLitres * 0.15)
        else -> quotaFixa + (consumLitres * 0.30)
    }
}

fun familiaNombrosa(): Boolean {
    return readBoolean("Sou familia nombrosa (True / False) ?", "Error!!")
}

fun membres(): Int {
    return llegirInt("Quants integrants té la familia ?", 1, 10)
}

fun descompteFamilia ( familia : Boolean, membres : Int ) : Int {
    var descompte = 0
    if (familia) {
        descompte = membres * 10
        if ( descompte > 50)
            println("Nomes s'aplica fins 50% !")
        descompte = 50

    }
    return descompte
}

fun descompteBoSocial(consumLitres: Int): Double {
    return 80.0
}

