class Calculadora {

    fun sum(num1: Double, num2: Double) = num1 + num2

    fun sub(num1: Double, num2: Double) = num1 - num2

    fun mult(num1: Double, num2: Double) = num1 * num2

    fun div(num1: Double, num2: Double): Any {
        return if(num2 != 0.0){
            num1 / num2
        }
        else{
            throw ArithmeticException("Não é possível dividir por zero")
        }
    }

}

