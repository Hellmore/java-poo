package construtora;

// Classe para representar a exceção personalizada
public class ProjetoInvalidoException extends Exception {

    public ProjetoInvalidoException(String mensagem) {
        super(mensagem);  // Define a mensagem de erro
    }
}
