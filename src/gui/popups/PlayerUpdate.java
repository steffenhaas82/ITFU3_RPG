/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package gui.popups;

import enums.UpdateAbleStats;
import character.PlayerCharacter;
import character.helper.CharacterSelecter;
import enums.Proficiency;
import java.awt.Dimension;
import java.awt.Toolkit;
import main.Game;

/**
 *
 * @author steffen
 */
public class PlayerUpdate extends javax.swing.JFrame {
    PlayerCharacter pc;
    
    int usedExperience;
    int strength;
    int constituion;
    int dexterity;
    int wisdom;
    int intellegence;
    int charisma;
    int moves;
    int health;
    int attacks;
    private int xPosition;
    private int yPosition;
    
    /**
     * Creates new form PlayerUpdate
     * @param pc - PlayerCharacter
     */
    public PlayerUpdate(PlayerCharacter pc) {
        initComponents();
        
        System.out.println(pc.showCharInfo());
        this.pc = pc;
        
        strength = pc.getStrength();
        dexterity = pc.getDexterity();
        constituion = pc.getConstitution();
        wisdom = pc.getWisdom();
        charisma = pc.getCharisma();
        intellegence = pc.getIntellegence();
        health = pc.getHealth();
        attacks =pc.getAttacks();
        moves = pc.getMovement();
        
        
        
        characterName.setText(pc.getName());
        experienceLeftToUseValueLabel.setText(String.valueOf(pc.getUnUsedExperience()));
        
        strengthLabel.setText(String.valueOf(pc.getStrength()));
        constitutionLabel.setText(String.valueOf(pc.getConstitution()));
        dexterityLabel.setText(String.valueOf(pc.getDexterity()));
        wisdomLabel.setText(String.valueOf(pc.getWisdom()));
        intellegenceLabel.setText(String.valueOf(pc.getIntellegence()));
        charismaLabel.setText(String.valueOf(pc.getCharisma()));
        healthLabel.setText(String.valueOf(pc.getHealth()));
        attacksLabel.setText(String.valueOf(pc.getAttacks()));
        movementLabel.setText(String.valueOf(pc.getMovement()));
    }
    
