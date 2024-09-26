package Entidades;

public class VetorExpansivel {

    public static void main(String[] args) {
        Vetor v1 = new Vetor(2);
        
        v1.insert("oi");
        v1.insert("ola");
        v1.insert("Oiee");
        
        System.out.println("Valor da posição: " + v1. get(2));
        
        System.out.println("Tamanho do vetor: " + v1.size());
        
        
    }
    
}
