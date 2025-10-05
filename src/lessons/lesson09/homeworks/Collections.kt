package lessons.lesson09.homeworks

fun main() {
    println("--- Работа с массивами Array ---")

    val array1 = Array(5) { it + 1 }
    println("1. Массив от 1 до 5: ${array1.joinToString()}")

    val array2 = arrayOfNulls<String>(10)
    println("2. Пустой массив строк: ${array2.joinToString()}")

    val array3 = Array(5) { it * 2.0 }
    println("3. Массив Double (удвоенный индекс): ${array3.joinToString()}")

    val array4 = Array(5) { it * 3 }
    println("4. Массив Int (индекс * 3): ${array4.joinToString()}")

    val array5 = arrayOf("Hello", null, "World")
    println("5. Массив nullable строк: ${array5.joinToString()}")

    val sourceArray6 = arrayOf(10, 20, 30)
    val copiedArray6 = Array(sourceArray6.size) { 0 }
    for (i in sourceArray6.indices) {
        copiedArray6[i] = sourceArray6[i]
    }
    println("6. Скопированный массив: ${copiedArray6.joinToString()}")

    val array7a = arrayOf(10, 20, 30, 40)
    val array7b = arrayOf(5, 10, 15, 20)
    val result7 = Array(array7a.size) { 0 }
    for (i in array7a.indices) {
        result7[i] = array7a[i] - array7b[i]
    }
    println("7. Результат вычитания массивов: ${result7.joinToString()}")

    val array8 = arrayOf(1, 3, 8, 5, 2)
    var index8 = 0
    var foundIndex8 = -1
    while (index8 < array8.size) {
        if (array8[index8] == 5) {
            foundIndex8 = index8
            break
        }
        index8++
    }
    println("8. Индекс элемента со значением 5: $foundIndex8")

    println("9. Проверка на четность:")
    val array9 = arrayOf(1, 2, 3, 4, 5, 6)
    for (element in array9) {
        val type = if (element % 2 == 0) "чётное" else "нечётное"
        println("$element - $type")
    }

    val array10 = arrayOf("hello world", "kotlin is fun", "find me", "another string")
    findSubstringInArray(array10, "is fun")

    println("\n--- Работа со списками List ---")

    val list1: List<Int> = listOf()
    println("1. Пустой неизменяемый список: $list1")

    val list2 = listOf("Hello", "World", "Kotlin")
    println("2. Неизменяемый список строк: $list2")

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    println("3. Изменяемый список целых чисел: $list3")

    list3.addAll(listOf(6, 7, 8))
    println("4. Список после добавления элементов: $list3")

    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println("5. Список после удаления элемента: $list5")

    println("6. Вывод каждого элемента списка:")
    val list6 = listOf(10, 20, 30)
    for (element in list6) {
        println(element)
    }

    val list7 = listOf("First", "Second", "Third")
    val secondElement = list7[1]
    println("7. Второй элемент списка: $secondElement")

    val list8 = mutableListOf(10, 20, 30)
    list8[2] = 99
    println("8. Список после изменения элемента: $list8")

    val list9a = listOf("a", "b", "c")
    val list9b = listOf("d", "e", "f")
    val combinedList9 = mutableListOf<String>()
    for (element in list9a) {
        combinedList9.add(element)
    }
    for (element in list9b) {
        combinedList9.add(element)
    }
    println("9. Объединенный список: $combinedList9")

    val list10 = listOf(5, 1, 9, 3, 7)
    var min = list10[0]
    var max = list10[0]
    for (element in list10) {
        if (element < min) min = element
        if (element > max) max = element
    }
    println("10. Минимальный элемент: $min, Максимальный: $max")

    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenList11 = mutableListOf<Int>()
    for (element in list11) {
        if (element % 2 == 0) {
            evenList11.add(element)
        }
    }
    println("11. Список только с четными числами: $evenList11")

    println("\n--- Работа с Множествами Set ---")

    val set1: Set<Int> = setOf()
    println("1. Пустое неизменяемое множество: $set1")

    val set2 = setOf(1, 2, 3)
    println("2. Неизменяемое множество: $set2")

    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
    println("3. Изменяемое множество: $set3")

    set3.addAll(listOf("Swift", "Go"))
    println("4. Множество после добавления: $set3")

    val set5 = mutableSetOf(1, 2, 3, 4)
    set5.remove(2)
    println("5. Множество после удаления: $set5")

    println("6. Вывод каждого элемента множества:")
    val set6 = setOf(100, 200, 300)
    for (element in set6) {
        println(element)
    }

    val set7 = setOf("apple", "banana", "cherry")
    val hasBanana = containsStringInSet(set7, "banana")
    println("7. Множество содержит 'banana': $hasBanana")

    val set8 = setOf("a", "b", "c")
    val list8fromSet = mutableListOf<String>()
    for (element in set8) {
        list8fromSet.add(element)
    }
    println("8. Список, конвертированный из множества: $list8fromSet")
}

fun findSubstringInArray(array: Array<String>, substring: String) {
    print("10. Поиск подстроки '$substring': ")
    for (element in array) {
        if (element.contains(substring, ignoreCase = true)) {
            println("Найден элемент '$element'")
            return
        }
    }
    println("Элемент не найден.")
}

fun containsStringInSet(set: Set<String>, search: String): Boolean {
    for (element in set) {
        if (element == search) {
            return true
        }
    }
    return false
}