package app;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public void executar() {
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();

            if (!scanner.hasNextInt()) {
                if (!scanner.hasNextLine()) break;
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();
            String resto = scanner.nextLine();

            if (!resto.isBlank()) {
                System.out.println("Digite apenas o número da opção.");
                opcao = -1;
                continue;
            }

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
                    System.out.println("Trancar matrícula");
                    break;
                case 7:
                    System.out.println("Relatórios");
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\nMENU ACADEMIA");
        System.out.println("1 - Cadastrar atividade");
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Matricular aluno");
        System.out.println("4 - Inscrever em turma");
        System.out.println("5 - Cancelar inscrição");
        System.out.println("6 - Trancar matrícula");
        System.out.println("7 - Relatórios");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }
}
