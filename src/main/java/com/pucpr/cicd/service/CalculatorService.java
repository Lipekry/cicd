package com.pucpr.cicd.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Não existe raiz real de número negativo");
        }
        return Math.sqrt(numero);
    }
}