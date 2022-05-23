package test.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Escribir un programa que realice operaciones aritméticas básicas
 * de una calculadora (suma, resta, multiplicación, raíz cuadrada).
 */
public class CalculadoraTest {

    /* Tenemos un método de la clase calculadora que tiene que sumar dos números */
    @Test
    public void testSuma() {
        Calculadora c = new Calculadora();

        assertEquals(5, c.suma(2, 3));
    }

}
