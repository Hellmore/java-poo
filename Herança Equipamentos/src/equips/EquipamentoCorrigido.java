package equips;
import equips.Equipamento;

public class EquipamentoCorrigido extends Equipamento {
    
    private int[] mesCompra; //Cria uma variável do tipo vetor de inteiros chamado de mesCompra para armazenar em que mês cada equipamento foi comprado
    private int mesCorrente; //Armazena o numero do mês atual
    
    // Construtor recebe como parâmetro o número de equipamentos
    public EquipamentoCorrigido(int numeroEquipamentos) {
        super(numeroEquipamentos); //Chama o construtor da classe Equipamento
        this.mesCompra = new int[numeroEquipamentos]; //Aloca um vetor, na variável de vetor de inteiros mesCompra, do tamanho de numeroEquipamentos
        this.mesCorrente = 1;
    }
    
    //Recebe como parâmetro o número do equipamento (começando de zero) e retorna seu mês de compra
    public int getMesCompra (int numero){
        if (numero >= 0 && numero < this.mesCompra.length){
            return this.mesCompra[numero];
        } else {
            System.out.println("Numero de equipamento inválido!");
            return -1;
        }
    }
    
    //Recebe como parâmetro o número do equipamento e seu mês de compra e o registra
    public void setMesCompra (int numero, int mes){
        if (numero >= 0 && numero < this.mesCompra.length){
            this.mesCompra[numero] = mes;
        } else {
            System.out.println("Número de esquipamento inválido!");
        }
    }
    
    //Este método recebe como parâmetro apenas o percentual de correção e corrige todos os equipamentos cujo mês de compra seja igual ao mês corrente; 
    //O objeto deve manter registrado em um atributo o mês corrente, que deve começar sempre em janeiro (quando o objeto é construído). 
    //Cada vez que este método é chamado, após a correção, o mês é incrementado de um e, se estiver em dezembro, retorna para janeiro.
    public void corrige(int percentual){
        for (int i = 0; i < super.getNumeroEquipamentos(); i++){
            if (mesCompra[i] == mesCorrente){
               int valorAtual = super.getValor(i); //Atribui o valor do equipamento a variavel valorAtual
               if (valorAtual != -1) {
                   int valorCorrigido = valorAtual + (valorAtual * percentual / 100);
                   setValor(i, valorCorrigido); // Atualiza o valor corrigido
               }
            }
        }
        
        // Atualiza o mês corrente
        mesCorrente++;
        if (mesCorrente > 12) {
            mesCorrente = 1; // Volta para janeiro
        }
    }
    
    //Recebe como parâmetro um outro objeto da classe EquipamentoCorrigido e substitui o valor e o mês de compra de todos os equipamentos 
    //do objeto corrente pelos do objeto recebido como parâmetro; a operação só será realizada se ambos os objetos possuírem
    //o mesmo número de equipamentos
    public void substitui(EquipamentoCorrigido OutroEquipamento){
        if (OutroEquipamento.getNumeroEquipamentos() == this.getNumeroEquipamentos()){
            for (int i = 0; i < this.getNumeroEquipamentos(); i++){
                this.setValor(i, OutroEquipamento.getValor(i)); //Atribui o valor de OutroEquipamento ao objeto atual
                this.setMesCompra(i, OutroEquipamento.getMesCompra(i)); //Atribui o mes de compra de OutroEquipamento ao objeto atual
            }
        }
    }
    
}


