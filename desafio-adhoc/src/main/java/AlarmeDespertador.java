import java.io.IOException;
import java.util.Scanner;
//código: 1103	Desafio: Alarme Despertador


/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AlarmeDespertador {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while(true){
            Integer H1 = input.nextInt();
            Integer M1 = input.nextInt();

            Integer H2 = input.nextInt();
            Integer M2 = input.nextInt();
        if(H1 == 0 && H2 == 0 && M1 == 0 && M2 == 0){
            break;
        }
        Integer tempoTotal = 0;
        Integer contagemMinuto = M1;
        while(H1 != H2 || contagemMinuto != M2){
            contagemMinuto++;
            tempoTotal++;
            if (contagemMinuto.equals(60)){
                contagemMinuto = 0;
                H1++;
            }
            if (H1.equals(24)){
                H1 = 0;
            }

        }
            System.out.println(tempoTotal);
        }

    }

}