/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author joffr
 */
public class TelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
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

        botaoCad = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botaoListaAtv = new javax.swing.JButton();
        botaoCriarAtv = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botaoCad.setText("Cadastrar Funcionario");
        botaoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadActionPerformed(evt);
            }
        });

        labelTitulo.setText("Administrador");

        botaoListaAtv.setText("Listar Atividades");
        botaoListaAtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListaAtvActionPerformed(evt);
            }
        });

        botaoCriarAtv.setText("Criar Atividade");
        botaoCriarAtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarAtvActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair modo admin");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(labelTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoListaAtv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoCriarAtv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(35, 35, 35)
                .addComponent(botaoCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoListaAtv)
                .addGap(18, 18, 18)
                .addComponent(botaoCriarAtv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(botaoSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadActionPerformed
        TelaCadastrarFunc tcrud = new TelaCadastrarFunc();
        tcrud.setResizable(false);
        tcrud.setVisible(true);
    }//GEN-LAST:event_botaoCadActionPerformed

    private void botaoListaAtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaAtvActionPerformed
        TelaAtividade ta = new TelaAtividade();
        ta.setResizable(false);
        ta.setVisible(true);
    }//GEN-LAST:event_botaoListaAtvActionPerformed

    private void botaoCriarAtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarAtvActionPerformed
        TelaCriarAtividade tca = new TelaCriarAtividade();
        tca.setResizable(false);
        tca.setVisible(true);
    }//GEN-LAST:event_botaoCriarAtvActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCad;
    private javax.swing.JButton botaoCriarAtv;
    private javax.swing.JButton botaoListaAtv;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}