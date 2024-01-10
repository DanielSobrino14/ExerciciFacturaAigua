
fun consumLitresAigua(consumLitres: Int): Double {
    val quotaFixa = 6.0
    return when {
        consumLitres < 50 -> quotaFixa
        consumLitres in 50..200 -> quotaFixa + (consumLitres * 0.15)
        else -> quotaFixa + (consumLitres * 0.30)
    }
}

fun descompteBoSocial(litres: Int): Double {
    val descompte = litres * 0.8
    return litres - descompte
}



