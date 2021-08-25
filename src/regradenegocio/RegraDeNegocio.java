/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regradenegocio;

import javax.swing.JOptionPane;
import sistema.bancario.ContaPoupanca;

/**
 *
 * @author joao.costa3
 */
public class RegraDeNegocio {


    public String gerarNumeroConta() {
        String numeroDaConta = "";
        for (int i = 0; i < 5; i++) {
            int numero = (int) (Math.random() * 10);
            numeroDaConta += numero;
        }
        return numeroDaConta;
    }
    
    
    public void mostrarSaldo(){
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        JOptionPane.showMessageDialog(null, contaPoupanca.getNome() + contaPoupanca.getNumeroConta()
                                        + contaPoupanca.getSaldo());
    }
    
    
    private void fazerDeposito(){
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setDeposito(Float.parseFloat(JOptionPane.showInputDialog("informe o valor a ser depositado: R$ ")));
        float deposito;
        deposito = contaPoupanca.getDeposito();
    }

}
