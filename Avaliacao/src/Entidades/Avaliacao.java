package Entidades;

public class Avaliacao {

    public static void main(String[] args) {
        int[] gabarito1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] gabarito2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        
        Gabarito gabaritoProva1 = new Gabarito(gabarito1);
        Gabarito gabaritoProva2 = new Gabarito(gabarito2);
        
        System.out.println("Resposta da questao: " + gabaritoProva1.respostaQuestao(0));
        
        Prova prova1 = new Prova(gabaritoProva1);
        Prova prova2 = new Prova(gabaritoProva2);
        
        for (int i = 1; i < 16; i++){
            prova1.respostaAluno((char) i);
        }
        
        System.out.println("Numero de acertos: " + prova1.acertos());
        System.out.println("Nota: " + prova1.nota());
        
        System.out.println("Maior: " + prova1.maior(prova2));
    }
}
