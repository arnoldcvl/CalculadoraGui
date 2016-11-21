package calculadorajunit;

/**
 *
 * @author Renata
 */
public class Operacoes {

    private int valor1 = 0;
    private int valor2 = 0;
    private int resultado = 0;

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

}
