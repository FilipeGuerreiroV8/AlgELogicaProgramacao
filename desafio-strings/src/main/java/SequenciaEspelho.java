import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SequenciaEspelho {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        Integer qtdRodadas = input.nextInt();

        for(int i = 0; i < qtdRodadas; i++){

        Integer valor1 = input.nextInt();
        Integer valor2 = input.nextInt();
            System.out.println(espelho(valor1, valor2));
        }

    }

    static Long espelho(Integer valor1, Integer valor2){

        String textoInicial = "";
        StringBuilder construtor = new StringBuilder(textoInicial);
        for(int i = valor1; i <= valor2; i++){
            construtor.append(i);
        }
        for(int i = valor2; i >= valor1; i--){
            construtor.append(i);
        }




        String textoFinal = construtor.toString();
        Long resultado = Long.parseLong(textoFinal);
        return resultado;
    }

}