package entities;

public class aluno {
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;
    
    public aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }
    
    public double media(){
        double pesoProvas = 2.5;
        double pesoTrabalho = 2.0;
        double somaPesos = (pesoProvas * 2) + pesoTrabalho;
        
        double media = ((this.notaProva1 * pesoProvas) + (this.notaProva2 * pesoProvas) + (this.notaTrabalho * pesoTrabalho))/somaPesos;
        return media;
    }
    
    public double provaFinal(){
        double media = media();
        double aprovacao = 6.0;
        
        if (media >= aprovacao){
            return 0.0;
        } else {
            return (aprovacao * 2) - media;
        }
    }
    
    public double getNota1(){
        return this.notaProva1;
    }
    
    public double getNota2(){
        return this.notaProva2;
    }
    
    public double getNotaTrabalho(){
        return this.notaTrabalho;
    }

    public String getNome(){
        return this.nome;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
}
