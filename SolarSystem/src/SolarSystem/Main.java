/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

import CelestialBodies.Planet;
import CelestialBodies.SolarSystem;
import CelestialBodies.Star;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;

/**
 *
 * @author Brennan
 */
public class Main extends javax.swing.JFrame {

    int placeholder = 50;   // temporarily being used for mass & momentum
    double t = 0;
    Double mass = .5;
    Double angMom = 1.0;
    Star sun;
    Planet earth;
    SolarSystem ss = new SolarSystem();
    Timer timer = new Timer();
    BufferedImage img = null;
    int xScreen;
    int yScreen;
    int choice;
    int inc;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        try {
            lbMValue.setText(String.format("%.1f", (double) sldrMass.getValue() / 100));
            lbLValue.setText(String.format("%d", sldrLMom.getValue() / 100));
            xScreen = pnlScreen.getWidth() - 1;
            yScreen = pnlScreen.getHeight() - 1;

            URL url = this.getClass().getClassLoader().getResource("Resources/sSun60.png");
            img = ImageIO.read(url);
            sun = new Star(placeholder, xScreen, yScreen, img);

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    ss.simulate(t++, xScreen / 2, yScreen / 2);
                    repaint();
                }
            };
            timer.schedule(task, 100, 100);

        } catch (Exception e) {
            e.printStackTrace();
        }
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

                try{
                    // Draw background with image of space
                    BufferedImage bgImg = null;
                    bgImg = ImageIO.read(this.getClass().getClassLoader().getResource("Resources/bkgrd.jpg"));
                    g.drawImage(bgImg, 0, 0, null);

                    // Draw the sun
                    sun.draw((Graphics2D)g);

                    // Draw the planets
                    if (!ss.getPlanets().isEmpty()){
                        for (int i = 0; i < ss.getPlanets().size(); i++){
                            ss.getPlanets().get(i).draw((Graphics2D)g.create());
                        }
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

            }
        };
        addPlanet = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solar System Simulator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbEarthImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/earth.gif"))); // NOI18N

        lbEarth.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbEarth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEarth.setText("Earth");

        btnGroup.add(rdoVenus);
        rdoVenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoVenusActionPerformed(evt);
            }
        });

        btnGroup.add(rdoEarth);
        rdoEarth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoEarthActionPerformed(evt);
            }
        });

        btnGroup.add(rdoMars);
        rdoMars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMarsActionPerformed(evt);
            }
        });

        btnGroup.add(rdoJupiter);
        rdoJupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoJupiterActionPerformed(evt);
            }
        });

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
                .addGap(139, 139, 139)
                .addComponent(rdoEarth)
                .addGap(135, 135, 135)
                .addComponent(rdoMars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoJupiter)
                .addGap(56, 56, 56))
        );

        lbJupiterImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/jupiter.gif"))); // NOI18N

        lbJupiter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbJupiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJupiter.setText("Jupiter");

        lbVenusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/venus.gif"))); // NOI18N

        lbVenus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbVenus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVenus.setText("Venus");

        lbMars.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbMars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMars.setText("Mars");

        lbMarsImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMarsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mars.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        sldrLMom.setMajorTickSpacing(10);
        sldrLMom.setMaximum(500);
        sldrLMom.setMinimum(200);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMValue, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(lbLValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        addPlanet.setText("Add Planet");
        addPlanet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlanetActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(pnlScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(addPlanet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPlanet)
                    .addComponent(btnReset))
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
            //inc = (sldrMass.getValue()-sldrMass.getMinimum())*5;
            //sldrLMom.setMinimum(sldrLMom.getMinimum()+inc);
            //sldrLMom.setMaximum(sldrLMom.getMaximum()+inc);
            //lbLValue.setText(String.format("%.1f", (double) sldrLMom.getValue() / 100));
        }
    }//GEN-LAST:event_sldrMassStateChanged

    private void sldrLMomStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrLMomStateChanged
