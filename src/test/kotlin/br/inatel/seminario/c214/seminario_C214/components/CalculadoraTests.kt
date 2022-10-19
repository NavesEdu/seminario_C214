package br.inatel.seminario.c214.seminario_C214.components

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class CalculadoraTests{


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

    @Test
    fun `Divide by zero should throw ArithmeticException`() {
        val calc = Calculadora()
        assertThrows<ArithmeticException> {
            calc.div(1, 0)
        }
    }

    @Test
    fun `Should do all `(){
        val calc = Calculadora()
        assertAll(
            { assertEquals(2, calc.sum(1,1)) },
            { assertEquals(4, calc.mult(2,2)) },
            { assertEquals(4, calc.div(8,2)) }
        )
    }

    @Test
    fun `using NotEquals in sum`(){
        val calc = Calculadora()
        val result = calc.sum(25, 30)
        assertNotEquals(50,result)
    }

}