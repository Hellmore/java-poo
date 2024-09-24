package matricula;

import entities.aluno;

public class Matricula {

    public static void main(String[] args) {
        aluno heloisa = new aluno(1, "Heloisa", 4, 3, 10);
        
        System.out.println("Nome: " + heloisa.getNome());
        System.out.println("Matricula: " + heloisa.getMatricula());
        System.out.println("Nota 1: " + heloisa.getNota1());
        System.out.println("Nota 2: " + heloisa.getNota2());
        System.out.println("Nota trabalho: " + heloisa.getNotaTrabalho());
        System.out.println("Media: " + heloisa.media());
        System.out.println("Nota final: " + heloisa.provaFinal());
    }
}
