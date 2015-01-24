/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

import CelestialBodies.Planet;
import CelestialBodies.Star;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;

/**
 *
 * @author Brennan
 */
public class Main extends javax.swing.JFrame {

    Double mass;
    Double angMom;
    Star sun;
    Planet earth;
    int placeholder = 50;   // temporarily being used for mass & momentum
    Timer timer = new Timer();
    double t = 1;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        lbMValue.setText(String.format("%.1f", (double) sldrMass.getValue() / 100));
        lbLValue.setText(String.format("%d", sldrLMom.getValue() / 10));
        int xScreen = pnlScreen.getWidth() - 1;
        int yScreen = pnlScreen.getHeight() - 1;
        sun = new Star(placeholder, xScreen, yScreen, 50, 50);
        earth = new Planet(1.0, 4.522613, xScreen / 2, yScreen / 2, 25, 25);

        // TimerTask is animating the Planet earth. For testing I just manually
        // added to the planet's x and y positions. At this point we can start
        // getting things to work as intended. Note: I'll be adjust/moving where a lot
        // of these things (objects, timertask, etc.) are after the demo. But for now
        // I just want something to show :P
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                earth.setXPos(earth.getXPos(t++, xScreen / 2));
                earth.setYPos(earth.getYPos(t++, yScreen / 2));
                repaint();
            }
        };
        timer.schedule(task, 100, 100);

    }

    public void simulate() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbEarthImg = new javax.swing.JLabel();
        lbEarth = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rdoVenus = new javax.swing.JRadioButton();
        rdoEarth = new javax.swing.JRadioButton();
        rdoMars = new javax.swing.JRadioButton();
        rdoJupiter = new javax.swing.JRadioButton();
        lbJupiterImg = new javax.swing.JLabel();
        lbJupiter = new javax.swing.JLabel();
        lbVenusImg = new javax.swing.JLabel();
        lbVenus = new javax.swing.JLabel();
        lbMars = new javax.swing.JLabel();
        lbMarsImg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbMass = new javax.swing.JLabel();
        lbL = new javax.swing.JLabel();
        lbLValue = new javax.swing.JLabel();
        sldrMass = new javax.swing.JSlider();
        lbMValue = new javax.swing.JLabel();
        sldrLMom = new javax.swing.JSlider();
        pnlScreen = new javax.swing.JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                sun.draw((Graphics2D)g);
                earth.draw((Graphics2D)g);
            }
        };
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbEarthImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/earth.gif"))); // NOI18N

        lbEarth.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbEarth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEarth.setText("Earth");

        btnGroup.add(rdoVenus);
        rdoVenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoVenusActionPerformed(evt);
            }
        });

        btnGroup.add(rdoEarth);

        btnGroup.add(rdoMars);

        btnGroup.add(rdoJupiter);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoVenus)
                    .addComponent(rdoEarth)
                    .addComponent(rdoMars)
                    .addComponent(rdoJupiter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(rdoVenus)
                .addGap(145, 145, 145)
                .addComponent(rdoEarth)
                .addGap(135, 135, 135)
                .addComponent(rdoMars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoJupiter)
                .addGap(56, 56, 56))
        );

        lbJupiterImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/jupiter.gif"))); // NOI18N

        lbJupiter.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbJupiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJupiter.setText("Jupiter");

        lbVenusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/venus.gif"))); // NOI18N

        lbVenus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbVenus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVenus.setText("Venus");

        lbMars.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMars.setText("Mars");

        lbMarsImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMarsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mars.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbJupiterImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbJupiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEarth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEarthImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVenusImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMarsImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbVenus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbVenusImg)
                        .addGap(18, 18, 18)
                        .addComponent(lbEarth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEarthImg)
                        .addGap(18, 18, 18)
                        .addComponent(lbMars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMarsImg)
                        .addGap(18, 18, 18)
                        .addComponent(lbJupiter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbJupiterImg)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        lbMass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMass.setText("Mass");

        lbL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbL.setText("L");

        lbLValue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbLValue.setText("50");

        sldrMass.setMajorTickSpacing(10);
        sldrMass.setMaximum(150);
        sldrMass.setMinimum(50);
        sldrMass.setMinorTickSpacing(5);
        sldrMass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrMassStateChanged(evt);
            }
        });

        lbMValue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMValue.setText("50");

        sldrLMom.setMajorTickSpacing(1);
        sldrLMom.setMaximum(50);
        sldrLMom.setMinimum(10);
        sldrLMom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrLMomStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldrLMom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldrMass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbLValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbMValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldrMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMValue)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbMass)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lbL))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lbLValue))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(sldrLMom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlScreen.setBackground(new java.awt.Color(0, 0, 0));
        pnlScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlScreenLayout = new javax.swing.GroupLayout(pnlScreen);
        pnlScreen.setLayout(pnlScreenLayout);
        pnlScreenLayout.setHorizontalGroup(
            pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        pnlScreenLayout.setVerticalGroup(
            pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jButton1.setText("Add Planet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(44, 44, 44)
                        .addComponent(pnlScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldrMassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrMassStateChanged
        // TODO add your handling code here:
//        JSlider mSlider = (JSlider)evt.getSource();
//            if (mSlider.getValueIsAdjusting()){
//                int fps = (int)mSlider.getValue();
//                lbMValue.setText("" + fps);
//            }
        if (sldrMass.getValueIsAdjusting()) {
            lbMValue.setText(String.format("%.1f", (double) sldrMass.getValue() / 100));
        } else if (!sldrMass.getValueIsAdjusting()) {
            mass = (double) sldrMass.getValue() / 100;
        }
    }//GEN-LAST:event_sldrMassStateChanged

    private void sldrLMomStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrLMomStateChanged
//        JSlider LSlider = (JSlider) evt.getSource();
//        if (!LSlider.getValueIsAdjusting()) {
//            int fps = (int) LSlider.getValue();
//            lbLValue.setText("" + fps);
//        }
        if (sldrLMom.getValueIsAdjusting()) {
            lbLValue.setText(String.format("%d", sldrLMom.getValue()/10));
        }
        else if(!sldrLMom.getValueIsAdjusting()){
            angMom = (double) sldrLMom.getValue()/10;
        }
    }//GEN-LAST:event_sldrLMomStateChanged

    private void rdoVenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoVenusActionPerformed
        // TODO add your handling code here:
        // When Venus Radio Button is selected!!
    }//GEN-LAST:event_rdoVenusActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEarth;
    private javax.swing.JLabel lbEarthImg;
    private javax.swing.JLabel lbJupiter;
    private javax.swing.JLabel lbJupiterImg;
    private javax.swing.JLabel lbL;
    private javax.swing.JLabel lbLValue;
    private javax.swing.JLabel lbMValue;
    private javax.swing.JLabel lbMars;
    private javax.swing.JLabel lbMarsImg;
    private javax.swing.JLabel lbMass;
    private javax.swing.JLabel lbVenus;
    private javax.swing.JLabel lbVenusImg;
    private javax.swing.JPanel pnlScreen;
    private javax.swing.JRadioButton rdoEarth;
    private javax.swing.JRadioButton rdoJupiter;
    private javax.swing.JRadioButton rdoMars;
    private javax.swing.JRadioButton rdoVenus;
    private javax.swing.JSlider sldrLMom;
    private javax.swing.JSlider sldrMass;
    // End of variables declaration//GEN-END:variables
}
