package lessons.lesson07.homeworks

fun main() {
    println("--- Задания для цикла for ---")
    println("\nПрямой диапазон:")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    println("\nЧетные числа от 1 до 10:")
    for (i in 2..10 step 2) {
        print("$i ")
    }
    println()

    println("\nОбратный диапазон (5 до 1):")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    println("\nОбратный диапазон (10 до 1 с шагом 2):")
    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }
    println()

    println("\nС шагом 2 (от 1 до 9):")
    for (i in 1..9 step 2) {
        print("$i ")
    }
    println()

    println("\nКаждое третье число от 1 до 20:")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    println("\nИспользование до (until):")
    val size = 11
    for (i in 3 until size step 2) {
        print("$i ")
    }
    println()

    println("\n--- Задания для цикла while ---")
    println("\nКвадраты чисел от 1 до 5:")
    var i = 1
    while (i <= 5) {
        println("$i в квадрате = ${i * i}")
        i++
    }

    println("\nУменьшение числа от 10 до 5:")
    var num = 10
    while (num > 5) {
        num--
    }
    println("Результат: $num")

    println("\nЦикл do while (5 до 1):")
    var counter1 = 5
    do {
        print("$counter1 ")
        counter1--
    } while (counter1 >= 1)
    println()

    println("\nЦикл do while (от 5 до 10):")
    var counter2 = 5
    do {
        print("$counter2 ")
        counter2++
    } while (counter2 < 10)
    println()

    println("\n--- Задания для прерывания и пропуска итерации ---")
    println("\nИспользование break в for:")
    for (j in 1..10) {
        if (j == 6) break
        print("$j ")
    }
    println()

    println("\nИспользование break в while:")
    var k = 1
    while (true) {
        print("$k ")
        if (k == 10) break
        k++
    }
    println()

    println("\nИспользование continue в for:")
    for (l in 1..10) {
        if (l % 2 == 0) continue
        print("$l ")
    }
    println()

    println("\nИспользование continue в while:")
    var m = 0
    while (m < 10) {
        m++
        if (m % 3 == 0) continue
        print("$m ")
    }
    println()

    println("\n--- Задачи в функциях ---")
    sumUntil(10)
    factorial(5)
    sumOfEvens(10)
    drawRectangle(5, 3)
    sumOfEvenAndOdd(10)

    println("\n--- Задача повышенной сложности (таблица умножения) ---")
    print("\t")
    for (colHeader in 1..9) {
        print("$colHeader\t")
    }
    println()
    for (row in 1..9) {
        print("$row\t")
        for (col in 1..9) {
            print("${row * col}\t")
        }
        println()
    }
}

fun sumUntil(arg: Int) {
    var sum = 0
    for (i in 1..arg) {
        sum += i
    }
    println("Сумма чисел от 1 до $arg: $sum")
}

fun factorial(arg: Int) {
    var result: Long = 1
    var i = 1
    while (i <= arg) {
        result *= i
        i++
    }
    println("Факториал числа $arg: $result")
}

fun sumOfEvens(arg: Int) {
    var sum = 0
    var i = 2
    while (i <= arg) {
        sum += i
        i += 2
    }
    println("Сумма четных чисел от 2 до $arg: $sum")
}

fun drawRectangle(width: Int, height: Int) {
    println("Прямоугольник ${width}x${height}:")
    var h = 0
    while (h < height) {
        var w = 0
        while (w < width) {
            print("* ")
            w++
        }
        println()
        h++
    }
}

fun sumOfEvenAndOdd(arg: Int) {
    var evenSum = 0
    var oddSum = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            oddSum += i
        }
    }
    println("Сумма четных до $arg: $evenSum. Сумма нечетных: $oddSum.")
}