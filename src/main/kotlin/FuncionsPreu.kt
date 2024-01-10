fun calcularPreu(litres: Int): Int {
    var costVariable = 0
    val quota = 6
   when {
       litres < 50 -> {
           costVariable= quota
       }
       litres in 50..200 -> {
           costVariable= quota * 0.15
       }
       litres > 200 -> {
           costVariable= quota * 0.30
       }
   }
    val preuFinal= costVariable + quota
    return preuFinal

}


