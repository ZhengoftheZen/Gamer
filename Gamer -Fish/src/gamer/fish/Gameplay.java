/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamer.fish;

import java.awt.BorderLayout;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author andre
 */
public class Gameplay extends javax.swing.JFrame {

    /**
     * Creates new form Gameplay
     */
    JButton[][] playerHand = new JButton[3][13];
        private humanPlayer player1 = new humanPlayer();
        private static AIplayer AI1 = new AIplayer(1);
        private static AIplayer AI2 = new AIplayer(2);
        private static AIplayer AI3 = new AIplayer(3);
        private static ImageIcon cards[][] = new ImageIcon[4][13];
        private static boolean dealt[][] = new boolean[4][13];
    
    public Gameplay() {
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

        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rulesButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        tableBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button2.setMaximumSize(new java.awt.Dimension(127, 180));
        button2.setMinimumSize(new java.awt.Dimension(127, 180));
        button2.setPreferredSize(new java.awt.Dimension(127, 180));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 790, -1, -1));

        button3.setMaximumSize(new java.awt.Dimension(127, 180));
        button3.setMinimumSize(new java.awt.Dimension(127, 180));
        button3.setPreferredSize(new java.awt.Dimension(127, 180));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 790, -1, -1));

        button4.setMaximumSize(new java.awt.Dimension(127, 180));
        button4.setMinimumSize(new java.awt.Dimension(127, 180));
        button4.setPreferredSize(new java.awt.Dimension(127, 180));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 790, -1, -1));

        button5.setMaximumSize(new java.awt.Dimension(127, 180));
        button5.setMinimumSize(new java.awt.Dimension(127, 180));
        button5.setPreferredSize(new java.awt.Dimension(127, 180));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        getContentPane().add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 790, -1, -1));

        button6.setMaximumSize(new java.awt.Dimension(127, 180));
        button6.setMinimumSize(new java.awt.Dimension(127, 180));
        button6.setPreferredSize(new java.awt.Dimension(127, 180));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        getContentPane().add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 790, -1, -1));

        button7.setMaximumSize(new java.awt.Dimension(127, 180));
        button7.setMinimumSize(new java.awt.Dimension(127, 180));
        button7.setPreferredSize(new java.awt.Dimension(127, 180));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        getContentPane().add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 790, -1, -1));

        button8.setMaximumSize(new java.awt.Dimension(127, 180));
        button8.setMinimumSize(new java.awt.Dimension(127, 180));
        button8.setPreferredSize(new java.awt.Dimension(127, 180));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        getContentPane().add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 790, -1, -1));

        button9.setMaximumSize(new java.awt.Dimension(127, 180));
        button9.setMinimumSize(new java.awt.Dimension(127, 180));
        button9.setPreferredSize(new java.awt.Dimension(127, 180));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        getContentPane().add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 790, -1, -1));

        button10.setMaximumSize(new java.awt.Dimension(127, 180));
        button10.setMinimumSize(new java.awt.Dimension(127, 180));
        button10.setPreferredSize(new java.awt.Dimension(127, 180));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        getContentPane().add(button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 790, -1, -1));

        button11.setMaximumSize(new java.awt.Dimension(127, 180));
        button11.setMinimumSize(new java.awt.Dimension(127, 180));
        button11.setPreferredSize(new java.awt.Dimension(127, 180));
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        getContentPane().add(button11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 790, -1, -1));

        button12.setMaximumSize(new java.awt.Dimension(127, 180));
        button12.setMinimumSize(new java.awt.Dimension(127, 180));
        button12.setPreferredSize(new java.awt.Dimension(127, 180));
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        getContentPane().add(button12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 790, -1, -1));

        button13.setMaximumSize(new java.awt.Dimension(127, 180));
        button13.setMinimumSize(new java.awt.Dimension(127, 180));
        button13.setPreferredSize(new java.awt.Dimension(127, 180));
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });
        getContentPane().add(button13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 790, -1, -1));

        button1.setMaximumSize(new java.awt.Dimension(127, 180));
        button1.setMinimumSize(new java.awt.Dimension(127, 180));
        button1.setPreferredSize(new java.awt.Dimension(127, 180));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 790, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 700, 120, 80));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("jLabel1");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 700, 120, 80));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("jLabel1");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 700, 120, 80));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("jLabel1");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 700, 120, 80));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("jLabel1");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 700, 120, 80));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("jLabel1");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 700, 120, 80));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("jLabel1");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 700, 120, 80));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("jLabel1");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 700, 120, 80));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("jLabel1");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 700, 120, 80));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("jLabel1");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 700, 120, 80));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("jLabel1");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 700, 120, 80));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("jLabel1");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 700, 120, 80));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("jLabel1");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, 120, 80));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 210, 300));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 210, 300));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 210, 300));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("AI2");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 210, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("AI3");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 210, 210, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("AI1");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 210, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Turn:");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 125, 260, 60));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("My Score:");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 200, 60));

        rulesButton.setBackground(new java.awt.Color(102, 51, 0));
        rulesButton.setText("Rules");
        rulesButton.setOpaque(false);
        rulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rulesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 20, -1, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tableBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Documents\\NetBeansProjects\\Gamer-Fish\\Gamer -Fish\\table with boxes.png")); // NOI18N
        tableBackground.setText("jLabel2");
        tableBackground.setMaximumSize(new java.awt.Dimension(1920, 1080));
        tableBackground.setMinimumSize(new java.awt.Dimension(1920, 1080));
        tableBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(tableBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void rulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesButtonActionPerformed
        // TODO add your handling code here:
                JLabel label = new JLabel("");
        String rules = "Game Rules \n" +
    "Starting the Game The first thing you do is deal cards to the players. For 2 to 3 players you deal each player 7 cards. If there are more than three players, deal 5 cards each. The rest of the deck is placed in the middle of the players face down. \n" +
    "\n" +
    "Taking a Turn \n" +
    "Each player gets a turn in clockwise order\n" +
    "\n" +
    "During a player’s turn they can ask one other player if they have a particular rank of card. For example, a player may ask another player if they have any aces, then if that other player has aces they must give all of their aces to the player. If the player is given their requested card, they may take another turn. However, if the other player does not have the requested card, they must say “go fish” and the player must draw a card from the deck. If the player draws the card they requested for they may also take another turn.\n" +
    "\n" +
    "If the player gets all four suits of the same rank, they must put the cards face up in front of them. For example, if the player has a nine of hearts, clubs, spades, and diamonds, they must place the set of cards down in front of them and they can take another turn.\n" +
    "\n" +
    "Winning the Game\n" +
    "Go Fish is over when one player runs out of cards or there are no more cards in the pool. The winner is then determined by who has the most piles or suits of cards in front of them.";
        
    JTextArea textArea = new JTextArea(2, 20);
    textArea.setText(rules);
    textArea.setWrapStyleWord(true);
    textArea.setLineWrap(true);
    textArea.setOpaque(false);
    textArea.setEditable(false);
    textArea.setFocusable(false);
    textArea.setBackground(UIManager.getColor("Label.background"));
    textArea.setFont(UIManager.getFont("Label.font"));
    textArea.setBorder(UIManager.getBorder("Label.border"));

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(label, BorderLayout.NORTH);
    frame.getContentPane().add(textArea, BorderLayout.CENTER);
    frame.setSize(400,600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }//GEN-LAST:event_rulesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gameplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // diamond clover heart spades
        for(int i =0;i < 4; i++) {
            for(int x = 0; x<13; x++) {
                cards[i][x] = new ImageIcon(card(i,x)+".png");
            }
        }
        

        
        dealCards(humanPlayer.hand, cards, dealt);
        dealCards(AI1.hand, cards, dealt);
        dealCards(AI2.hand, cards, dealt);
        dealCards(AI3.hand, cards, dealt);


        /*boolean[][] deck = new boolean[4][13];
        for(int i = 0; i < 4; i++) {
            for(int x = 0; i < 13; i++) {
                if(!dealt[i][x]) {
                    deck[i][x] = true;
                }
            }
        }*/
        int turn = 0;
        while(notEmpt(dealt)) {
            
            
            int pick, opp, num;
            switch(turn) {
                case 0:                

                ArrayList<String> oppHand; 
                while(true) {
                    // pick: card that is guessed
                    // opp: opponent that card is picked from. AI1 = 1, AI2 = 2, AI3 = 3;
                    System.out.println("Pick the player who you want to ask");
                    pick = 0;//sc.nextInt();
                    System.out.println("Pick the card you think they have");
                    opp = 0;//sc.nextInt();

                    //player gets opponent hand
                    oppHand = getHand(opp, player1,AI1,AI2,AI3);
                    
                    num = hasCard(pick, player1.score, oppHand, player1.hand, player1.points);
                    if(opp == 1) {
                        AI1.hand = oppHand;
                    }else if(opp ==2) {
                        AI2.hand = oppHand;
                    }else {
                        AI3.hand = oppHand;
                    }

                    System.out.println(num);
                    if(num == 0) {
                        turn++;
                        drawCard(dealt, player1.hand);
                        break;
                    }
                }
                break;
                case 1:
                while(true) {
                    pick = AI1.getFish(AI1.ID, AI1.hand)/10;
                    opp = AI1.getFish(AI1.ID, AI1.hand)%10;

                    //player gets opponent hand
                    oppHand = getHand(opp, player1,AI1,AI2,AI3);
                    
                    num = hasCard(pick, AI1.score, oppHand, AI1.hand, AI1.points);
                    if(opp == 0) {
                        player1.hand = oppHand;
                    }else if(opp ==2) {
                        AI2.hand = oppHand;
                    }else {
                        AI3.hand = oppHand;
                    }

                    if(num == 0) {
                        turn++;
                        drawCard(dealt, AI1.hand);
                        break;
                    }
                }
                break;
            case 2:
                while(true) {
                    pick = AI2.getFish(AI2.ID, AI2.hand)/10;
                    opp = AI2.getFish(AI2.ID, AI2.hand)%10;
                    
                    //player gets opponent hand
                    oppHand = getHand(opp, player1,AI1,AI2,AI3);
                    
                    num = hasCard(pick, AI2.score, oppHand, AI2.hand, AI2.points);
                    if(opp == 0) {
                        player1.hand = oppHand;
                    }else if(opp ==1) {
                        AI1.hand = oppHand;
                    }else {
                        AI3.hand = oppHand;
                    }

                    if(num == 0) {
                        drawCard(dealt, AI2.hand);
                        turn++;
                        break;
                    }
                }
                break;
            case 3 : 
                while(true) {
                    pick = AI3.getFish(AI3.ID, AI3.hand)/10;
                    opp = AI3.getFish(AI3.ID, AI3.hand)%10;
                    
                    //player gets opponent hand
                    oppHand = getHand(opp, player1,AI1,AI2,AI3);
                    
                    num = hasCard(pick, AI3.score, oppHand, AI3.hand, AI3.points);

                    if(opp == 0) {
                        player1.hand = oppHand;
                    }else if(opp ==1) {
                        AI1.hand = oppHand;
                    }else {
                        AI2.hand = oppHand;
                    }

                    if(num == 0) {
                        turn = 0;
                        drawCard(dealt, AI3.hand);
                        break;
                    }
                }
        }
         int remPoints = 13 - (AI3.score + AI2.score + AI1.score + player1.score);
            if((Math.max(player1.score,Math.max(AI3.score, Math.max(AI3.score, AI2.score))) -
            Math.min(player1.score,Math.max(AI3.score, Math.max(AI3.score, AI2.score))))> remPoints) 
                break;
        }   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gameplay().setVisible(true);
            }
        });
        //playerHand [0][0] = button1;
    }
