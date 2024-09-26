package Entidades;

public class Gabarito {
    
    int[] gabarito = new int[15];
    
    public Gabarito(int[] respostasCorretas){
        for (int i = 0; i < respostasCorretas.length; i++){
            this.gabarito[i] = respostasCorretas[i];
        }
    }
    
    public int respostaQuestao(int numeroQuestao){
        return this.gabarito[numeroQuestao];
    }
   
    
    
}
