import kotlin.random.Random

/**
*  Created By ISMAIL KIREMITCI
*  12.10.2022
*  App-Point
**/

class RandomLotto {

    private companion object {
        const val CILGIN_DIGIT = 6
        const val CILGIN_MAX_LIMIT = 90

        const val SANS_DIGIT = 5
        const val SANS_MAX_LIMIT = 34

        const val SUPER_DIGIT = 6
        const val SUPER_MAX_LIMIT = 60

        const val ONNUMARA_DIGIT = 10
        const val ONNUMARA_MAX_LIMIT = 90
    }

    private fun rndNumber(maxLimit: Int): Int {
        return Random.nextInt(1, maxLimit + 1)
    }

    private fun printDigit(number: Int, space: Int, ln: Boolean) {
        if (space >= 1)
            for (s in 1..space) {
                print(" ")
            }

        if (number < 10) {
            print(" $number")
        } else {
            print("$number")
        }

        if (ln) println()
    }

    fun create(row: Int, digit: Int, maxNumber: Int, plusMaxNumber: Int) {//Çılgın Sayısal //Şans Topu
        val numberArray = IntArray(digit)
        var randomNumber: Int

        if (row > 0) {
            if (digit == CILGIN_DIGIT && maxNumber == CILGIN_MAX_LIMIT) {//Çılgın Sayısal
                println("Çılgın Sayısal\n----------------------")
                for (i in 1..row) {
                    var d = 0
                    while (d < digit) {
                        randomNumber = rndNumber(maxNumber)
                        var checkNumber = false

                        for (numberObservation in numberArray) {
                            if (numberObservation == randomNumber) {
                                checkNumber = true
                            }
                        }

                        if (!checkNumber) {
                            numberArray[d] = randomNumber
                            d++
                        }
                    }

                    numberArray.sort()
                    for (n in numberArray) {
                        printDigit(n, 1, false)
                    }

                    printDigit(rndNumber(plusMaxNumber), 2, true)
                }
            } else if (digit == SANS_DIGIT && maxNumber == SANS_MAX_LIMIT) {//Şans Topu
                println("Şans Topu\n-------------------")
                for (i in 1..row) {
                    var d = 0
                    while (d < digit) {
                        randomNumber = rndNumber(maxNumber)
                        var checkNumber = false

                        for (numberObservation in numberArray) {
                            if (numberObservation == randomNumber) {
                                checkNumber = true
                            }
                        }

                        if (!checkNumber) {
                            numberArray[d] = randomNumber
                            d++
                        }
                    }

                    numberArray.sort()
                    for (n in numberArray) {
                        printDigit(n, 1, false)
                    }

                    printDigit(rndNumber(plusMaxNumber), 2, true)
                }
            }
        }
    }

    fun create(row: Int, digit: Int, maxNumber: Int) {//Süper Loto //On Numara
        val numberArray = IntArray(digit)
        var randomNumber: Int

        if (row > 0) {
            if (digit == SUPER_DIGIT && maxNumber == SUPER_MAX_LIMIT) {//Çılgın Sayısal
                println("Süper Loto\n------------------")
                for (i in 1..row) {
                    var d = 0
                    while (d < digit) {
                        randomNumber = rndNumber(maxNumber)
                        var checkNumber = false

                        for (numberObservation in numberArray) {
                            if (numberObservation == randomNumber) {
                                checkNumber = true
                            }
                        }

                        if (!checkNumber) {
                            numberArray[d] = randomNumber
                            d++
                        }
                    }

                    numberArray.sort()
                    for (n in numberArray) {
                        printDigit(n, 1, false)
                    }
                    println()
                }
            } else if (digit == ONNUMARA_DIGIT && maxNumber == ONNUMARA_MAX_LIMIT) {//Şans Topu
                println("On Numara\n------------------------------")
                for (i in 1..row) {
                    var d = 0
                    while (d < digit) {
                        randomNumber = rndNumber(maxNumber)
                        var checkNumber = false

                        for (numberObservation in numberArray) {
                            if (numberObservation == randomNumber) {
                                checkNumber = true
                            }
                        }

                        if (!checkNumber) {
                            numberArray[d] = randomNumber
                            d++
                        }
                    }

                    numberArray.sort()
                    for (n in numberArray) {
                        printDigit(n, 1, false)
                    }
                    println()
                }
            }
        }
    }
}

fun main() {

    //Çılgın Sayısal
    RandomLotto().create(1, 6, 90, 90)
    println()
    //Süper Loto
    RandomLotto().create(2, 6, 60)
    println()
    //Şans Topu
    RandomLotto().create(1, 5, 34, 14)
    //println()
    //On Numara
    //RandomLotto().create(1, 10, 90)

}