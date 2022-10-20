package br.inatel.seminario.c214.seminario_C214.components

class Calculadora {

    fun sum(num1: Int, num2: Int) = num1 + num2

    fun sub(num1: Int, num2: Int) = num1 - num2

    fun mult(num1: Int, num2: Int) = num1 * num2

    fun div(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            throw ArithmeticException()
        } else {
            return num1 / num2
        }
    }

}

