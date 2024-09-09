import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//código: 1253	Desafio: Cifra de César

//Enunciado: Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições.
//
//Entrada
//A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.
//
//Saída
//Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.
/*
*
*
Exemplo de Entrada
6
VQREQFGT
2
ABCDEFGHIJKLMNOPQRSTUVWXYZ
10
TOPCODER
0
ZWBGLZ
25
DBNPCBQ
1
LIPPSASVPH
4
Exemplo de Saída
TOPCODER
QRSTUVWXYZABCDEFGHIJKLMNOP
TOPCODER
AXCHMA
CAMOBAP
HELLOWORLD
* */

public class CifraDeCesar {

    public static void main(String[] args) throws IOException {
        inicializador();
    }


        static void inicializador(){
        System.out.println("Digite a quantidade de rodadas OU 0 para sair.");
        Scanner input = new Scanner(System.in);
        Scanner inputTexto = new Scanner(System.in);

        int qtdRodadas = input.nextInt();

                if (qtdRodadas == 0){

                    System.out.println("0 recebido, fechando o sistema....");

                }else {
                        for (int i = 0; i < qtdRodadas; i++){
                            System.out.println("Digite o texto a ser descriptografado....");
                            String texto = inputTexto.nextLine();
                            String textoFormatado = texto.toLowerCase();

                            System.out.println("Digite qual o intervalo entre as letras");
                            int intervaloLetras = input.nextInt();


                            String resultado = decodificador(textoFormatado, intervaloLetras);
                            String resultadoFormatado = resultado.toUpperCase();
                            System.out.println("Texto descriptografado: " + resultadoFormatado);
                        }
                        inicializador();
                    }
        }


        static String decodificador(String texto, int novoIndice){
            StringBuilder constroiTexto = new StringBuilder();
            List<Character> alfabeto = new ArrayList<>();

            for(char letra = 'a'; letra <= 'z'; letra++){ // Construindo o alfabeto em uma lista
                alfabeto.add(letra);
            }

                for (int indiceletra = 0; indiceletra < texto.length(); indiceletra++){
                        char letraAtual = texto.charAt(indiceletra);
                        int indiceAlfabeto = alfabeto.indexOf(letraAtual);

                        int resultadoBusca = indiceAlfabeto - novoIndice;
                        if(resultadoBusca < 0){
                            resultadoBusca += 26;
                         }
                    constroiTexto.append(alfabeto.get(resultadoBusca));
                }

            String resultadodecodificacao = constroiTexto.toString();
            return resultadodecodificacao;
        }
}