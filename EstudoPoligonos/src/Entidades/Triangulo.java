package Entidades;

public class Triangulo extends Poligono {
    private double base;
    private double altura;
    
    //Construtor
    public Triangulo(int numeroLados, double base, double altura){
        super(numeroLados);
        this.base = base;
        this.altura = altura;
    }
    
    //Método abstrato de Poligono
    @Override
    public double calcularArea(){
        return (this.base * this.altura) / 2;
    }
}
