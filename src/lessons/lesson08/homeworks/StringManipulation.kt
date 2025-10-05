package lessons.lesson08.homeworks

fun main() {
    println("--- Задание 1: Преобразование строк ---")
    transformPhrase("Это невозможно выполнить за один день")
    transformPhrase("Я не уверен в успехе этого проекта")
    transformPhrase("Произошла катастрофа на сервере")
    transformPhrase("Этот код работает без проблем")
    transformPhrase("Удача")
    transformPhrase("Обычная фраза без ключевых слов")

    println("\n--- Задание 2: Извлечение даты из строки лога ---")
    extractDateTime("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println("\n--- Задание 3: Маскирование личных данных ---")
    maskCreditCard("4539 1488 0343 6467")

    println("\n--- Задание 4: Форматирование адреса электронной почты ---")
    formatEmail("username@example.com")

    println("\n--- Задание 5: Извлечение имени файла из пути ---")
    getFileNameFromPath("C:/Пользователи/Документы/report.txt")
    getFileNameFromPath("D:/good.themes/dracula.theme")

    println("\n--- Задание 6: Создание аббревиатуры из фразы ---")
    createAbbreviation("Котлин лучший язык программирования")
    createAbbreviation("объектно ориентированное программирование")
}

// Задание 1
fun transformPhrase(phrase: String) {
    val result = when {
        phrase.contains("невозможно") ->
            phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
        phrase.startsWith("Я не уверен") ->
            "$phrase, но моя интуиция говорит об обратном"
        phrase.contains("катастрофа") ->
            phrase.replace("катастрофа", "интересное событие")
        phrase.endsWith("без проблем") ->
            phrase.replace("без проблем", "с парой интересных вызовов на пути")
        !phrase.contains(" ") -> // Проверяем, что в фразе нет пробелов (т.е. одно слово)
            "Иногда, $phrase, но не всегда"
        else -> phrase // Если ни одно условие не подошло, возвращаем исходную фразу
    }
    println("Исходная фраза: '$phrase'\nПреобразованная: '$result'\n")
}

// Задание 2
fun extractDateTime(log: String) {
    val parts = log.split(" -> ")
    if (parts.size == 2) {
        val dateTimeString = parts[1]
        val dateTimeParts = dateTimeString.split(" ")
        if (dateTimeParts.size == 2) {
            val date = dateTimeParts[0]
            val time = dateTimeParts[1]
            println("Дата: $date")
            println("Время: $time")
        }
    }
}

// Задание 3
fun maskCreditCard(cardNumber: String) {
    val cleanCardNumber = cardNumber.replace(" ", "")
    val lastFourDigits = cleanCardNumber.substring(cleanCardNumber.length - 4)
    val maskedPart = "*".repeat(cleanCardNumber.length - 4)
    println("Замаскированный номер: $maskedPart$lastFourDigits")
}

// Задание 4
fun formatEmail(email: String) {
    val formatted = email.replace("@", " [at] ").replace(".", " [dot] ")
    println("Отформатированный email: $formatted")
}

// Задание 5
fun getFileNameFromPath(path: String) {
    val fileName = path.substringAfterLast("/")
    println("Имя файла: $fileName")
}

// Задание 6
fun createAbbreviation(phrase: String) {
    val words = phrase.split(" ")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word.first()
        }
    }
    println("Аббревиатура для '$phrase': ${abbreviation.uppercase()}")
}