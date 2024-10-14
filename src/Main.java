import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BuscadorCep busca = new BuscadorCep();

        System.out.println("Informe o cep: ");
        String cep = scan.nextLine();

        try{
            Endereco novoEndereco = busca.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gera = new GeradorArquivo();
            gera.salvaJson(novoEndereco);
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando...");
        }


    }
}