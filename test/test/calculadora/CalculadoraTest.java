package test.calculadora;

import com.calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Escribir un programa que realice operaciones aritméticas básicas
 * de una calculadora (suma, resta, multiplicación, división, raíz cuadrada).
 */
public class CalculadoraTest {

    /**
    * Tenemos que tener un método de la clase calculadora que tiene que sumar dos números reales
    * representados como float
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

    /**
     * Tenemos que tener un método de la clase calculadora que tiene que restar dos números reales
     * representados como float
     */
    @Test
    public  void testResta() {
        // arrange
        Calculadora c = new Calculadora();
        float resultadoEsperado = 1.0f;
        float numero1 = 3.0f;
        float numero2 = 2.0f;
        // act
        float resultadoObtenido = c.restar(numero1, numero2);
        // assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

        /**
     * Tenemos que tener un método de la clase calculadora que tiene que multiplicar dos números reales
     * representados como float
     */
    @Test
    public  void testMultiplicacion() {
        // arrange
        Calculadora c = new Calculadora();
        float resultadoEsperado = 6.0f;
        float numero1 = 3.0f;
        float numero2 = 2.0f;
        // act
        float resultadoObtenido = c.multipicar(numero1, numero2);
        // assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

        /**
     * Tenemos que tener un método de la clase calculadora que tiene que dividir dos números reales
     * representados como float
     */
    @Test
    public  void testDivision() {
        // arrange
        Calculadora c = new Calculadora();
        float resultadoEsperado = 1.5f;
        float numero1 = 3.0f;
        float numero2 = 2.0f;
        // act
        float resultadoObtenido = c.dividir(numero1, numero2);
        // assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    /**
     * Tenemos que tener un método de la clase calculadora que tiene que realizar
     * la raíz cuadrada de un número real representado como float
     */
    @Test
    public  void testRaizCuadrada() {
        // arrange
        Calculadora c = new Calculadora();
        float resultadoEsperado = 2.0f;
        float numero1 = 4.0f;
        // act
        float resultadoObtenido = c.raizCuadrada(numero1);
        // assert
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

}
