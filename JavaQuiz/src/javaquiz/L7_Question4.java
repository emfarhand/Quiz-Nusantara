/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class L7_Question4 extends javax.swing.JFrame {
    int correct=0 ;
    /**
     * Creates new form Question1
     */
    public L7_Question4(int correct) {
        initComponents();
        
        this.correct = correct;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl_q1 = new javax.swing.JPanel();
        pnl_title = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_q1 = new javax.swing.JLabel();
        rbtn_ans1 = new javax.swing.JRadioButton();
        rbtn_ans2 = new javax.swing.JRadioButton();
        rbtn_ans3 = new javax.swing.JRadioButton();
        rbtn_ans4 = new javax.swing.JRadioButton();
        btn_next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_q1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_q1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnl_q1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_title.setBackground(new java.awt.Color(0, 0, 0));
        pnl_title.setForeground(new java.awt.Color(255, 102, 0));

        lbl_title.setBackground(new java.awt.Color(255, 255, 255));
        lbl_title.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("LEVEL 7 : Zaman Penjajahan Jepang");

        javax.swing.GroupLayout pnl_titleLayout = new javax.swing.GroupLayout(pnl_title);
        pnl_title.setLayout(pnl_titleLayout);
        pnl_titleLayout.setHorizontalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_titleLayout.setVerticalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_q1.add(pnl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        lbl_q1.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        lbl_q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_q1.setText("Question 4");
        pnl_q1.add(lbl_q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        buttonGroup1.add(rbtn_ans1);
        rbtn_ans1.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        rbtn_ans1.setText("15 Agustus 1945");
        rbtn_ans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ans1ActionPerformed(evt);
            }
        });
        pnl_q1.add(rbtn_ans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 176, -1, -1));

        buttonGroup1.add(rbtn_ans2);
        rbtn_ans2.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        rbtn_ans2.setText("18  Agustus 1945");
        pnl_q1.add(rbtn_ans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 217, -1, -1));

        buttonGroup1.add(rbtn_ans3);
        rbtn_ans3.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        rbtn_ans3.setText("16  Agustus 1945");
        pnl_q1.add(rbtn_ans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 176, -1, -1));

        buttonGroup1.add(rbtn_ans4);
        rbtn_ans4.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        rbtn_ans4.setText("19 Agustus 1945");
        pnl_q1.add(rbtn_ans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 217, -1, -1));

        btn_next.setBackground(new java.awt.Color(0, 0, 0));
        btn_next.setFont(new java.awt.Font("Futura Md BT", 1, 11)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        pnl_q1.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 258, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jTextArea1.setText("Saat (waktu) sidang ke berapakah PPKI mengesahkan pem-\nbentukan 12 Kementerian dan 4 Menteri Negara ?");
        jScrollPane1.setViewportView(jTextArea1);

        pnl_q1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 384, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\JavaQuiz\\src\\javaquiz\\image\\bg_L7.jpg")); // NOI18N
        pnl_q1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_ans1ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if(!rbtn_ans1.isSelected() && !rbtn_ans3.isSelected() && !rbtn_ans2.isSelected() && !rbtn_ans4.isSelected()){
            JOptionPane.showMessageDialog(null, "please select at least an answer !");
        }else if(rbtn_ans4.isSelected()){
        correct++;
        
        new L7_Question5(correct).setVisible(true);
        this.dispose();
       }else if(!rbtn_ans4.isSelected()) {
        new L7_Question5(correct).setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_btn_nextActionPerformed

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
            java.util.logging.Logger.getLogger(L7_Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L7_Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L7_Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L7_Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L7_Question4(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_q1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_q1;
    private javax.swing.JPanel pnl_title;
    private javax.swing.JRadioButton rbtn_ans1;
    private javax.swing.JRadioButton rbtn_ans2;
    private javax.swing.JRadioButton rbtn_ans3;
    private javax.swing.JRadioButton rbtn_ans4;
    // End of variables declaration//GEN-END:variables
}
