/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.JOptionPane;
import sistema.bancario.ContaPoupanca;
import regradenegocio.RegraDeNegocio;

/**
 *
 * @author joao.costa3
 */
public class CadastroConta extends javax.swing.JFrame {
    ContaPoupanca ContaPoupanca;
    RegraDeNegocio gerarNumero = new RegraDeNegocio();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
        
    private boolean validarFormulario(){
        String nome = varNome.getText().trim();
        if (validarQtd3Digitos(nome)){
            JOptionPane.showMessageDialog(null, "digite um nome correto!");
            return true;
        }
        
        
        
        return false;
    }
    
    private boolean validarQtd3Digitos(String valor){
        return valor.length() < 3;
    }
    
    private boolean fazerDeposito(){
        float deposito = Float.parseFloat(JOptionPane.showInputDialog("informe o valor a ser depositado: R$ "));
        deposito += varSaldo;
        return false;
    }
    
    private boolean fazerSaque(){
        float saque = Float.parseFloat(JOptionPane.showInputDialog("informe o valor a ser sacado: R$ "));
        varSaldo -= saque;
        return varSaldo > 0;
    }
    
    
    
    public CadastroConta() {
        this.gerarNumero = new RegraDeNegocio();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        lbNumeroConta = new javax.swing.JLabel();
        varNumeroConta = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro Conta");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNome.setText("Nome:");

        varNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNomeActionPerformed(evt);
            }
        });

        lbNumeroConta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNumeroConta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNumeroConta.setText("Numero da Conta:");

        try {
            varNumeroConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumeroConta))
                .addGap(18, 18, 18)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(varNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(varNumeroConta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroConta)
                    .addComponent(varNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNomeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        ContaPoupanca = new ContaPoupanca();
        boolean erro = validarFormulario();
        if (!erro) {
            //TODO chamar metodo que salva no bd
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumeroConta;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel principal;
    private javax.swing.JTextField varNome;
    private javax.swing.JFormattedTextField varNumeroConta;
    // End of variables declaration//GEN-END:variables
}