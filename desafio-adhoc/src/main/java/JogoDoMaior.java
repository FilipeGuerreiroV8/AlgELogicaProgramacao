import java.io.IOException;
import java.util.Scanner;
//código: 1397	Desafio: Jogo do Maior

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class JogoDoMaior {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        while(true){
            Integer qtdRodadas = input.nextInt();
            Integer pontoA = 0;
            Integer pontoB = 0;

            if (qtdRodadas == 0){
                break;
            }

            for (int i = 0; i < qtdRodadas; i++){
                Integer escolhaA = input.nextInt();
                Integer escolhaB = input.nextInt();

                if (escolhaA > escolhaB){
                    pontoA++;
                }else if(escolhaA < escolhaB){
                    pontoB++;
                }
            }

            System.out.println(pontoA + " " + pontoB);
        }
    }

}