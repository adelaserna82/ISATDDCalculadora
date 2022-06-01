package com.calculadora;

public class Calculadora {
    public float sumar(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public float restar(float numero1, float numero2) {
        return numero1 - numero2;
    }

    public float multipicar(float numero1, float numero2) {
        return numero1 * numero2;
    }

    public float dividir(float numero1, float numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

    public float raizCuadrada(float x) throws Exception {
        // Fórmula para aproximarse a la raíz cuadrada de un número
        // https://es.wikipedia.org/wiki/C%C3%A1lculo_de_la_ra%C3%ADz_cuadrada

        if (x < 0) {
            throw new Exception("No se puede hallar la raíz cuadrada de un número negativo");
        }
        var nIzq = 0.0f;
        var nDer = 0.0f;
        var nEsp = 0.0f;

        // Buscamos el más próximo a la raíz cuadrada por la derecha
        while(nDer*nDer<x) {
            nDer += 1.0f;
        }

        // Le restamos uno a la aproximación por la izquierda
        nIzq = nDer - 1.0f;
        // Miramos si nos quedamos con el que se aproxima por la izquierda
        // o por la derecha
        nEsp = (x - nIzq*nIzq) < (nDer*nDer - x) ? nIzq : nDer;

        // Ahora aplicamos la fórmula de Bakhshali
        // raiz(numero) = (n^4 + 6*n^2*x + x^2) / (4*n^3 + 4*n*x)
        return (nEsp*nEsp*nEsp*nEsp + 6*nEsp*nEsp*x + x*x) / (4*nEsp*nEsp*nEsp + 4*nEsp*x);
    }
}
