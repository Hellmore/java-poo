package programa;

import java.util.Scanner;
import Entidade.Produto;
import java.util.Locale;

public class Estoque {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto x, y, z;
        x = new Produto();
        y = new Produto();
        z = new Produto();
        
        char prod;
        
        System.out.println("Insira os dados do produto X");
        System.out.printf("Nome: ");
        x.nome = sc.nextLine();
        System.out.printf("Preco: ");
        x.preco = sc.nextDouble();
        System.out.printf("Quantidade: ");
        x.quantidade = sc.nextInt();
        
        x.toString();
        
//        System.out.println("Insira o nome, preco e quantidade do produto Y");
//        y.nome = sc.nextLine();
//        y.preco = sc.nextDouble();
//        y.quantidade = sc.nextInt();
//        
//        System.out.println("Insira o nome, preco e quantidade do produto Z");
//        z.nome = sc.nextLine();
//        z.preco = sc.nextDouble();
//        z.quantidade = sc.nextInt();
        
        System.out.printf(x.nome + ", " + x.preco + ", " + x.quantidade + "\n");
//        System.out.printf(y.nome + ", " + y.preco + ", " + y.quantidade + "\n");
//        System.out.printf(z.nome + ", " + z.preco + ", " + z.quantidade + "\n");
        
        sc.close();
        
    }
}
