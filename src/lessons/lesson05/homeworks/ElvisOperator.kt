package lessons.lesson05.homeworks

fun main() {

    // Задача 1: Затухание звука
    println("--- Задача 1 ---")
    val baseIntensity: Double = 3.0
    val coefficient: Double? = null
    val baseCoefficient = 0.5

    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)

    println("Начальная интенсивность: $baseIntensity")
    println("Коэффициент затухания: ${coefficient ?: "(неизвестен, взят базовый $baseCoefficient)"}")
    println("Итоговая интенсивность звука: $resultIntensity")
    println()


    // Задача 2: Стоимость доставки
    println("--- Задача 2 ---")
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005

    val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

    println("Стоимость товара: ${cost ?: "(не указана, взята базовая $defaultCost)"}")
    println("Стоимость доставки: $deliveryCost")
    println("Стоимость страховки: $insuranceCost")
    println("Полная стоимость: $totalCost")
    println()


    // Задача 3: Атмосферное давление
    println("--- Задача 3 ---")
    val pressure: String? = null
    val attentionMessage = "Attention, pressure is lost"

    val pressureForLab = pressure ?: attentionMessage

    println("Лаборант передает показания: $pressureForLab")
}