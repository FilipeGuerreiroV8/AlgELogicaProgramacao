import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) throws IOException {
        StringBuilder construtor = new StringBuilder();
        Scanner ipt = new Scanner(System.in);
        Integer qtdRodadas = ipt.nextInt();
        for (int i = 0; i < qtdRodadas; i++){
            Integer A = ipt.nextInt();
            Integer B = ipt.nextInt();

            String stringA = A.toString();
            char[] arrayA = stringA.toCharArray();

            String stringB = B.toString();
            char[] arrayB = stringB.toCharArray();

                if (arrayB.length > arrayA.length){
                    System.out.println("nao encaixa");
                }else{
                        for (int j = arrayA.length - 1; j >= 0; j--){
                            char letraAtualA = arrayA[j];
                            if(j >= (arrayA.length - arrayB.length)){
                            construtor.append(letraAtualA);
                            }
                         }
                        construtor.reverse();
                         String resultadoStringA = construtor.toString();

                            if (resultadoStringA.equals(stringB)){
                                System.out.println("encaixa");
                            }else{
                                System.out.println("nao encaixa");
                            }
            }
        }
    }

}