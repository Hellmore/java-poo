package Entidades;

public class VetorOrdenado{
    String[] vetorVariavel;
    int proximaPosicao = 0;
    
    public VetorOrdenado(int tamanhoVetor){
        this.vetorVariavel = new String[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++){
            vetorVariavel[i] = "-";
        }
    }
    
}
