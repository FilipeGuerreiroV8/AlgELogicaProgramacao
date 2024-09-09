import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ZeroValeZero {

    public static void main(String[] args) throws IOException {
        inicializador();
    }

    static void inicializador(){
        Scanner input2 = new Scanner(System.in);
        Integer valor1 = input2.nextInt();
        Integer valor2 = input2.nextInt();

        if(valor1 != 0 || valor2 != 0){
        Integer resultado = verificaZero(valor1, valor2);
        System.out.println(resultado);


        inicializador();
        }

    }

    static Integer verificaZero(Integer valor1, Integer valor2){

        Integer soma = valor1 + valor2;
        String somaTexto = soma.toString();
        Integer resultado;
            if(somaTexto.indexOf("0") != -1){
                String resultadoTexto = somaTexto.replace("0", "");
                resultado = Integer.parseInt(resultadoTexto);
            }else{
                resultado = Integer.parseInt(somaTexto);
            }
        return resultado;
    }

}