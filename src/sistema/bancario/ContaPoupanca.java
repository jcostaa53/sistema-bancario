/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.bancario;

/**
 *
 * @author joao.costa3
 */
public class ContaPoupanca {

    String nome;
    String numeroConta;
    float saldo;
    float deposito;
    float saque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
