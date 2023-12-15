import java.util.*

fun main() {
    val options = arrayOf("камень", "ножницы", "бумага")
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Выберите: камень, ножницы или бумага (для выхода введите 'выход'):")
        val playerChoice = scanner.next().toLowerCase()

        if (playerChoice == "выход") {
            break
        }

        if (playerChoice != "камень" && playerChoice != "ножницы" && playerChoice != "бумага") {
            println("Некорректный выбор. Попробуйте снова.")
            continue
        }

        val random = Random()
        val computerChoice = options[random.nextInt(options.size)]

        println("Компьютер выбрал: $computerChoice")

        if (playerChoice == computerChoice) {
            println("Ничья!")
        } else if ((playerChoice == "камень") && (computerChoice == "ножницы"))
        {
                (playerChoice == "ножницы" && computerChoice == "бумага")
                (playerChoice == "бумага" && computerChoice == "камень")

            println("Вы победили!")
        } else {
            println("Вы проиграли!")
        }
    }
}