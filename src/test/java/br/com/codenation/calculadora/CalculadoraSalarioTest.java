package br.com.codenation.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculadoraSalarioTest {

    @Test
    public void salarioLiquidoIsNotNull() {
        assertNotNull(new CalculadoraSalario().calcularSalarioLiquido(1000.0));
    }

    @Test
    public void deveCalcularDescontoDeINSSDeOitoPorcento() {
        double salarioBase = 100.0;
        double salarioLiquido = 0;
        assertEquals(salarioLiquido ,new CalculadoraSalario().calcularSalarioLiquido(salarioBase), 0);
    }

    @Test
    public void deveCalcularDescontoDeINSSDeNovePorcento() {
        double salarioBase = 1500.01;
        double salarioLiquido = 1365.00;
        assertEquals(salarioLiquido ,new CalculadoraSalario().calcularSalarioLiquido(salarioBase), 0);
    }

    @Test
    public void deveCalcularDescontoDeINSSDeNovePorcentoMaisDescontoIRRFDeSeteEMeioPorcento() {
        double salarioBase = 4000;
        double salarioLiquido = 3367.0;
        assertEquals(salarioLiquido ,new CalculadoraSalario().calcularSalarioLiquido(salarioBase), 0);
        salarioBase = 3500.0;
        salarioLiquido = 2946.0;
        assertEquals(salarioLiquido ,new CalculadoraSalario().calcularSalarioLiquido(salarioBase), 0);
    }

    @Test
    public void deveCalcularDescontoDeINSSDeOnzePorcento() {
        double salarioBase = 5000;
        double salarioLiquido = 4116.0;
        assertEquals(salarioLiquido ,new CalculadoraSalario().calcularSalarioLiquido(salarioBase), 0);
    }

    @Test
    public void deveCalcularDescontoDeINSSDeOnzePorcentoMaisDescontoDeIRRFDeQuinzePorcento() {
        double salarioBase = 10000;
        double salarioLiquido = 7565;
        assertEquals(salarioLiquido ,new CalculadoraSalario().calcularSalarioLiquido(salarioBase), 0);
    }
}
