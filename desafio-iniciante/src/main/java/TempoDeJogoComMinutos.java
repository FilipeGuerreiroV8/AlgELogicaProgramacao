import java.io.IOException;
import java.util.Scanner;
//código: 1047	Desafio: Tempo de Jogo Com Minutos
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class TempoDeJogoComMinutos {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner input = new Scanner(System.in);

        Integer horaEntrada = input.nextInt();
        Integer minutoEntrada = input.nextInt();


        Integer horaSaida = input.nextInt();
        Integer minutoSaida = input.nextInt();

        Integer horaParametro = 0;
        Integer minutoParametro = 0;

    while ((!horaEntrada.equals(horaSaida) || !minutoEntrada.equals(minutoSaida)) || (horaEntrada.equals(horaSaida) && minutoEntrada.equals(minutoSaida) && (minutoParametro.equals(0) && horaParametro.equals(0)))){ //se a horaEntrada ou o minutoEntrada forem diferentes das saídas ou a horaEntrada e minutoEntrada forem iguais mas os parametros forem 0
        minutoParametro++;
        minutoEntrada++;
        if(minutoEntrada.equals(60)){ // zera o minutoEntrada quando chegar em 60 e soma 1 na horaEntrada
            minutoEntrada = 0;
            horaEntrada ++;
        }

        if (minutoParametro.equals(60)){ //zera o minutoParametro quando chegar em 60 e soma 1 na horaParametro
            minutoParametro = 0;
            horaParametro++;
        }

        if(horaEntrada.equals(24)){ // zera a horaEntrada quando chegar em 24
            horaEntrada = 0;
        }
    }

        System.out.println("""
                O JOGO DUROU %d HORA(S) E %d MINUTO(S)
                """.formatted(horaParametro, minutoParametro));

    }

}