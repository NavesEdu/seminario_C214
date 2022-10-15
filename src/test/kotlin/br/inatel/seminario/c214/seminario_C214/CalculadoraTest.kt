package br.inatel.seminario.c214.seminario_C214.Calculadora

import Calculadora
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test



class CalculadoraTest{

    @Test
    fun `should sum 4 plus 9`(){
        val calc = Calculadora()
        val result = calc.sum(4, 9)
        Assertions.assertEquals(13, result)
    }

    @Test
    fun `should subtract 5 by 3`(){
        val calc = Calculadora()
        val result = calc.sub(5, 3)
        Assertions.assertEquals(2, result)
    }

    @Test
    fun `should multiply 2 by 2`(){
        val calc = Calculadora()
        val result = calc.mult(2, 2)
        Assertions.assertEquals(4, result)
    }

    @Test
    fun `should divide 10 by 5`(){
        val calc = Calculadora()
        val result = calc.div(10, 5)
        Assertions.assertEquals(2, result)
    }
}