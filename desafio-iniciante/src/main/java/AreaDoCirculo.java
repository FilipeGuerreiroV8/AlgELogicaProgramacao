import java.io.IOException;
import java.util.Scanner;

//código: 1002	Desafio: Área do Circulo
public class AreaDoCirculo {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner input = new Scanner(System.in);
        Double raio = input.nextDouble();

        Double N = 3.14159;
        Double area = N * Math.pow(raio, 2);
        System.out.println("A=%.4f".formatted(area));
    }
}