public static boolean notEmpt(boolean[][] arr) {
        for (boolean[] x : arr) {
            for (boolean i : x) {
                if (!i)
                    return true;
            }
        }
        return false;
    }
public static void dealCards(ArrayList<String> hand, ImageIcon[][] cards, boolean[][] dealt) {
        while (hand.size() < 5) {
            Random rand = new Random();
            int x = rand.nextInt(4);
            int y = rand.nextInt(13);
            if (dealt[x][y] == false) {
                hand.add(card(x, y));
                dealt[x][y] = true;
            }
        }
    }
public static void sortHand(ArrayList<String> hand) {
        Collections.sort(hand);
    }
    public static void drawCard(boolean[][] dealt, ArrayList<String> hand) {
        Random rand = new Random();
        int x, y;
        do {
            x = rand.nextInt(4);
            y = rand.nextInt(13);
        }while(dealt[x][y]);
        dealt[x][y] = false;
        hand.add(card(x,y));
    }
    public static String card(int i, int y) {
        String id = "";
        if (i == 0) {
            id = "d";
        } else if (i == 1) {
            id = "c";
        } else if (i == 2) {
            id = "h";
        } else {
            id = "s";
        }
        return y + " " + id; //+ " (Cards)";
    }
    //returns number of cards from a guess
    public static int hasCard(int card, Integer score, ArrayList<String> hand, ArrayList<String> myHand, ArrayList<Integer> points) {
        int cards = 0;
        int temp;
        for (int x =0; x< hand.size(); x++) {
            Scanner scan = new Scanner(hand.get(x));
            //System.out.println(scan.hasNextInt());
            temp = scan.nextInt();
            if (temp == card) {
                cards++;
                if(cards == 4) {
                    points.add(temp);
                    score++;
                    System.out.println(score);
                    removeCards(card, myHand);
                    break;    
                }else {
                    myHand.add(hand.get(x));
                }
                hand.remove(x);
                x--;
            }
        }
            
        return cards;
    }
    public static void removeCards(int card, ArrayList<String> hand) {
        
        for(int i = 0; i < hand.size(); i++) {
            Scanner scan = new Scanner(hand.get(i));
            if(scan.nextInt() == card) {
                hand.remove(i);
                i--;
            }
        }
    }
    public static ArrayList<String> getHand(int i, humanPlayer player1, AIplayer AI1, AIplayer AI2, AIplayer AI3) {
        if (i == 0) {
            return player1.hand;
        } else if (i == 1) {
            return AI1.hand;
        } else if (i == 2) {
            return AI2.hand;
        } else {
            return AI3.hand;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton rulesButton;
    private javax.swing.JLabel tableBackground;
    // End of variables declaration//GEN-END:variables
    //private javax.swing.JButton[] playerHand = new JButton[39];
}
