package Entidades;

public class Prova {
    int[] gabarito = new int[15];
    int[] respostasAluno = new int[15];
    int questaoAtual = 0;

    public Prova(Gabarito gabaritoProva) {
        for (int i = 0; i < this.gabarito.length; i++) {
            this.gabarito[i] = gabaritoProva.respostaQuestao(i);
        }
        
        for (int j = 0; j < respostasAluno.length; j++) {
            respostasAluno[j] = -1;
        }
    }

    public void respostaAluno(char respostaAluno) {
        if (questaoAtual < respostasAluno.length) {
            respostasAluno[questaoAtual] = respostaAluno;
            questaoAtual++;
        }
    }
    
    public int acertos(){
        int acertos = 0;
        for (int i = 0; i < gabarito.length; i++){
            if (this.gabarito[i] == this.respostasAluno[i]){
                acertos++;
            }
        }
        return acertos;
    }
    
    public double nota(){
        double soma = 0;
        for (int i = 0; i < gabarito.length; i++){
            if (this.gabarito[i] == this.respostasAluno[i]){
                if (i < 10){
                    soma += 0.5;
                } else {
                    soma += 1.0;
                }
            }
        }
        return soma;
    }
    
    public double maior(Prova outraProva) {
        int acertosEstaProva = this.acertos();
        int acertosOutraProva = outraProva.acertos();
        
        if (acertosEstaProva > acertosOutraProva) {
            return this.nota();
        } else if (acertosOutraProva > acertosEstaProva) {
            return outraProva.nota();
        } else { // Empate nos acertos
            double notaEstaProva = this.nota();
            double notaOutraProva = outraProva.nota();
            
            if (notaEstaProva >= notaOutraProva) {
                return notaEstaProva;
            } else {
                return notaOutraProva;
            }
        }
    }
}