//        JSlider LSlider = (JSlider) evt.getSource();
//        if (!LSlider.getValueIsAdjusting()) {
//            int fps = (int) LSlider.getValue();
//            lbLValue.setText("" + fps);
//        }
        if (sldrLMom.getValueIsAdjusting()) {
            lbLValue.setText(String.format("%.1f", (double) sldrLMom.getValue() / 100));
        } else if (!sldrLMom.getValueIsAdjusting()) {
            angMom = (double) sldrLMom.getValue() / 100;
        }
    }//GEN-LAST:event_sldrLMomStateChanged

    private void rdoVenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoVenusActionPerformed
        // TODO add your handling code here:
        // When Venus Radio Button is selected!!
        choice = 1;
        sldrMass.setMajorTickSpacing(10);
        sldrMass.setMinimum(81 - 50);
        sldrMass.setMaximum(81 + 50);
        sldrMass.setValue(81);
        sldrLMom.setMajorTickSpacing(10);
        sldrLMom.setMinimum(300 - 150);
        sldrLMom.setMaximum(300 + 150);
        sldrLMom.setValue(300);
        lbMValue.setText(String.format("%.1f", (double) sldrMass.getValue() / 100));
        lbLValue.setText(String.format("%.1f", (double) sldrLMom.getValue() / 100));
    }//GEN-LAST:event_rdoVenusActionPerformed

    private void addPlanetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlanetActionPerformed
        // TODO add your handling code here:
        try {
            if (choice == 1) {
                URL url = this.getClass().getClassLoader().getResource("Resources/sVenus.png");
                img = ImageIO.read(url);
                ss.addPlanet(new Planet(mass, angMom, xScreen / 2, yScreen / 2, img));
            } else if (choice == 2) {
                URL url = this.getClass().getClassLoader().getResource("Resources/sEarth.png");
                img = ImageIO.read(url);
                ss.addPlanet(new Planet(mass, angMom, xScreen / 2, yScreen / 2, img));
            } else if (choice == 3) {
                URL url = this.getClass().getClassLoader().getResource("Resources/sMars.png");
                img = ImageIO.read(url);
                ss.addPlanet(new Planet(mass, angMom, xScreen / 2, yScreen / 2, img));
            } else if (choice == 4) {
                URL url = this.getClass().getClassLoader().getResource("Resources/sJupiter40_NEW.png");
                img = ImageIO.read(url);
                ss.addPlanet(new Planet(mass, angMom, xScreen / 2, yScreen / 2, img));
            }
            // repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addPlanetActionPerformed

    private void rdoEarthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoEarthActionPerformed
        // TODO add your handling code here:
        choice = 2;
        sldrMass.setMajorTickSpacing(10);
        sldrMass.setMinimum(100 - 50);
        sldrMass.setMaximum(100 + 50);
        sldrMass.setValue(100);
        sldrLMom.setMajorTickSpacing(10);
        sldrLMom.setMinimum(450 - 150);
        sldrLMom.setMaximum(450 + 150);
        sldrLMom.setValue(450);
        lbMValue.setText(String.format("%.1f", (double) sldrMass.getValue() / 100));
        lbLValue.setText(String.format("%.1f", (double) sldrLMom.getValue() / 100));
    }//GEN-LAST:event_rdoEarthActionPerformed

    private void rdoMarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMarsActionPerformed
        // TODO add your handling code here:
        choice = 3;
        sldrMass.setMajorTickSpacing(2);
        sldrMass.setMinimum(1);
        sldrMass.setMaximum(20);
        sldrMass.setValue(10);
        sldrLMom.setMajorTickSpacing(10);
        sldrLMom.setMinimum(0);
        sldrLMom.setMaximum(100);
        sldrLMom.setValue(60);
        lbMValue.setText(String.format("%.3f", (double) sldrMass.getValue() / 100.0));
        lbLValue.setText(String.format("%.3f", (double) sldrLMom.getValue() / 100.0));

    }//GEN-LAST:event_rdoMarsActionPerformed

    private void rdoJupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoJupiterActionPerformed
        // TODO add your handling code here:
        choice = 4;
        sldrMass.setMajorTickSpacing(50);
        sldrMass.setMinimum(31700 - 500);
        sldrMass.setMaximum(31700 + 500);
        sldrMass.setValue(31800);
        sldrLMom.setMajorTickSpacing(5000);
        sldrLMom.setMinimum(318000 - 20000);
        sldrLMom.setMaximum(318000 + 20000);
        sldrLMom.setValue(318200);
        lbMValue.setText(String.format("%.3f", (double) sldrMass.getValue() / 100));
        lbLValue.setText(String.format("%.3f", (double) sldrLMom.getValue() / 100));
    }//GEN-LAST:event_rdoJupiterActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Clears the planets from the SolarSystem object
        ss.reset();
    }//GEN-LAST:event_btnResetActionPerformed

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
    private javax.swing.JButton addPlanet;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnReset;
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
