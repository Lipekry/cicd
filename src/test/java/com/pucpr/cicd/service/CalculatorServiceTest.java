package com.pucpr.cicd.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void deveSomarCorretamente() {
        double resultado = calculatorService.somar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void deveSubtrairCorretamente() {
        double resultado = calculatorService.subtrair(10, 4);
        assertEquals(5, resultado);
    }

    @Test
    void deveMultiplicarCorretamente() {
        double resultado = calculatorService.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    void deveDividirCorretamente() {
        double resultado = calculatorService.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void naoDevePermitirDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.dividir(10, 0);
        });
    }

    @Test
    void deveCalcularPotencia() {
        double resultado = calculatorService.potencia(2, 3);
        assertEquals(8, resultado);
    }

    @Test
    void deveCalcularRaizQuadrada() {
        double resultado = calculatorService.raizQuadrada(9);
        assertEquals(3, resultado);
    }

    @Test
    void naoDevePermitirRaizDeNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.raizQuadrada(-4);
        });
    }
}