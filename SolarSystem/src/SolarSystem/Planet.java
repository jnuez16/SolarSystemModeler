/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

/**
 *
 * @author jnuez_000
 */
public class Planet {
    private double mass;
    private double radius;
    
    public void setMass(double m)
    {
        mass = m;
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public double getMass()
    {
        return mass;
    }
    
    public double getRadius()
    {
        return radius;
    }
}
