package Entidades;
import entities.Data;

public class CompanhiaAerea {

    public static void main(String[] args) {
        Data dataVoo = new Data(20,8,1998);
        Voos voo1 = new Voos(123, dataVoo);
        
        System.out.println("Numero do voo: " + voo1.getVoo());
        System.out.println("Data do voo: " + voo1.getData());
        
        System.out.println("Ocupar cadeira 1 -> " + voo1.ocupa(1));
        voo1.verifica(1);
        
        System.out.println("Proxima cadeira livre: " + voo1.proximoLivre());
        System.out.println("Numero de cadeiras vagas: " + voo1.vagas());
        
        System.out.println("Referencia clone: " + voo1.clone(voo1.getVoo(), voo1.getData()));
        
        
    }
    
}
