package Entidades;
public class EstudoPoligonos {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4, 2);
        Triangulo t1 = new Triangulo(3, 10, 20);
        
        System.out.println("Valor area q1 = " + q1.calcularArea() + "/ Valor area t1 = " + t1.calcularArea());
        
        TrianguloRetangulo tr1 = new TrianguloRetangulo(3, 10, 20);
        
        System.out.println("Valor hipotenusa tr1 = " + tr1.calculaHipotenusa());
    }
    
}
