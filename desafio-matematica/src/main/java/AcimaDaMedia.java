import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AcimaDaMedia {

    public static void main(String[] args) throws IOException {

        Scanner ipt = new Scanner(System.in);
        Integer qtdRodadas = ipt.nextInt();


        for(int i = 0; i < qtdRodadas; i++){
            int qtdAlunos = ipt.nextInt();
            int[] notas = new int[qtdAlunos];

            double media = 0.0;
            for (int j = 0; j < qtdAlunos; j++){
                Integer notaAtual = ipt.nextInt();
                notas[j] = notaAtual;
                media += notaAtual;
            }
            media /= qtdAlunos;
            int qtdAlunosAcima = 0;
//            System.out.println("Média da sala: " + media);
            for (int n : notas){
                if (n > media){
                    qtdAlunosAcima++;
                }

            }
            Double porcentagemAcima = (((double) qtdAlunosAcima / (double) qtdAlunos) * 100.00);

            System.out.printf("%.3f%%%n", porcentagemAcima);



        }
    }

}