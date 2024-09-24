package Entidades;
import entities.Data;

public class Voos {
    private int numeroVoo;
    private Data dataVoo;
    private int numeroCadeiras = 100;
    int[] cadeiras = new int[numeroCadeiras];
    
    public Voos(int numeroVoo, Data dataVoo){
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
    }
    
    public int getVoo(){
        return this.numeroVoo;
    }
    
    public Data getData(){
        return this.dataVoo;
    }
    
    public int proximoLivre(){
        for (int i = 0; i < numeroCadeiras; i++){
            if (cadeiras[i] == 0){
                return i+1;
            }
        }
        return -1;
    }
    
    public void verifica(int numeroCadeira){
        if (cadeiras[numeroCadeira-1] == 1){
            System.out.println("Cadeira ocupada!");
        } else if (cadeiras[numeroCadeira-1] == 0){
            System.out.println("Cadeira livre!");
        } else {
            System.out.println("Numero de cadeira invalido!");
        }
    }
    
    public String ocupa(int numeroCadeira){
        if (cadeiras[numeroCadeira-1] == 0){
            cadeiras[numeroCadeira-1] = 1;
            return "Verdadeiro";
        } else if (cadeiras[numeroCadeira-1] == 1){
            return "Falso";
        }
        return "Erro";
    }
    
    public int vagas(){
        int cadeirasVagas = 0;
        for (int i = 0; i < numeroCadeiras; i++){
            if (cadeiras[i] == 0){
                cadeirasVagas++;
            }
        }
        return cadeirasVagas;
    }
    
    public Voos clone(int numeroVoo, Data dataVoo){
        Voos v1 = new Voos(numeroVoo, dataVoo);
        return v1;
    }
}
