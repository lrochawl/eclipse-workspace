/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;
import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author lucas
 */
public class TelaRelogio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelogio
     */
    public TelaRelogio() {
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

        jLabel2 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        infoAcao = new javax.swing.JLabel();
        textoDataHora = new javax.swing.JLabel();
        infoDataHora = new javax.swing.JLabel();
        textoResolucao = new javax.swing.JLabel();
        infoResolucao = new javax.swing.JLabel();
        textoIdioma = new javax.swing.JLabel();
        infoIdioma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngtree-vector-calendar-icon-png-image_540870.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 51, 51));
        lblHora.setText("Analisador de informações");

        btnClick.setText("Clique para mostrar informações");
        btnClick.setToolTipText("");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        infoAcao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoAcao.setForeground(new java.awt.Color(102, 102, 102));
        infoAcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoAcao.setText("Clique no botão");
        infoAcao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoDataHora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textoDataHora.setForeground(new java.awt.Color(255, 153, 153));
        textoDataHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDataHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoDataHora.setMaximumSize(new java.awt.Dimension(111, 17));
        textoDataHora.setMinimumSize(new java.awt.Dimension(111, 17));
        textoDataHora.setPreferredSize(new java.awt.Dimension(111, 17));

        infoDataHora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoDataHora.setForeground(new java.awt.Color(255, 102, 102));
        infoDataHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoDataHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoDataHora.setMaximumSize(new java.awt.Dimension(111, 17));
        infoDataHora.setMinimumSize(new java.awt.Dimension(111, 17));
        infoDataHora.setName(""); // NOI18N
        infoDataHora.setPreferredSize(new java.awt.Dimension(111, 17));

        textoResolucao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textoResolucao.setForeground(new java.awt.Color(255, 153, 153));
        textoResolucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoResolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoResolucao.setMaximumSize(new java.awt.Dimension(111, 17));
        textoResolucao.setMinimumSize(new java.awt.Dimension(111, 17));
        textoResolucao.setPreferredSize(new java.awt.Dimension(111, 17));

        infoResolucao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoResolucao.setForeground(new java.awt.Color(255, 102, 102));
        infoResolucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoResolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoResolucao.setMaximumSize(new java.awt.Dimension(111, 17));
        infoResolucao.setMinimumSize(new java.awt.Dimension(111, 17));
        infoResolucao.setPreferredSize(new java.awt.Dimension(111, 17));

        textoIdioma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        textoIdioma.setForeground(new java.awt.Color(255, 153, 153));
        textoIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIdioma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoIdioma.setMaximumSize(new java.awt.Dimension(111, 17));
        textoIdioma.setMinimumSize(new java.awt.Dimension(111, 17));
        textoIdioma.setPreferredSize(new java.awt.Dimension(111, 17));

        infoIdioma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoIdioma.setForeground(new java.awt.Color(255, 102, 102));
        infoIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoIdioma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        infoIdioma.setMaximumSize(new java.awt.Dimension(111, 17));
        infoIdioma.setMinimumSize(new java.awt.Dimension(111, 17));
        infoIdioma.setPreferredSize(new java.awt.Dimension(111, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(infoIdioma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoIdioma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoResolucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoResolucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoDataHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoDataHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoAcao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHora)
                        .addGap(18, 18, 18)
                        .addComponent(infoAcao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infoDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infoResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();  
        textoDataHora.setText("Data e Hora");  
        infoDataHora.setText(relogio.toString());
        
        textoResolucao.setText("Resolução da tela");
        infoResolucao.setText(resolucao.width + "px x "+resolucao.height+"px");
        
        textoIdioma.setText("Idioma do sistema");
        infoIdioma.setText(idioma.getDisplayLanguage());
    }//GEN-LAST:event_btnClickActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelogio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel infoAcao;
    private javax.swing.JLabel infoDataHora;
    private javax.swing.JLabel infoIdioma;
    private javax.swing.JLabel infoResolucao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel textoDataHora;
    private javax.swing.JLabel textoIdioma;
    private javax.swing.JLabel textoResolucao;
    // End of variables declaration//GEN-END:variables
}
