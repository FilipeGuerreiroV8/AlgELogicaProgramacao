import java.io.IOException;
import java.util.Scanner;
//código: 3416	Desafio: Eu Quero Cafééé

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class EuQueroCafeee {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        Integer L = input.nextInt();
        Double D = input.nextDouble() / 1000;


        Double demandaCafe = (N * D);
        Integer qtdMinCafe = L;
        System.out.println(demandaCafe);
        while(demandaCafe > qtdMinCafe){
            qtdMinCafe += L;
        }
        System.out.println(qtdMinCafe);
    }

}