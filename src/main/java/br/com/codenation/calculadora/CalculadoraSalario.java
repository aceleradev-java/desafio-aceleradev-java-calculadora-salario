package br.com.codenation.calculadora;

public class CalculadoraSalario {

    public long calcularSalarioLiquido(double salarioBase) {
        //Use o Math.round apenas no final do método para arredondar o valor final.
        //Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
        
        if (salarioBase <= 1039) {
            return 0;
        }
        double descontoINSS = calcularInss(salarioBase);
        double descontoIRRF = calcularIRRF(salarioBase - descontoINSS);
        double salarioLiquido = salarioBase - descontoINSS - descontoIRRF;
        
        return Math.round(salarioLiquido);
    }

    //Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
    private double calcularInss(double salarioBase) {
        double descontoINSS = 0.0;
        
        if (salarioBase <= 1500) {
            descontoINSS = salarioBase * 0.08; //8%
        } 
        else if (salarioBase <= 4000) {
            descontoINSS = salarioBase * 0.09; // 9%
        } 
        else {
            descontoINSS = salarioBase * 0.11; // 11
        }
        return descontoINSS;
    }

    private double calcularIRRF(double salarioComDescontoINSS) {
        double desconto = 0.0;
        if (salarioComDescontoINSS > 3000 && salarioComDescontoINSS <= 6000) {
            desconto = salarioComDescontoINSS * 0.075;
        } else if(salarioComDescontoINSS > 6000){
            desconto = salarioComDescontoINSS * 0.15;
        }
        return desconto;
    }
}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/
