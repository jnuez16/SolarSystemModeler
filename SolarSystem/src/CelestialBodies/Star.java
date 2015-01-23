/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CelestialBodies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

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
    
    public Star(double m)
    {
        setMass(m);
    }
    
    public Star(double m, int x, int y, int width, int height){
        setMass(m);
        this.xPos = x / 2;
        this.yPos = y / 2;
        this.width = width;
        this.height = height;
    }
    
    public void draw(Graphics2D g){
        g.setPaint(Color.YELLOW);
        g.fill(new Ellipse2D.Double(xPos, yPos, width, height));
    }
    
    public void setMass(double m)
    {
        mass = m;
    }
    
    public void setXPos(double x)
    {
        xPos = x;
    }
    
    public void setYPos(double y)
    {
        yPos = y;
    }
    
    public double getMass()
    {
        return mass;
    }
    
    public double getXPos()
    {
        return xPos;
    }
    
    public double getYPos()
    {
        return yPos;
    }
   
    
}
