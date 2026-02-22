import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        while (true) {

            System.out.println("Bem vindo ao Encurtador de Links !");
            System.out.println("Digite a opção 1 para encurtar ");
            System.out.println("Digite a opção 2 para consultar ");
            System.out.println("Digite a opção 3 para sair");
            System.out.println("----------------------------------------");
            System.out.println("Digite a opção: ");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();


            if (opcao == 1) {

            }
            else if (opcao == 2) {

            }
            else if (opcao == 3) {

                break;

            }
            else {
                System.out.println("Opção Inválida");
            }
        }
    }
}