import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

//código: 1379	Desafio: Problema com Media e Mediana
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class FabricaDeChocolate {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
       while(true){
           Integer A = input.nextInt();
           Integer B = input.nextInt();
           Integer C = input.nextInt();

           if (A == 0 && B == 0 && C == 0){
               break;
           }
           Integer volParalelepipedo = A * B * C;

           Double volCubo = Math.floor(Math.pow(volParalelepipedo, 1.0 / 3));
           DecimalFormat formatacao = new DecimalFormat("#");
           System.out.println(formatacao.format(volCubo));
       }

    }

}