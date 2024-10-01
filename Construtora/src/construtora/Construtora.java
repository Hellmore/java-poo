package construtora;

import java.util.Scanner;

public class Construtora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita os dados ao usuário
            System.out.println("Digite o nome do projeto:");
            String nomeProjeto = scanner.nextLine();

            System.out.println("Digite a cidade onde será realizado o projeto:");
            String cidade = scanner.nextLine();

            System.out.println("Digite o orçamento do projeto:");
            double orcamento = scanner.nextDouble();

            System.out.println("Digite a duração do projeto em meses:");
            int duracaoMeses = scanner.nextInt();

            // Cria um novo projeto
            ProjetoConstrucao projeto = new ProjetoConstrucao(nomeProjeto, cidade, orcamento, duracaoMeses);
            System.out.println("Projeto cadastrado com sucesso!");

        } catch (ProjetoInvalidoException e) {
            // Captura e exibe a mensagem de erro
            System.out.println("Erro ao cadastrar o projeto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

