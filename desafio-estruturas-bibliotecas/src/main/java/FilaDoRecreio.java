import java.io.IOException;
import java.util.*;

public class FilaDoRecreio {

    public static void main(String[] args) throws IOException {
        Scanner ipt = new Scanner(System.in);
        int qtdAlunos = ipt.nextInt();
        List<Integer> listaAlunos = new ArrayList<>();
        List<Integer> listaOriginal = new ArrayList<>();

        for (int i = 1; i <= qtdAlunos; i++) {
            Integer notaAtual = ipt.nextInt();
            listaAlunos.add(notaAtual);
            listaOriginal.add(notaAtual);
        }

        Collections.sort(listaAlunos);
        Integer contador = 0;

        for (int i = 0; i < listaAlunos.size(); i++){
            if(listaAlunos.get(i) != (listaOriginal.get(i))){
                contador++;
            }
        }

        System.out.println(contador);
    }
}
