package calculadorajunit;

import static java.lang.Math.sqrt;

/**
 *
 * @author Renata
 */
public class Operacoes {

    private int valor1 = 0;
    private int valor2 = 0;
    private int resultado = 0;
    private double resultado2 = 0;

    public Operacoes(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int somar() {
        resultado = valor1 + valor2;
        return resultado;
    }

    public int subtrair() {
        resultado = valor1 - valor2;
        return resultado;
    }

    public int multiplicar() {
        resultado = valor1 * valor2;
        return resultado;
    }

    public int dividir() {
        resultado = valor1 / valor2;
        return resultado;
    }
    
    public double raizquadrada() {
        resultado2 = sqrt(valor1);
        return resultado2;
    }
    
    public double porcentagem() {
        resultado2 = valor2*100/valor1;
        return resultado2;               
    }    

    public int fatorial() {
        if(valor1==1 || valor1==0)
            return 1;
        else
        {
            valor1-=1;
            return (valor1+1) * fatorial(); 
        }
            
    }
    
    public void fibonacci(int valor) {
        
        for(;resultado<=valor;resultado=valor1+valor2)
        {
            System.out.println(resultado);
            valor1=valor2;
            valor2=resultado;      
        }
        
    }    
    
}
