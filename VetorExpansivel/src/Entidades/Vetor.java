package Entidades;

public class Vetor {
    String[] vetorVariavel;
    int proximaPosicao = 0;
    
    public Vetor(int tamanhoVetor){
        this.vetorVariavel = new String[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++){
            vetorVariavel[i] = "-";
        }
    }
    
    public void insert(String palavra){
        if (proximaPosicao >= vetorVariavel.length){
            this.expandirVetor();
        }
        vetorVariavel[proximaPosicao] = palavra;
        proximaPosicao++;
    }
    
    public void expandirVetor(){
        int novoTamanho = vetorVariavel.length * 2;
        String[] novoVetor = new String[novoTamanho];
        
        for (int i = 0; i < vetorVariavel.length; i++){
            novoVetor[i] = vetorVariavel[i];
        }
        
        for (int i = proximaPosicao; i < novoTamanho; i++){
            novoVetor[i] = "-";
        }
        
        vetorVariavel = novoVetor;
    }
    
    public String get(int posicao){
        if (vetorVariavel[posicao] == "-" || posicao > vetorVariavel.length || posicao < 0){
            return null;
        }
        return vetorVariavel[posicao];
    }
    
    public int size(){
        int preenchidos = 0;
        for (int i = 0; i < vetorVariavel.length; i++){
            if (vetorVariavel[i] != "-"){
                preenchidos++;
            }
        }
        return preenchidos;
    }
}
