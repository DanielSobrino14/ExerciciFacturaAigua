
fun consumLitresAigua(consumLitres: Int): Double {
    val quotaFixa = 6.0
    return when {
        consumLitres < 50 -> quotaFixa
        consumLitres in 50..200 -> quotaFixa + (consumLitres * 0.15)
        else -> quotaFixa + (consumLitres * 0.30)
    }
}

fun familiaNombrosa(): Boolean {

    val nombrosaMonoparental = readBoolean("Sou familia nombrosa (True / False) ?", "Error!!")
    return nombrosaMonoparental
}

fun membres(): Int {
    val membres = llegirInt("Quants integrants té la familia ?", 1, 10)
    return membres
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

fun descompteBoSocial (){

}

