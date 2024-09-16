import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class OBravoGuerreiroHashmat {

    public static void main(String[] args) throws IOException {
        Scanner ipt = new Scanner(System.in);
        while(ipt.hasNext()){

        long soldadosHashmat = ipt.nextLong();
        long soldadosOponentes = ipt.nextLong();
        long resultado = soldadosHashmat - soldadosOponentes;
        resultado *= resultado < 0 ? -1 : 1;
        System.out.println(resultado);
    }
        ipt.close();
        }

}