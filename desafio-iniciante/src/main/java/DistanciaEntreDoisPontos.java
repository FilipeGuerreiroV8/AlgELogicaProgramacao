import java.io.IOException;
import java.util.Scanner;

//código: 1015	Desafio: Distância Entre Dois Pontos
public class DistanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner input = new Scanner(System.in);
        Double x1 = input.nextDouble();
        Double y1 = input.nextDouble();

        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();



        Double distancia = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 1.0 / 2 );

        System.out.println("%.4f".formatted(distancia));
    }

}