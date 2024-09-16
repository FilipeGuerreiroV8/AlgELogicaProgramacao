import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriandoUmaFila {

    public static void main(String[] args) {
        inicializador();
    }


 static void inicializador(){
     Scanner ipt = new Scanner(System.in);
     System.out.println("Insira pelo menos 10 numeros:");
     List<Integer> listaNumeros = new ArrayList<>();
     while (listaNumeros.size() < 10) {
         System.out.println("""
                     1 - Adicionar novo número.
                     2 - Remover o primeiro número.""");
         Integer escolha = ipt.nextInt();
             switch (escolha){
                 case 1 ->{
                     Integer novoNumero = ipt.nextInt();
                     listaNumeros.add(novoNumero);
                     System.out.println("Número adicionado!");
                     System.out.println("Lista: ");
                     for(Integer i : listaNumeros){
                         System.out.print(i + ", ");
                     }
                     System.out.println("");
                 }
                 case 2 -> {
                     listaNumeros.remove(0);
                     System.out.println("Lista: ");
                     for(Integer i : listaNumeros){
                         System.out.print(i + ", ");
                     }
                     System.out.println("");
                 }
             }
        }
        escolhaFinal(ipt, listaNumeros);
 }

 static void escolhaFinal(Scanner ipt, List listaNumeros){

     System.out.println("""
             1 - Continuar adicionando números
             2 - Remover o primeiro número.
             3 - Sair.
             """);
     Integer escolha = ipt.nextInt();
     switch (escolha){
         case 1 ->{
             System.out.println("Adicione um número!");
             Integer novoNumero = ipt.nextInt();
             listaNumeros.add(novoNumero);
             System.out.println("Número adicionado!");
             System.out.println("Lista: ");
             for(int i = 0; i < listaNumeros.size(); i++){
                 System.out.print(listaNumeros.get(i) + ", ");
             }
             System.out.println("");
             escolhaFinal(ipt, listaNumeros);
         }
         case 2 -> {
             listaNumeros.remove(0);
             System.out.println("Lista: ");
             for(int i = 0; i < listaNumeros.size(); i++){
                 System.out.print(listaNumeros.get(i) + ", ");
             }
             System.out.println("");
             escolhaFinal(ipt, listaNumeros);

         }
         case 3 -> System.out.println("Saindo");

     }
 }
 }