package Entidades;

public class Quadrado extends Poligono {
    private double tamanhoLado;
    
    //Construtor
    public Quadrado (int numeroLados, double tamanhoLado){
        super(numeroLados);
        this.tamanhoLado = tamanhoLado;
    }
    
    @Override
    public double calcularArea() {
        return this.tamanhoLado * this.tamanhoLado;
    } 
}
