package com.eryckavel.math;

public class MatematicaSimples {

    public Double soma(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public Double subtracao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    public Double divisao(Double primeiroNumero, Double segundoNumero) {
        if (segundoNumero.equals(0D)) throw new ArithmeticException("Impossivel dividir por zero!");
        return primeiroNumero / segundoNumero;
    }

    public Double media(Double primeiroNumero, Double segundoNumero) {
        return (primeiroNumero + segundoNumero) / 2;
    }

    public Double raizQuadrada(Double numero) {
        return Math.sqrt(numero);
    }

}
