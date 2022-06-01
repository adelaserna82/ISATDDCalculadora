package test.calculadora;

import com.calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
        class Mock {
            protected float numero1;
            protected float numero2;
            protected float resultadoEsperado;
            public Mock(float numero1, float numero2, float resultadoEsperado) {
                this.numero1 = numero1;
                this.numero2 = numero2;
                this.resultadoEsperado = resultadoEsperado;
            }
        }

        Mock[] tests = {
                new Mock(2.0f, 3.0f,5.0f),
                new Mock(-2.0f, 3.0f, 1.0f),
                new Mock(2.0f,-3.0f,-1.0f),
        };
        Calculadora c = new Calculadora();

        for(Mock test : tests){
            // act
            float resultadoObtenido = c.sumar(test.numero1, test.numero2);
            // assert
            assertEquals(test.resultadoEsperado, resultadoObtenido);
        }

    }


    /**
     * Tenemos que tener un método de la clase calculadora que tiene que restar dos números reales
     * representados como float
     */
    @Test
    public void testResta() {
            // arrange
            class Mock {
                protected float numero1;
                protected float numero2;
                protected float resultadoEsperado;
                public Mock(float numero1, float numero2, float resultadoEsperado) {
                    this.numero1 = numero1;
                    this.numero2 = numero2;
                    this.resultadoEsperado = resultadoEsperado;
                }
            }

            Mock[] tests = {
                    new Mock(2.0f, 3.0f,-1.0f),
                    new Mock(-2.0f, 3.0f, -5.0f),
                    new Mock(2.0f,-3.0f,5.0f),
            };
            Calculadora c = new Calculadora();

            for(Mock test : tests){
                // act
                float resultadoObtenido = c.restar(test.numero1, test.numero2);
                // assert
                assertEquals(test.resultadoEsperado, resultadoObtenido);
            }
        }

        /**
     * Tenemos que tener un método de la clase calculadora que tiene que multiplicar dos números reales
     * representados como float
     */
    @Test
    public  void testMultiplicacion() {
        // arrange
        class Mock {
            protected float numero1;
            protected float numero2;
            protected float resultadoEsperado;
            public Mock(float numero1, float numero2, float resultadoEsperado) {
                this.numero1 = numero1;
                this.numero2 = numero2;
                this.resultadoEsperado = resultadoEsperado;
            }
        }

        Mock[] tests = {
                new Mock(2.0f, 3.0f,6.0f),
                new Mock(-2.0f, 3.0f, -6.0f),
                new Mock(2.0f,-3.0f,-6.0f),
        };
        Calculadora c = new Calculadora();

        for(Mock test : tests){
            // act
            float resultadoObtenido = c.multipicar(test.numero1, test.numero2);
            // assert
            assertEquals(test.resultadoEsperado, resultadoObtenido);
        }
    }

        /**
     * Tenemos que tener un método de la clase calculadora que tiene que dividir dos números reales
     * representados como float
     */
    @Test
    public  void testDivision() {
        // arrange
        class Mock {
            protected float numero1;
            protected float numero2;
            protected float resultadoEsperado;
            public Mock(float numero1, float numero2, float resultadoEsperado) {
                this.numero1 = numero1;
                this.numero2 = numero2;
                this.resultadoEsperado = resultadoEsperado;
            }
        }

        Mock[] tests = {
                new Mock(3.0f, 2.0f,1.5f),
                new Mock(2.0f, 2.0f, 1.0f),
                new Mock(10.0f,2.0f,5.0f),
        };
        Calculadora c = new Calculadora();

        for(Mock test : tests){
            try {

                // act
                float resultadoObtenido = c.dividir(test.numero1, test.numero2);
                // assert
                assertEquals(test.resultadoEsperado, resultadoObtenido);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }


    /**
     * Tenemos que tener un método de la clase calculadora que tiene que realizar
     * la raíz cuadrada de un número real representado como float
     */
    @Test
    public  void testRaizCuadrada() {
        // arrange
        class Mock {
            protected float numero;
            protected float resultadoEsperado;
            public Mock(float numero,  float resultadoEsperado) {
                this.numero = numero;
                this.resultadoEsperado = resultadoEsperado;
            }
        }

        Mock[] tests = {
                new Mock(45.0f, 6.708203932499369f),
                new Mock(15.0f,  3.872983346207417f)
        };
        Calculadora c = new Calculadora();

        for(Mock test : tests){
            try {
                // act
                float resultadoObtenido = c.raizCuadrada(test.numero);
                // assert
                assertTrue(test.resultadoEsperado - resultadoObtenido < 0.00001);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
