package com.example.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    private  Calculadora calc;

    @BeforeEach
    public  void inicializarCalc() {
        calc = new Calculadora();
    }
    
    @DisplayName("Teste de soma")
    @Test
    public void soma2numeros() {
        int result = calc.soma(4, 5);
        assertEquals(9, result);
    }
    @DisplayName("Teste de Subtração")

    @Test
    public void subtrai2numeros() {
        int result = calc.subtracao(4, 5);
        assertEquals(-1, result);
    }
    @DisplayName("Teste de multiplicação")
    @Test
    public void multiplica2numeros() {
        int result = calc.multiplicacao(5, 5);
        assertEquals(25, result);        
    } 

    @DisplayName("Teste de divisão")
    @Test
    public void divide2numeros() {
        int result = calc.divisao(20, 4);
        assertEquals(5, result);
    }

    @DisplayName("Teste de Somatorio")
    @Test
    public void somatorio() {
        int result = calc.somatoria(5);
        assertEquals(15, result);
    }
    
    @Test
    public void numeropositivo() {
        boolean result= calc.ehPositivo(25);
        assertTrue(result);
        
    }

    @Test
    public void numeronegativo() {
        boolean result= calc.ehPositivo(-25);
        assertFalse(result);
        
    }

    @Test
    public void compara2numeros() {
        int result = calc.compara(5, 5);
        assertEquals(0, result);
    }
        
}
