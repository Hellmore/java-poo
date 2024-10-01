package Entidades;

public class ContaBancaria {
    private double saldo;
    private int numero;
    
    public ContaBancaria(double saldo, int numero){
        this.saldo = saldo;
        this.numero = numero;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor) throws saldoInsuficienteException{
        if (valor <= this.saldo){
            this.saldo -= valor;
        } else {
            //throw new Exception ("Saldo insuficiente");
            throw new saldoInsuficienteException(valor - this.saldo);
        }
    }
}
