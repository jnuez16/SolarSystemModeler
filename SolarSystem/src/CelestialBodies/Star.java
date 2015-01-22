/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CelestialBodies;

/**
 *
 * @author jnuez16
 */
public class Star {
    private double mass;
    private double xPos;
    private double yPos;
    
    public Star(double m)
    {
        setMass(m);
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
