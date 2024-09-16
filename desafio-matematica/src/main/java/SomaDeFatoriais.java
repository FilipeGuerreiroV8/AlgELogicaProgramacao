import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SomaDeFatoriais {

    public static void main(String[] args) throws IOException {

       Scanner ipt = new Scanner(System.in);
       while (ipt.hasNext()){
           Long n1 = ipt.nextLong();
           Long n2 = ipt.nextLong();

           BigInteger f1 = BigInteger.ONE;
           BigInteger f2 = BigInteger.ONE;

           for (int i = 2; i <= n1 ; i++) {
               f1 = f1.multiply(BigInteger.valueOf(i));
           }

           for (int i = 2; i <= n2 ; i++) {
               f2 = f2.multiply(BigInteger.valueOf(i));
           }

           BigInteger soma = f1.add(f2);


               System.out.println(soma);

       }
        ipt.close();
    }

}