package construtora;

import java.util.Arrays;
import java.util.List;

public class ProjetoConstrucao {
    private String nomeProjeto;
    private String cidade;
    private double orcamento;
    private int duracaoMeses;

    // Lista de cidades válidas
    private static final List<String> CIDADES_VALIDAS = Arrays.asList(
            "Campinas", "Sumaré", "Hortolândia", "Indaiatuba", "Valinhos", "Vinhedo", "Paulínia"
    );

    public ProjetoConstrucao(String nomeProjeto, String cidade, double orcamento, int duracaoMeses) throws ProjetoInvalidoException {
        // Validações para o nome do projeto
        if (nomeProjeto == null || nomeProjeto.isEmpty()) {
            throw new ProjetoInvalidoException("O nome do projeto não pode estar vazio.");
        }
        this.nomeProjeto = nomeProjeto;

        // Validações para a cidade
        if (!CIDADES_VALIDAS.contains(cidade)) {
            throw new ProjetoInvalidoException("O projeto só pode ser realizado em Campinas ou cidades da região metropolitana de Campinas.");
        }
        this.cidade = cidade;

        // Validações para o orçamento
        if (orcamento <= 0) {
            throw new ProjetoInvalidoException("O orçamento deve ser maior que zero.");
        }
        this.orcamento = orcamento;

        // Validações para a duração do projeto
        if (duracaoMeses <= 0) {
            throw new ProjetoInvalidoException("A duração do projeto em meses deve ser maior que zero.");
        }
        this.duracaoMeses = duracaoMeses;
    }

    // Getters e Setters (opcional)
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getCidade() {
        return cidade;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }
}
