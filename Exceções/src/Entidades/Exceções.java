package Entidades;

import javax.swing.JOptionPane;

public class Exceções {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1000, 1234);
        System.out.println("Saldo: " + c1.getSaldo());
        c1.depositar(500);
        System.out.println("Saldo: " + c1.getSaldo());
        try {
            c1.sacar(1200);
            System.out.println("Saldo: " + c1.getSaldo()); 
            c1.sacar(700);
            System.out.println("Saldo: " + c1.getSaldo());
        } catch (saldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, "Desculpe, mas você precisa de " + e.getDiferenca() + " reais!", "Problema", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
    
