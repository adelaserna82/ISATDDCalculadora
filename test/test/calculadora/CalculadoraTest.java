package test.calculadora;

import com.calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Escribir un programa que realice operaciones aritméticas básicas
 * de una calculadora (suma, resta, multiplicación, raíz cuadrada).
 */
public class CalculadoraTest {

    /**
    /* Tenemos un método de la clase calculadora que tiene que sumar dos números reales
     representados como float
     */
    @Test
    public void testSuma() {
        // arrange
        Calculadora c = new Calculadora();
        float resultadoEsperado = 5.0f;
        float numero1 = 2.0f;
        float numero2 = 3.0f;
        // act
        float resultadoObtenido = c.sumar(numero1, numero2);
        // assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

}
