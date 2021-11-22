import kotlin.random.Random

fun main(args: Array<String>) {
    //Declared a random number
    val randomNumber = Random.nextInt(0, 10)

    // Ask user enter first number
    print("Enter your first number : ")
    val numberOne = readLine()!!.toInt()

    // Ask user enter second number
    print("Enter your first number : ")
    val numberTow = readLine()!!.toInt()

    //Declared constants to calculate all of (First Number , Second Number , Random Number)
    val calculated = numberOne * randomNumber + numberTow

    println("$numberOne * X + $numberTow = $calculated ")

    try {
        // guess user what is random number (X)
        print("What is X? >> ")
        var guess = readLine()!!.toInt()

        if (guess == randomNumber) {
            print("You got it!")

        } else {
            print("try again $randomNumber")
        }

    } catch (e: Exception) {
        print("Please enter number only.")
    }


}