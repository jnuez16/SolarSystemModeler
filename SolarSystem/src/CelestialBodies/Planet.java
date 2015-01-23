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
    private Calculations calc = null;
    
    public Planet(double m, double l)
    {
        setMass(m);
        setAngMomen(l);
        calc = new Calculations(m, l);
        
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
    
    public double getXPos(double t)
    {
        return calc.distance*Math.cos(calc.theta(t));
    }
    
    
    public double getYPos()
    {
        return yPos;
    }
    
    public double getYPos(double t)
    {
        return calc.distance*Math.sin(calc.theta(t));
    }
    
//    public double distance(double starMass)
//    {
//        calc.setValues(starMass, getMass(), getAngMomen());
//        return calc.distance(); 
//    }
    
    public Calculations useCalculate()
    {
        return calc;
    }
    
}
