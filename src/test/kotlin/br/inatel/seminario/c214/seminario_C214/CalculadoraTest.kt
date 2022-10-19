package br.inatel.seminario.c214.seminario_C214.Calculadora

import Calculadora
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class CalculadoraTest{

    @Test
    fun `some 4 com 9`(){
        val calc = Calculadora()
        val result = calc.sum(4.0, 9.0)
        assertEquals(13.0, result)
    }

    @Test
    fun some_25_com_30(){
        val calc = Calculadora()
        val result = calc.sum(25.0, 30.0)
        assertEquals(50.0, result)
    }

    @Test
    fun `subtraia 3 de 5`(){
        val calc = Calculadora()
        val result = calc.sub(5.0, 3.0)
        assertEquals(2.0, result)
    }

    @Test
    fun `multiplique 2 por 2`(){
        val calc = Calculadora()
        val result = calc.mult(2.0, 2.0)
        assertEquals(4.0, result)
    }

    @Test
    fun `Divida 15 por 4, com a função div throw`(){
        val calc = Calculadora()
        val result = calc.div(15.0, 4.0)
        assertEquals(3.75, result)
    }
    @Test
    fun `Divida 15 por 0, com o retorno do throw`(){
        val calc = Calculadora()
        assertThrows<ArithmeticException> { calc.div(15.0, 0.0) }
    }
}