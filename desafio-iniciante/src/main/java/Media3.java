import java.io.IOException;
import java.util.Scanner;
//código: 1040	Desafio: Média 3
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Media3 {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner input = new Scanner(System.in);

        Double N1 = input.nextDouble();
        Double N2 = input.nextDouble();
        Double N3 = input.nextDouble();
        Double N4 = input.nextDouble();

        Double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) * 0.1;
        media = Math.floor(media * 10)/10;
        String situacao = "";

        if (media >= 7.0){
             situacao = "Aluno aprovado.";
        }else if (media >= 5.0){
             situacao = "Aluno em exame.";
        }else {
             situacao = "Aluno reprovado.";
        }



        System.out.println("Media: " + media);
        System.out.println(situacao);
        if (situacao.equals("Aluno em exame.")){
            Double notaExame = input.nextDouble();
            Double mediaFinal = (media + notaExame) * 0.5;
            mediaFinal = Math.floor(mediaFinal * 10) / 10;
            System.out.println("Nota do exame: " + notaExame);
            System.out.println(mediaFinal >= 5 ? "Aluno aprovado." : "Aluno reprovado.");
            System.out.println("Media final: " + mediaFinal);
        }
    }

}