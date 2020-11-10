/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Carlos
 */
public class EditorView extends javax.swing.JFrame {

    /**
     * Creates new form EditorView
     */
    public EditorView() {
        initComponents();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(size.width / 2 - this.getWidth() / 2, size.height / 2 - this.getHeight() / 2);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuadar = new javax.swing.JButton();
        btnUnDo = new javax.swing.JButton();
        btnReDo = new javax.swing.JButton();
        btnNegrita = new javax.swing.JButton();
        btnItalica = new javax.swing.JButton();
        btnSubrayado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbSelectSize = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnOpen = new javax.swing.JMenuItem();
        mnSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPane1.setPreferredSize(new java.awt.Dimension(400, 300));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(575, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jToolBar1.setRollover(true);

        btnGuadar.setText("  Guardar  ");
        btnGuadar.setFocusable(false);
        btnGuadar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuadar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuadarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuadar);

        btnUnDo.setText("     <=     ");
        btnUnDo.setFocusable(false);
        btnUnDo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUnDo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnUnDo);

        btnReDo.setText("     =>     ");
        btnReDo.setFocusable(false);
        btnReDo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReDo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnReDo);

        btnNegrita.setText("   N   ");
        btnNegrita.setFocusable(false);
        btnNegrita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNegrita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNegrita);

        btnItalica.setText("   K   ");
        btnItalica.setFocusable(false);
        btnItalica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnItalica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnItalica);

        btnSubrayado.setText("   S   ");
        btnSubrayado.setFocusable(false);
        btnSubrayado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubrayado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSubrayado);

        jLabel1.setText("  Tamano:");
        jToolBar1.add(jLabel1);

        jcbSelectSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "18", "20", "24", "28", "30", "32", "34", "38", "40", "42", "44" }));
        jcbSelectSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectSizeActionPerformed(evt);
            }
        });
        jToolBar1.add(jcbSelectSize);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("File");

        mnNew.setText("Nuevo");
        jMenu1.add(mnNew);

        mnOpen.setText("Abrir");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnOpen);

        mnSaveAs.setText("Guardar Como");
        jMenu1.add(mnSaveAs);
        jMenu1.add(jSeparator1);

        mnExit.setText("Salir");
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnOpenActionPerformed

    private void btnGuadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuadarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuadarActionPerformed

    private void jcbSelectSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectSizeActionPerformed

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
            java.util.logging.Logger.getLogger(EditorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuadar;
    public javax.swing.JButton btnItalica;
    public javax.swing.JButton btnNegrita;
    public javax.swing.JButton btnReDo;
    public javax.swing.JButton btnSubrayado;
    public javax.swing.JButton btnUnDo;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JComboBox<String> jcbSelectSize;
    public javax.swing.JMenuItem mnExit;
    public javax.swing.JMenuItem mnNew;
    public javax.swing.JMenuItem mnOpen;
    public javax.swing.JMenuItem mnSaveAs;
    // End of variables declaration//GEN-END:variables
}