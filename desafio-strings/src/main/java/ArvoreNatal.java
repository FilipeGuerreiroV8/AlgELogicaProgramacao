import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ArvoreNatal {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        Integer tamanho = input.nextInt();
        montadorArvore(tamanho);

    }



    static void montadorArvore(Integer tamanho){
        Integer tamanho2 = 1;
        Integer espaco = (tamanho - 1)/2;
        for(int i = tamanho; i > 0; i -= 2){
            for (int j = 0; j < espaco; j++) {
                System.out.print(" ");
            }
            for(int i2 = 0; i2 < tamanho2; i2++) {
                System.out.print("*");
            }
                espaco--;
            if (!tamanho2.equals(tamanho)){

                tamanho2 += 2;
            }
            System.out.println("");
        }
         espaco = (tamanho - 1)/2;


        for (int i = 0; i < espaco; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        espaco--;
        for (int i = 0; i < espaco; i++){
            System.out.print(" ");
        }
            System.out.print("***");
        System.out.println("");
    }
}