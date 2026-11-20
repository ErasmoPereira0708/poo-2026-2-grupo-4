
package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            exibirMenu();

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:
                        System.out.println("Cadastrar atividade");

                        break;

                    case 2:
                        System.out.println("Cadastrar aluno");

                        break;

                    case 3:
                        System.out.println("Matricular aluno");

                        break;

                    case 4:
                        System.out.println("Inscrever em turma");

                        break;

                    case 5:
                        System.out.println("Cancelar inscrição");

                        break;

                    case 6:
                        System.out.println("Trancar matricula");

                        break;

                    case 7:
                        System.out.println("Relatorios");

                        break;

                    case 0:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opcao invalida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite um numero valido!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {

        System.out.println("\nMENU ACADEMIA");
        System.out.println("1 - Cadastrar atividade");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Matricular aluno");
        System.out.println("4 - Inscrever em turma");
        System.out.println("5 - Cancelar inscrição");
        System.out.println("6 - Trancar matricula");
        System.out.println("7 - Relatorios");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }
}
