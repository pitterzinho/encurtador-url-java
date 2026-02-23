import java.awt.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> links = new HashMap<>(); // Nosso "banco de dados" em memória
        int contador = 1; //contador para o loop de links. Vão ser gerado vários códigos


        while (true) {

            System.out.println("""
                               === Encurtador de Links ===
                               1 - Encurtar link
                               2 - Consultar link
                               3 - Sair
                               ---------------------------
                               Digite a opção:
                               """);

            int opcao = scanner.nextInt();
            scanner.nextLine(); /*limpa o ENTER - O Java lê apenas o número, mas não consome o ENTER que você apertou =
                                   Ok Java, agora ignore o ENTER que ficou aí.*/

            if (opcao == 1) {

                System.out.println("Digite a URL");
                String entradaUrl = scanner.nextLine();

                String codigo = "L" + contador;

                links.put(codigo,entradaUrl);

                System.out.println("O código é: " + codigo);

                contador++;
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