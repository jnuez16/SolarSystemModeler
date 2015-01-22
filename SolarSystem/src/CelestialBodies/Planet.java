/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelestialBodies;
import Calculations.Calculations;

/**
 *
 * @author jnuez_000
 */
public class Planet {

    private double mass;
    private double L;
    private double xPos;
    private double yPos;
    private Calculations calc = new Calculations();
    
    public Planet(double m, double l)
    {
        setMass(m);
        setAngMomen(l);
    }

    public void setMass(double m) {
        mass = m;
    }

    public void setAngMomen(double l) {
        L = (l*(1e15));
    }
    
    public void setXPos(double x)
    {
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

    public double getXPos()
    {
        return xPos;
    }
    
    public double getYPos()
    {
        return yPos;
    }
    
    public double distance(double starMass)
    {
        calc.setValues(starMass, getMass(), getAngMomen());
        return calc.distance(); 
    }
    
}
