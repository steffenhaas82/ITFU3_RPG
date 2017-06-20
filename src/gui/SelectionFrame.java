package gui;

import character.PlayerCharacter;
import gui.GuiHelper.ListModels;
import gui.popups.HighScoreFrame;
import java.awt.Dimension;
import main.Game;

/**
 *
 * @author Steffen Haas
 */
public class SelectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectionFrame
     */
    public SelectionFrame() {
        initComponents();
        initFrameSetup();
         jTextAreaPlayerInfo.setEditable(false);
         jTextAreaPlayerInfo.setText("Please select a Character");
    }
    
    /**
     * Sets important properties of the Frame
     */
    private void initFrameSetup() {
        this.setResizable(false);
        Dimension dimensions = new Dimension(900, 600);
        this.setPreferredSize(dimensions);
        this.setMinimumSize(dimensions);
        this.setMaximumSize(dimensions);
        this.setFocusable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectjLabel = new javax.swing.JLabel();
        jToggleButtonSelect = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPlayerInfo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        characterList = new javax.swing.JList();
        jLabelPlayerInfo = new javax.swing.JLabel();
        btn_showHighScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(200, 200, 200));

        selectjLabel.setText("Select a Player");

        jToggleButtonSelect.setText("Start Game");
        jToggleButtonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSelectActionPerformed(evt);
            }
        });

        jTextAreaPlayerInfo.setColumns(20);
        jTextAreaPlayerInfo.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPlayerInfo);

        characterList.setModel(ListModels.getCharacterModel());
        characterList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                characterListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(characterList);

        jLabelPlayerInfo.setText("Player Info");

        btn_showHighScore.setText("High Score");
        btn_showHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showHighScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_showHighScore)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectjLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonSelect))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPlayerInfo)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectjLabel)
                    .addComponent(jLabelPlayerInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonSelect))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btn_showHighScore)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Takes the Selected Character and starts the Game with this Character.
    * @param evt 
    */
    private void jToggleButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSelectActionPerformed
        PlayerCharacter pc = (PlayerCharacter)characterList.getSelectedValue();
        if (pc != null) {
            // error handling if nothing is selected.
            this.setVisible(false);
          
            Game.getInstance().setPlayer(pc);
            Game.getInstance().start();
        }
    }//GEN-LAST:event_jToggleButtonSelectActionPerformed

    /**
    * Update PlayerInfo Area on Char Selection
    * @param evt 
    */
    private void characterListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_characterListValueChanged
        PlayerCharacter pc = (PlayerCharacter)characterList.getSelectedValue();
        jTextAreaPlayerInfo.setText(pc.showCharInfo());
    }//GEN-LAST:event_characterListValueChanged

    private void btn_showHighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showHighScoreActionPerformed
        new HighScoreFrame().setVisible(true);
    }//GEN-LAST:event_btn_showHighScoreActionPerformed

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
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_showHighScore;
    private javax.swing.JList characterList;
    private javax.swing.JLabel jLabelPlayerInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaPlayerInfo;
    private javax.swing.JToggleButton jToggleButtonSelect;
    private javax.swing.JLabel selectjLabel;
    // End of variables declaration//GEN-END:variables
}
