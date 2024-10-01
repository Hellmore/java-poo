package Entidades;

public class saldoInsuficienteException extends Exception {
    private double diferenca;
    public saldoInsuficienteException(double diferenca){
        this.diferenca = diferenca;
    }
    public double getDiferenca(){
        return this.diferenca;
    }
}
