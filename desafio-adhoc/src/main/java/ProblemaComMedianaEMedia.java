import java.io.IOException;
import java.util.Scanner;

//código: 1379	Desafio: Problema com Media e Mediana
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ProblemaComMedianaEMedia {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true){
        Integer A = input.nextInt();
        Integer B = input.nextInt();
        if (A == 0 && B == 0){
            break;
        }
        Integer C = 2 * A - B; // A = (A + B + C) / 3 - > isolar o C
            System.out.println(C);
        }

    }

}