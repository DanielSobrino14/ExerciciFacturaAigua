fun calcularCostoVariable(litres: Int): Double {
    return when {
        litres < 50 -> 0.0
        litres in 50..200 -> litres * 0.15
        else -> litres * 0.30
    }
}



