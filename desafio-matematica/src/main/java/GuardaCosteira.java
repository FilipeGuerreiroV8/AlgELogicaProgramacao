import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class GuardaCosteira {

    public static void main(String[] args) throws IOException {
        Scanner ipt = new Scanner(System.in);
        Integer distancia = ipt.nextInt();
        Integer vFugitivo = ipt.nextInt();
        Integer vGuarda = ipt.nextInt();
        Double limite = 12.0;

        Double dGuarda = Math.sqrt(distancia*distancia + limite*limite);
        Double tGuarda = dGuarda / vGuarda;
        Double tFugitivo = limite / vFugitivo;
        if(tGuarda <= tFugitivo){
            System.out.println("S");
        }else {
            System.out.println("N");
        }
    }

}