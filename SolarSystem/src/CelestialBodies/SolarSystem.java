/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelestialBodies;
import java.util.*;

/**
 *
 * @author jnuez_000
 */
public class SolarSystem {
    private List<Planet> planet = new ArrayList<Planet>();
    private List<Star> star = new ArrayList<Star>();
    
    public void addPlanet(double mass, double l)
    {
        planet.add(new Planet(mass, l));
    }
    
    // BCM: Added, needs testing
    public void addPlanet(double mass, double l, int x, int y, int width, int height){
        planet.add(new Planet(mass, l, x, y, width, height));
    }
    
    public void addStar(double mass)
    {
        star.add(new Star(mass));
    }
    
    public List<Planet> getPlanets()
    {
        return planet;
    }
    
    public List<Star> getStars()
    {
        return star;
    }
    
    
}
