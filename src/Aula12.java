import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numeroCadastros = 10;

        String[] nomes = new String[numeroCadastros];
        int[] idades = new int[numeroCadastros];
        for (int i = 0; i < numeroCadastros; i++) {
            System.out.println("Cadastro #" + (i + 1));
            System.out.print("Digite o nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade: ");
            idades[i] = Integer.parseInt(scanner.nextLine());

            System.out.println();
        }
        System.out.println("==== Cadastros Realizados ====");
        for (int i = 0; i < numeroCadastros; i++) {
            System.out.println("Cadastro #" + (i + 1));
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println();
        }

        scanner.close();
    }
}
