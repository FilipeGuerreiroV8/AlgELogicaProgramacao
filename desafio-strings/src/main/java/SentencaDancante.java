import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SentencaDancante {

    public static void main(String[] args) throws IOException {
        Scanner ipt = new Scanner(System.in);
        String sentenca = ipt.nextLine();
        char[] sentencaChar = sentenca.toCharArray();
        StringBuilder construtor = new StringBuilder();
        for(int i = 0; i < sentencaChar.length; i++){
            char novoChar = sentencaChar[i];
            if (i % 2 == 0){
                novoChar = toUpperCase(sentencaChar[i]);
            }
                construtor.append(novoChar);
        }
        String resultado = construtor.toString();
        System.out.println(resultado);
    }

}