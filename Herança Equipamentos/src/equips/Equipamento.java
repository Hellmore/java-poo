package equips;

public abstract class Equipamento {
    
    private int[] valores; // Cria uma variável do tipo vetor de inteiros chamado de valores
    
    //Construtor recebe um int numeroEquipamentos e aloca um vetor, na variável de vetor de inteiros valor, do tamanho de numeroEquipamentos
    public Equipamento(int numeroEquipamentos) {
        valores = new int[numeroEquipamentos];
    }
    
    //Retorna o número de equipamentos através do tamanho do vetor
    public int getNumeroEquipamentos(){
        return valores.length;
    }
    
    //Recebe como parâmetro o número do equipamento (começando de zero) e retorna seu valor se o numero estiver no intervalo e -1 se não estiver
    public int getValor(int numero){
        if (numero >= 0 && numero < valores.length){
            return valores[numero];
        } else {
            System.out.println("Numero do equipamento inválido!");
            return -1;
        }
    }
    
    //Recebe como parâmetro o número do equipamento e seu valor e o registra
    public void setValor(int numero, int valor){
        if (numero >= 0 && numero < valores.length) {
            valores[numero] = valor;
        } else {
            System.out.println("Numero do equipamento inválido!");
        }
    }
}