package lessons.lesson08.homeworks

fun main() {
    println("--- Задание 7: Все слова с большой буквы ---")
    capitalizeWords("первое слово ВТОРОЕ третье")

    println("\n--- Задание 8: Игра в разведчика ---")
    val originalText = "Kotlin"
    val encryptedText = encrypt(originalText)
    val decryptedText = decrypt(encryptedText)
    println("Оригинал: $originalText")
    println("Зашифровано: $encryptedText")
    println("Расшифровано: $decryptedText")

    val originalTextOdd = "Hello"
    val encryptedTextOdd = encrypt(originalTextOdd)
    val decryptedTextOdd = decrypt(encryptedTextOdd)
    println("Оригинал: $originalTextOdd")
    println("Зашифровано: $encryptedTextOdd")
    println("Расшифровано: $decryptedTextOdd")

    println("\n--- Задание 9: Таблица умножения ---")
    printMultiplicationTable(1..9, 1..9)
}

// Задание 7
fun capitalizeWords(text: String) {
    val capitalized = text.split(" ").joinToString(" ") { word ->
        word.lowercase().replaceFirstChar { it.uppercase() }
    }
    println("Результат: $capitalized")
}

// Задание 8
fun encrypt(text: String): String {
    var processedText = text
    if (processedText.length % 2 != 0) {
        processedText += " "
    }
    val chars = processedText.toCharArray()
    for (i in 0 until chars.size step 2) {
        val temp = chars[i]
        chars[i] = chars[i + 1]
        chars[i + 1] = temp
    }
    return String(chars)
}

fun decrypt(encryptedText: String): String {
    return encrypt(encryptedText)
}

// Задание 9
fun printMultiplicationTable(rows: IntRange, cols: IntRange) {
    val colWidths = cols.map { col ->
        val maxProduct = rows.last * col
        maxProduct.toString().length
    }

    // 2. Печатаем заголовок
    val rowHeaderWidth = rows.last.toString().length
    print(" ".repeat(rowHeaderWidth) + " |")

    // Заголовки столбцов
    cols.forEachIndexed { index, col ->
        print(col.toString().padStart(colWidths[index] + 1))
    }
    println()

    // 3. Печатаем разделитель
    print("-".repeat(rowHeaderWidth) + "-+")
    colWidths.forEach { width ->
        print("-".repeat(width + 1))
    }
    println()

    // 4. Печатаем строки с данными
    for (row in rows) {
        print(row.toString().padStart(rowHeaderWidth) + " |")
        cols.forEachIndexed { index, col ->
            val product = row * col
            print(product.toString().padStart(colWidths[index] + 1))
        }
        println()
    }
}