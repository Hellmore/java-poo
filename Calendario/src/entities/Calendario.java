package entities;

public class Calendario {

    public static void main(String[] args) {
        Data aniversario = new Data(20,8,1998);
        
        System.out.println("Dia: " + aniversario.getDia());
        System.out.println("Mes: " + aniversario.getMes());
        System.out.println("Ano: " + aniversario.getAno());
        System.out.println("Mes extenso: " + aniversario.getMesExtenso());
        System.out.println("Eh bissexto: " + aniversario.isBissexto());

        Data niver = new Data(19,8,1998);
        
        System.out.println("Comparacao: " + aniversario.compara(niver));
        System.out.println(aniversario.clone()); 
    }
}
