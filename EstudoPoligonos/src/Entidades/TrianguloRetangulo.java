package Entidades;

public class TrianguloRetangulo extends Triangulo implements Retangulo{
    private double catetoAdj;
    private double catetoOpo;
    
    //Construtor
    public TrianguloRetangulo (int numeroLados, double base, double altura){
        super(numeroLados, base, altura);
    }
    
    //Métodos abstratos e de interface
    @Override
    public void setCatetos (double catetoAdj, double catetoOpo){
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }
    
    @Override
    public double calculaHipotenusa(){
        return Math.hypot(catetoAdj, catetoAdj);
    }
}
