package Entidades;

public abstract class Poligono {
    private int numeroLados;
    
    //construtor
    public Poligono(int numeroLados)
    {
        this.numeroLados = numeroLados;
    }
    public abstract double calcularArea();
}
