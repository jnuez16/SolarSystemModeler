/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelestialBodies;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author jnuez16
 */
public class Star {

    private double mass;
    private double xPos;
    private double yPos;
    private int width = 50;  // the size that the star will show as on the screen
    private int height = 50;
    private BufferedImage img = null;

    public Star(double m) throws Exception {
        setMass(m);
    }

    public Star(double m, int x, int y, int width, int height) throws Exception {
        if ((width <= 0) || (height <= 0)) {
            throw new Exception("Star cannot have values of <=0.\n");
        }

        setMass(m);
        this.xPos = x / 2;
        this.yPos = y / 2;
        this.width = width;
        this.height = height;
    }

    public Star(double m, int x, int y, BufferedImage img) throws Exception {
        if (img == null) {
            throw new NullPointerException("Star image value is null.\n");
        }

        setMass(m);
        this.xPos = x / 2;
        this.yPos = y / 2;
        this.img = img;
        this.width = img.getWidth();
        this.height = img.getHeight();
    }

    public void draw(Graphics2D g) {
        try {
            g.drawImage(img, null, (int) xPos - (img.getWidth() / 2), (int) yPos - (img.getHeight() / 2));
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMass(double m) throws Exception {
        if (m <= 0) {
            throw new Exception("Star mass must be greater than 0.\n");
        }
        mass = m;
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

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

}
