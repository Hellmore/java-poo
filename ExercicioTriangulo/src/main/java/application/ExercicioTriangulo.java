package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo;

public class ExercicioTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        
        System.out.println("Insira as medidas do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Insira as medidas do triangulo y: ");   
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();      
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Área do triangulo x: %.4f%n", areaX);
        System.out.printf("Área do triangulo y: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Maior área = X");
        } else {
            System.out.println("Maior área = Y");
        }
    }
}
