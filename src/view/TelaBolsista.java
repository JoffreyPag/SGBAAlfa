package view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author joffr
 */
public class TelaBolsista extends javax.swing.JFrame {

    /* Creates new form TelaBolsista*/
    public TelaBolsista() {
        initComponents();
    }

    /*This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        botaoPresenca = new javax.swing.JButton();
        botaoOcorrencia = new javax.swing.JButton();
        botaoAtividades = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        ModoAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoPresenca.setText("Registrar Presenca");
        botaoPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPresencaActionPerformed(evt);
            }
        });

        botaoOcorrencia.setText("Ocorrencias");
        botaoOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOcorrenciaActionPerformed(evt);
            }
        });

        botaoAtividades.setText("Atividades");
        botaoAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtividadesActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        labelTitulo.setText("Principal");

        ModoAdmin.setText("Entrar como Gerente");
        ModoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoAtividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPresenca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(ModoAdmin)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(botaoOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(labelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(botaoAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(198, 198, 198)
                .addComponent(ModoAdmin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    //ACTION DOS BOTOES ONDE CHAMARAO OS OBJETOS DAS OUTRAS TELAS
    */
    private void botaoOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOcorrenciaActionPerformed
        //Ocorrencia oc = new TelaOcorrencia();
        new TelaListaOcorrencia().setVisible(true);
        
        //oc.setVisible(true);
    }//GEN-LAST:event_botaoOcorrenciaActionPerformed

    private void botaoPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPresencaActionPerformed
        //Presenca pr = new TelaPresenca();
        new TelaPresenca().setVisible(true);
    }//GEN-LAST:event_botaoPresencaActionPerformed

    private void botaoAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtividadesActionPerformed
       new TelaAtividade().setVisible(true);
    }//GEN-LAST:event_botaoAtividadesActionPerformed

    private void ModoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoAdminActionPerformed
       JLabel labelSenha = new JLabel("Digite a senha do Admin: ");//messagem exibida
        JPasswordField jpf = new JPasswordField(); //campo senha
        //Exibir a janela para o usuario
        JOptionPane.showConfirmDialog(null, new Object[]{labelSenha, jpf},
                                        "Senha:",JOptionPane.OK_CANCEL_OPTION,
                                        JOptionPane.PLAIN_MESSAGE);
        String senha = new String(jpf.getPassword()); //pega o que foi digitado

        if(senha.equals("admin")){
            new TelaGerente().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "senha invalida");
        }
    }//GEN-LAST:event_ModoAdminActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBolsista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBolsista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBolsista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBolsista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBolsista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModoAdmin;
    private javax.swing.JButton botaoAtividades;
    private javax.swing.JButton botaoOcorrencia;
    private javax.swing.JButton botaoPresenca;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
   
}
