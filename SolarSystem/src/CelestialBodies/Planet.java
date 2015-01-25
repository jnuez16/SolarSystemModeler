/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelestialBodies;

import Calculations.Calculations;
import java.awt.Graphics2D;
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

    /**
     * Simple constructor for planet
     *
     * @param m mass of the planet
     * @param l angular momentum of the planet
     * @throws Exception if mass is less than or equal to zero
     */
    public Planet(double m, double l) throws Exception {
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, L);

    }

    /**
     * Creates a planet with specific width, height and position
     *
     * @param m mass of the planet
     * @param l angular momentum of the planet
     * @param x x position of the planet
     * @param y y position of the planet
     * @param width width of the planet
     * @param height height of the planet
     * @throws Exception if width and height is less than or equal to zero
     */
    public Planet(double m, double l, int x, int y, int width, int height) throws Exception {
        if (width <= 0 || height <= 0) {
            throw new Exception("Dimensions cannot be less than or equal to zero.");
        }
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, L);

        this.xPos = x + calc.getDistance();
        this.yPos = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a planet with image and specific position
     *
     * @param m mass of planet
     * @param l angular momentum of planet
     * @param x x position of planet
     * @param y y position of planet
     * @param img image of the planet
     * @throws Exception if image is null
     */
    public Planet(double m, double l, int x, int y, BufferedImage img) throws Exception {
        if (img == null) {
            throw new Exception("Image is null.");
        }
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, L);
        this.xPos = x + calc.getDistance();
        this.yPos = y;
        this.img = img;
    }

    
    /**
     * Draws the image of the planet
     * @param g Graphics2D
     */
    public void draw(Graphics2D g) {
        try {
            g.drawImage(img, null, (int) xPos - (img.getWidth() / 2), (int) yPos - (img.getHeight() / 2));
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Mutator function for mass
     * @param m mass of the planet
     * @throws Exception if mass is less than or equal to zero
     */
    public void setMass(double m) throws Exception {
        if(m <= 0){
            throw new Exception("Mass cannot be less than or equal to zero.");
        }
        mass = m;
    }

    /**
     * Mutator function for angular momentum
     * @param l angular momentum of the planet
     */
    public void setAngMomen(double l) {
        L = (l * (1e15));
    }
    /**
     * Mutator function for x position
     * @param x x position
     */

    public void setXPos(double x) {
        xPos = x;
    }

    /**
     * Mutator function for y position
     * @param y y position
     */
    public void setYPos(double y) {
        yPos = y;
    }

    /**
     * Accessor function for mass
     * @return a double indicating mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * Accessor function for angular momentum
     * @return a double indicating the angular momentum
     */
    public double getAngMomen() {
        return L;
    }

    /**
     * Accessor function for x position
     * @return  a double indicating the x position
     */
    public double getXPos() {
        return xPos;
    }

    /**
     * Accessor function for x position dependent upon time
     * @param t time used to calculate theta
     * @param x x position of the planet
     * @return a double indicating the x position dependent upon time
     */
    public double getXPos(double t, double x) {
        return (calc.getDistance() * Math.cos(calc.theta(t))) + x;
    }

    /**
     * Accessor function for y position
     * @return a double indicating the y position
     */
    public double getYPos() {
        return yPos;
    }

    /**
     * Accessor function for x position dependent upon time
     * @param t time used to calculate theta
     * @param y y position of the planet
     * @return a double indicating the x position dependent upon time
     */
    public double getYPos(double t, double y) {
        return (calc.getDistance() * Math.sin(calc.theta(t))) + y;
    }

    /**
     * Accessor function for calculations
     * @return a calculation class with data of the planet
     */
    public Calculations useCalculate() {
        return calc;
    }

}
