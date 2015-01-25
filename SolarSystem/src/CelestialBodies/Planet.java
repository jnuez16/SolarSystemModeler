/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelestialBodies;

import Calculations.Calculations;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author jnuez_000
 */
public class Planet {

    private double mass;
    private double L;
    private double xPos;
    private double yPos;
    private int width = 50;
    private int height = 50;
    private Calculations calc = null;
    BufferedImage img = null;

    public Planet(double m, double l) throws Exception {
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, L);

    }

    public Planet(double m, double l, int x, int y, int width, int height) throws Exception {
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, L);

        this.xPos = x + calc.getDistance();
        this.yPos = y;
        this.width = width;
        this.height = height;
    }
    
    public Planet(double m, double l, int x, int y, BufferedImage img) throws Exception
    {
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, L);
        this.xPos = x + calc.getDistance();
        this.yPos = y;
        this.img = img;
    }

//    public void draw(Graphics2D g) {
//        g.setPaint(Color.BLUE);
//        g.fill(new Ellipse2D.Double(xPos, yPos, width, height));
//    }
    public void draw(Graphics2D g) {
        if (img != null) {
            g.drawImage(img, null, (int)xPos-(img.getWidth()/2), (int)yPos-(img.getHeight()/2));
        } 
    }

    public void setMass(double m) {
        mass = m;
    }

    public void setAngMomen(double l) {
        L = (l * (1e15));
    }

    public void setXPos(double x) {
        xPos = x;
    }

    public void setYPos(double y) {
        yPos = y;
    }

    public double getMass() {
        return mass;
    }

    public double getAngMomen() {
        return L;
    }

    public double getXPos() {
        return xPos;
    }

    public double getXPos(double t, double x) {
        return (calc.getDistance() * Math.cos(calc.theta(t))) + x;
    }

    public double getYPos() {
        return yPos;
    }

    public double getYPos(double t, double y) {
        return (calc.getDistance() * Math.sin(calc.theta(t))) + y;
    }

//    public double distance(double starMass)
//    {
//        calc.setValues(starMass, getMass(), getAngMomen());
//        return calc.distance(); 
//    }
    public Calculations useCalculate() {
        return calc;
    }

}
