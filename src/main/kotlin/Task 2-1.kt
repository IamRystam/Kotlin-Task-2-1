fun main() {
    println("Введите сумму перевода")
    val moneyTransfer = readLine()?.toInt()?:return
    val kopecksRuble= 100
    val percentCommision = 0.75/100
    val amount = (moneyTransfer * kopecksRuble) * percentCommision
    val amountRuble = amount/100
   println( if (amountRuble < 35 ) "Коммисия за перевод соcтавляет 35 р" else "Коммисия за перевод составляет: $amountRuble рублей")

}