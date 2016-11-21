
import calculadorajunit.Operacoes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renata
 */
public class OperacoesTest {

    @Test   
    public void testSomar() {
        System.out.println("somar");
        Operacoes instance = new Operacoes(5,5);
        double expResult = 10.0;
        double result = instance.somar();
        assertEquals("Valor da soma não é o esperado", expResult, result, 0);
    }
// 
//    /**
//     * Test of subtrair method, of class Operacoes.
//     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int n1 = 5;
        int n2 = 3;
        Operacoes instance = new Operacoes(5,3);
        double expResult = 2;
        double result = instance.subtrair();
        assertEquals(expResult, result, 0);
    }
// 
//    /**
//     * Test of multiplicar method, of class Operacoes.
//     */
//    @Test
//    public void testMultiplicar() {
//        System.out.println("multiplicar");
//        Operacoes instance = new Operacoes(2,3);
//        double expResult = 6;
//        double result = instance.multiplicar();
//        assertEquals(expResult, result, 0);
//    }
// 
//    /**
//     * Test of dividir method, of class Operacoes.
//     */
//    @Test
//    public void testDividir() {
//        System.out.println("dividir");
//
//        Operacoes instance = new Operacoes(5,2);
//        double expResult = 2.5;
//        double result = instance.dividir();
//        assertEquals(expResult, result, 0);
//    }
}
