package com.example.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    

        
}
