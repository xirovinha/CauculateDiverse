import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class CauculateDiverse {
    public static void main(String[] args){

        Operacoes operacoes = new Operacoes();

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro valor abaixo");
        x = Integer.parseInt(scanner.nextLine());

        System.out.println("digite o segundo valor abaixo");
         y = Integer.parseInt(scanner.nextLine());

        System.out.println("digite a operação desejada");
        String opcaoselecionada = scanner.nextLine();

        if(opcaoselecionada.equals("somar")){
            operacoes.sum(x, y);
        }
        if(opcaoselecionada.equals("subtrair")){
            operacoes.sub(x, y);
        }
        if (opcaoselecionada.equals("multiplicar")){
            operacoes.mult(x, y);
        }
        if (opcaoselecionada.equals("dividir")){
            operacoes.divi(x, y);
        }

    }

}