    private void initFrameSetup() {
        this.setResizable(false);
        Dimension dimensions = new Dimension(550, 300);
        this.setPreferredSize(dimensions);
        this.setMinimumSize(dimensions);
        this.setMaximumSize(dimensions);
        this.setFocusable(true);
        this.addKeyListener(Game.getKeyhandler());
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = this.getSize();

        this.xPosition = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
        this.yPosition = Math.max(0, (screenSize.height - windowSize.height) / 2);
        this.setLocation(xPosition, yPosition);
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

        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateableStatsList = new javax.swing.JList();
        addButton = new javax.swing.JButton();
        substractButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        experienceLeftToUseValueLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        charismaLabel = new javax.swing.JLabel();
        movementLabel = new javax.swing.JLabel();
        attacksLabel = new javax.swing.JLabel();
        healthLabel = new javax.swing.JLabel();
        dexterityLabel = new javax.swing.JLabel();
        wisdomLabel = new javax.swing.JLabel();
        strengthLabel = new javax.swing.JLabel();
        constitutionLabel = new javax.swing.JLabel();
        intellegenceLabel = new javax.swing.JLabel();
        characterName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        updateableStatsList.setModel(gui.GuiHelper.ListModels.getUpdateablePlayerStats());
        jScrollPane1.setViewportView(updateableStatsList);

        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        substractButton.setText("-");
        substractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substractButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Experience left to use");

        experienceLeftToUseValueLabel.setText("0");

        jLabel3.setText("Dexterity");

        jLabel4.setText("Wisdom");

        jLabel5.setText("Strength");

        jLabel6.setText("Constitution");

        jLabel7.setText("Intellegence");

        jLabel8.setText("Charisma");

        jLabel9.setText("Movement");

        jLabel10.setText("Attacks");

        jLabel11.setText("Health");

        charismaLabel.setText("Charisma");

        movementLabel.setText("Movement");

        attacksLabel.setText("Attacks");

        healthLabel.setText("Health");

        dexterityLabel.setText("Dexterity");

        wisdomLabel.setText("Wisdom");

        strengthLabel.setText("Strength");

        constitutionLabel.setText("Constitution");

        intellegenceLabel.setText("Intellegence");

        characterName.setText("name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(healthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dexterityLabel)
                    .addComponent(constitutionLabel)
                    .addComponent(wisdomLabel)
                    .addComponent(charismaLabel)
                    .addComponent(movementLabel)
                    .addComponent(intellegenceLabel)
                    .addComponent(attacksLabel)
                    .addComponent(strengthLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(substractButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(characterName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experienceLeftToUseValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(characterName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(experienceLeftToUseValueLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton)
                                .addComponent(substractButton))
                            .addGap(182, 182, 182)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(okButton)
                                .addComponent(cancelButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(strengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dexterityLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(constitutionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(wisdomLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(intellegenceLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(charismaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(movementLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(attacksLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(healthLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
   
        pc.setStrength(strength + pc.getpRace().getStatsBonus()[Proficiency.STRENGTH.getIndex()]);
        pc.setDexterity(dexterity + pc.getpRace().getStatsBonus()[Proficiency.DEXTERITY.getIndex()]);
        pc.setConstitution(constituion + pc.getpRace().getStatsBonus()[Proficiency.CONSTITUTION.getIndex()]);
        pc.setWisdom(wisdom + pc.getpRace().getStatsBonus()[Proficiency.WISDOM.getIndex()]);
        pc.setIntellegence(intellegence + pc.getpRace().getStatsBonus()[Proficiency.INTELLEGENCE.getIndex()]);
        pc.setCharisma(charisma + pc.getpRace().getStatsBonus()[Proficiency.CHARISMA.getIndex()]);
        
        pc.setMovement(moves);
        int newTempMov = moves - pc.getMovement() + pc.getAllowedMoves();
        pc.setAllowedMoves(newTempMov);
        
        pc.setAttacks(attacks);
        pc.setUnUsedExperience(pc.getUnUsedExperience() - usedExperience);
        
        pc.setHealth(health + pc.getpRace().getStatsBonus()[Proficiency.HEALTH.getIndex()]);
        int newTempHealth = health - pc.getHealth() + pc.getTempHP();
        pc.setTempHP(newTempHealth);
        
        Game.getInstance().setPlayer(pc);
        // due to new max health Healthbarlabel needs update
        Game.getInstance().getGameFrame().getPlayerHealthBarLabel().setMaxHealthCurrentHealth(health, newTempHealth);
        Game.updateGUI();
        System.out.println(pc.showCharInfo());
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        UpdateAbleStats stat = (UpdateAbleStats)updateableStatsList.getSelectedValue();
        int unUsedXP = this.pc.getUnUsedExperience() - usedExperience;
        // only works if there is unUsedExp
        if (unUsedXP >= 100) {
            switch (stat) {
                case STRENGTH:
                    strength ++;
                    strengthLabel.setText(String.valueOf(strength));
                    break;
                case DEXTERITY:
                    dexterity ++;
                    dexterityLabel.setText(String.valueOf(dexterity));
                    break;
                case CONSTITUTION:
                    constituion ++;
                    constitutionLabel.setText(String.valueOf(constituion));
                    break;
                case WISDOM:
                    wisdom++;
                    wisdomLabel.setText(String.valueOf(wisdom));
                    break;
                case CHARISMA:
                    charisma ++;
                    charismaLabel.setText(String.valueOf(charisma));
                    break;
                case INTELLEGENCE:
                    intellegence++;
                    intellegenceLabel.setText(String.valueOf(intellegence));
                    break;
                case HEALTH:
                    health++;
                    healthLabel.setText(String.valueOf(health));
                    break;
                case MOVEMENT:
                    moves++;
                    movementLabel.setText(String.valueOf(moves));
                    break;
                case ATTACKS:
                    attacks++;
                    attacksLabel.setText(String.valueOf(attacks));
                    break;
            }
            
            usedExperience += 100;
            experienceLeftToUseValueLabel.setText(String.valueOf(pc.getUnUsedExperience() - usedExperience));
        }
    }//GEN-LAST:event_addButtonActionPerformed
    
    private void substractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substractButtonActionPerformed
        UpdateAbleStats stat = (UpdateAbleStats)updateableStatsList.getSelectedValue();
        // only works if there is usedExp
        if (usedExperience >0) {
            switch (stat) {
                case STRENGTH:
                    strength --;
                    strengthLabel.setText(String.valueOf(strength));
                    break;
                case DEXTERITY:
                    dexterity --;
                    dexterityLabel.setText(String.valueOf(dexterity));
                    break;
                case CONSTITUTION:
                    constituion --;
                    constitutionLabel.setText(String.valueOf(constituion));
                    break;
                case WISDOM:
                    wisdom--;
                    wisdomLabel.setText(String.valueOf(wisdom));
                    break;
                case CHARISMA:
                    charisma --;
                    charismaLabel.setText(String.valueOf(charisma));
                    break;
                case INTELLEGENCE:
                    intellegence--;
                    intellegenceLabel.setText(String.valueOf(intellegence));
                    break;
                case HEALTH:
                    health--;
                    healthLabel.setText(String.valueOf(health));
                    break;
                case MOVEMENT:
                    moves--;
                    movementLabel.setText(String.valueOf(moves));
                    break;
                case ATTACKS:
                    attacks--;
                    attacksLabel.setText(String.valueOf(attacks));
                    break;
            }
            
            usedExperience -= 100;
            experienceLeftToUseValueLabel.setText(String.valueOf(pc.getUnUsedExperience() - usedExperience));
        }
    }//GEN-LAST:event_substractButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(PlayerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               PlayerUpdate pu =  new PlayerUpdate(CharacterSelecter.getDemoCharArrayList().get(0));
               pu.pc.setUnUsedExperience(500);
               
               pu.setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel attacksLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel characterName;
    private javax.swing.JLabel charismaLabel;
    private javax.swing.JLabel constitutionLabel;
    private javax.swing.JLabel dexterityLabel;
    private javax.swing.JLabel experienceLeftToUseValueLabel;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JLabel intellegenceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel movementLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JButton substractButton;
    private javax.swing.JList updateableStatsList;
    private javax.swing.JLabel wisdomLabel;
    // End of variables declaration//GEN-END:variables
}
