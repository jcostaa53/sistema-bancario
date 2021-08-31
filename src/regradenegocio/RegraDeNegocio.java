/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regradenegocio;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.VarNode;
import sistema.bancario.ContaPoupanca;
import tela.CadastroConta;
import tela.Deposito;

/**
 *
 * @author joao.costa3
 */
public class RegraDeNegocio {
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    CadastroConta cadastroConta = new CadastroConta();
    Deposito deposito = new Deposito();
    
    public void salvarCadastro(ContaPoupanca conta){
        conta.setSenha(gerarSenha());
        conta.setNumeroConta(gerarNumeroConta());
    }
    
    private String gerarSenha(){
        String[] letras = {"0","1","2","3","4","5","6","7","8","9","a","b","c",
            "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K",
            "L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int tamanho = letras.length;
        String senha = "";
        for (int i = 0; i < 4; i++) {
            int indice = (int) (Math.random() * tamanho);
            senha += letras[indice];
        }
        return senha;
    }
    
    public String gerarNumeroConta() {
        String numeroDaConta = "";
        for (int i = 0; i < 5; i++) {
            int numero = (int) (Math.random() * 10);
            numeroDaConta += numero;
        }
        return numeroDaConta;
    }
    
    
    public void mostrarSaldo(){
        JOptionPane.showMessageDialog(null, contaPoupanca.getNome() + contaPoupanca.getNumeroConta()
                                        + contaPoupanca.getSaldo());
    }
    
    
    

}
