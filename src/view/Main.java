/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Emprestimo;
import model.Biblioteca;

/**
 *
 * @author Victor
 */
public class Main extends javax.swing.JFrame
{
    private model.Biblioteca biblioteca = new Biblioteca();
    private Emprestimo emprestimo;
    
    private static Main instance;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setSize(580,400);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitAdicionaObra = new javax.swing.JMenuItem();
        mitAdicionaUsuario = new javax.swing.JMenuItem();
        mnuEmprestimos = new javax.swing.JMenu();
        mitEmprestar = new javax.swing.JMenuItem();
        mitDevolver = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        mitObraEmprestadas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/livros.jpg"))); // NOI18N

        jMenu1.setText("Cadastros");

        mitAdicionaObra.setText("Exemplares");
        mitAdicionaObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAdicionaObraActionPerformed(evt);
            }
        });
        jMenu1.add(mitAdicionaObra);

        mitAdicionaUsuario.setText("Usuários");
        mitAdicionaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAdicionaUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mitAdicionaUsuario);

        menu.add(jMenu1);

        mnuEmprestimos.setText("Movimentações");

        mitEmprestar.setText("Realizar um Emprestimo");
        mitEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitEmprestarActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mitEmprestar);

        mitDevolver.setText("Realizar uma Devolução");
        mitDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDevolverActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mitDevolver);

        menu.add(mnuEmprestimos);

        mnuConsultas.setText("Consultas");

        jMenuItem6.setText("Consultar exemplares por nome");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuConsultas.add(jMenuItem6);

        mitObraEmprestadas.setText("Consultar exeplares em empréstimo");
        mitObraEmprestadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitObraEmprestadasActionPerformed(evt);
            }
        });
        mnuConsultas.add(mitObraEmprestadas);

        menu.add(mnuConsultas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitAdicionaObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAdicionaObraActionPerformed
        new AdicionarExemplar(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mitAdicionaObraActionPerformed

    private void mitEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitEmprestarActionPerformed
        new Emprestar(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mitEmprestarActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new ConsultaExeplarNome(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mitAdicionaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAdicionaUsuarioActionPerformed
        new AdicionarUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mitAdicionaUsuarioActionPerformed

    private void mitDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDevolverActionPerformed
        new Devolver(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mitDevolverActionPerformed

    private void mitObraEmprestadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitObraEmprestadasActionPerformed
       new ConsultaExemplaresEmprestados(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mitObraEmprestadasActionPerformed

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    
    public static Main getInstance(){
        if( instance == null){
            instance = new Main();
        }
        return instance;
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem mitAdicionaObra;
    private javax.swing.JMenuItem mitAdicionaUsuario;
    private javax.swing.JMenuItem mitDevolver;
    private javax.swing.JMenuItem mitEmprestar;
    private javax.swing.JMenuItem mitObraEmprestadas;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuEmprestimos;
    // End of variables declaration//GEN-END:variables
}