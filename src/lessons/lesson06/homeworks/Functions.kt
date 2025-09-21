package lessons.lesson06.homeworks

fun main() {
    println("--- Задание 1: Определение сезона ---")
    printSeason(12)
    printSeason(4)
    printSeason(7)
    printSeason(10)
    printSeason(15)

    println("\n--- Задание 2: Расчет возраста питомца ---")
    calculatePetAge(2)
    calculatePetAge(5)
    calculatePetAge(-1)

    println("\n--- Задание 3: Определение способа перемещения ---")
    recommendTransport(1)
    recommendTransport(3)
    recommendTransport(10)
    recommendTransport(-5)

    println("\n--- Задание 4: Расчет бонусных баллов ---")
    calculateBonusPoints(850)
    calculateBonusPoints(1500)
    calculateBonusPoints(-100)

    println("\n--- Задание 5: Определение типа документа ---")
    getDocumentType("jpg")
    getDocumentType("docx")
    getDocumentType("xlsx")
    getDocumentType("exe")

    println("\n--- Задание 6: Конвертация температуры ---")
    convertTemperature(25.0, 'C')
    convertTemperature(68.0, 'F')
    convertTemperature(100.0, 'K')

    println("\n--- Задание 7: Подбор одежды по погоде ---")
    recommendClothing(-10)
    recommendClothing(15)
    recommendClothing(25)
    recommendClothing(-40)
    recommendClothing(40)

    println("\n--- Задание 8: Выбор фильма по возрасту ---")
    val categoryForChild = getMovieCategory(8)
    println("Возраст 8 лет: доступны категории '$categoryForChild'")

    val categoryForTeen = getMovieCategory(16)
    println("Возраст 16 лет: доступны категории '$categoryForTeen'")

    val categoryForAdult = getMovieCategory(30)
    println("Возраст 30 лет: доступны категории '$categoryForAdult'")
}

/**
 * Задание 1: На основе номера месяца распечатывает сезон года.
 */
fun printSeason(month: Int) {

    if (month !in 1..12) {
        println("Ошибка: неверный номер месяца. Введите число от 1 до 12.")
        return
    }

    val season = when (month) {
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Невозможное значение"
    }
    println("Месяц $month - это $season.")
}

/**
 * Задание 2: Преобразует возраст собаки в "человеческие" годы.
 */
fun calculatePetAge(dogAge: Int) {

    if (dogAge < 0) {
        println("Ошибка: возраст не может быть отрицательным.")
        return
    }

    val humanAge = when {
        dogAge <= 2 -> dogAge * 10.5
        else -> 2 * 10.5 + (dogAge - 2) * 4
    }
    println("Возраст собаки '$dogAge' в человеческих годах: $humanAge")
}

/**
 * Задание 3: Рекомендует способ перемещения в зависимости от длины маршрута.
 */
fun recommendTransport(distance: Int) {
    if (distance < 0) {
        println("Ошибка: расстояние не может быть отрицательным.")
        return
    }

    val transport = when {
        distance <= 1 -> "пешком"
        distance <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
    println("Для маршрута $distance км рекомендуется: $transport")
}

/**
 * Задание 4: Рассчитывает бонусные баллы за покупки.
 */
fun calculateBonusPoints(purchaseAmount: Int) {
    if (purchaseAmount < 0) {
        println("Ошибка: сумма покупки не может быть отрицательной.")
        return
    }

    val bonusPoints = if (purchaseAmount < 1000) {
        (purchaseAmount / 100) * 2
    } else {
        (purchaseAmount / 100) * 3
    }
    println("За покупку на сумму $purchaseAmount руб. начислено $bonusPoints бонусных баллов.")
}

/**
 * Задание 5: Определяет тип документа по его расширению.
 */
fun getDocumentType(extension: String) {

    val type = when (extension.lowercase()) {
        "txt", "doc", "docx" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif" -> "Изображение"
        "xls", "xlsx" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println("Файл с расширением '.$extension': $type")
}

/**
 * Задание 6: Конвертирует температуру между Цельсием и Фаренгейтом.
 */
fun convertTemperature(value: Double, unit: Char) {
    when (unit.uppercaseChar()) {
        'C' -> {
            val fahrenheit = value * 9 / 5 + 32
            print("$value°C = $fahrenheit°")
            print("F")
        }
        'F' -> {
            val celsius = (value - 32) * 5 / 9
            print("$value°F = $celsius°")
            print("C")
        }
        else -> {
            print("Ошибка: неверная единица измерения. Используйте 'C' или 'F'.")
        }
    }
    println()
}

/**
 * Задание 7: Рекомендует одежду по погоде.
 */
fun recommendClothing(temperature: Int) {
    val recommendation = when {
        temperature < -30 || temperature > 35 -> "Лучше не выходить из дома."
        temperature < 10 -> "куртка и шапка"
        temperature <= 18 -> "ветровка"
        else -> "футболка и шорты"
    }
    println("При температуре $temperature°C рекомендуется: $recommendation")
}

/**
 * Задание 8: Возвращает категорию фильма по возрасту зрителя.
 */
fun getMovieCategory(age: Int): String {
    if (age < 0) {
        return "Некорректный возраст"
    }

    return when {
        age <= 9 -> "детские"
        age <= 18 -> "подростковые"
        else -> "18+"
    }
}