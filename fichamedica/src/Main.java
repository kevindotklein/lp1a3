import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //loop principal do menu de escolhas

        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarFicha(scanner);
                    break;
                case 2:
                    atualizarFicha(scanner);
                    break;
                case 3:
                    exibirFicha(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    //método responsável por exibir o menu
    private static void exibirMenu() {
        System.out.println("===== Gerenciador de Fichas Médicas =====");
        System.out.println("1. Criar ficha médica");
        System.out.println("2. Atualizar ficha médica");
        System.out.println("3. Exibir ficha médica");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    //este método cria recolhe os inputs do usuário e cria um arquivo txt com o nome informado, e nele escreve os dados no formato
    // da variavel "conteudoFicha"
    private static void criarFicha(Scanner scanner) {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do paciente: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o gênero do paciente: ");
        String genero = scanner.nextLine();

        System.out.print("Digite a altura do paciente: ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o peso do paciente: ");
        double peso = Double.parseDouble(scanner.nextLine());

        String conteudoFicha = "Nome: " + nome + "\n"
                + "Idade: " + idade + " anos\n"
                + "Gênero: " + genero + "\n"
                + "Altura: " + altura + " metros\n"
                + "Peso: " + peso + " kg";

        try {
            FileWriter writer = new FileWriter(nome + ".txt");
            writer.write(conteudoFicha);
            writer.close();
            System.out.println("Ficha médica criada com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar a ficha médica.");
        }
    }


    //o método de atualizacao filtra atraves do nome informado, no caso de alterações dos dados do paciente
    //é usado um regex para substituir apenas os valores
    private static void atualizarFicha(Scanner scanner) {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        File ficha = new File(nome + ".txt");

        if (!ficha.exists()) {
            System.out.println("Ficha médica não encontrada.");
            return;
        }

        try {
            String conteudoFicha = new String(Files.readAllBytes(Paths.get(nome + ".txt")));

            System.out.println("Ficha médica encontrada. Os dados atuais são:");
            System.out.println(conteudoFicha);

            System.out.print("Digite o novo valor para a idade (ou deixe em branco para não alterar): ");
            String novaIdade = scanner.nextLine();

            System.out.print("Digite o novo valor para o gênero (ou deixe em branco para não alterar): ");
            String novoGenero = scanner.nextLine();

            System.out.print("Digite o novo valor para a altura (ou deixe em branco para não alterar): ");
            String novaAltura = scanner.nextLine();

            System.out.print("Digite o novo valor para o peso (ou deixe em branco para não alterar): ");
            String novoPeso = scanner.nextLine();

            if (!novaIdade.isEmpty()) {
                conteudoFicha = conteudoFicha.replaceFirst("(?<=Idade: ).*", novaIdade);
            }
            if (!novoGenero.isEmpty()) {
                conteudoFicha = conteudoFicha.replaceFirst("(?<=Gênero: ).*", novoGenero);
            }
            if (!novaAltura.isEmpty()) {
                conteudoFicha = conteudoFicha.replaceFirst("(?<=Altura: ).*", novaAltura);
            }
            if (!novoPeso.isEmpty()) {
                conteudoFicha = conteudoFicha.replaceFirst("(?<=Peso: ).*", novoPeso);
            }

            FileWriter writer = new FileWriter(nome + ".txt");
            writer.write(conteudoFicha);
            writer.close();
            System.out.println("Ficha médica atualizada com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao atualizar a ficha médica.");
        }
    }

    //a filtragem é feita através do nome (no caso mesmo nome do arquivo da ficha médica)
    //e é printado a variavel "conteudoFicha"
    private static void exibirFicha(Scanner scanner) {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        File ficha = new File(nome + ".txt");

        if (!ficha.exists()) {
            System.out.println("Ficha médica não encontrada.");
            return;
        }

        try {
            String conteudoFicha = new String(Files.readAllBytes(Paths.get(nome + ".txt")));
            System.out.println("Dados da ficha médica de " + nome + ":\n" + conteudoFicha);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler a ficha médica.");
        }
    }
}