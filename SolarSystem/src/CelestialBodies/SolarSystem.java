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

    public void addPlanet(double mass, double l) {
        planet.add(new Planet(mass, l));
    }

    public void addPlanet(Planet p) {
        planet.add(p);
    }

    public void addStar(double mass) {
        star.add(new Star(mass));
    }

    public void addStar(Star s) {
        star.add(s);
    }

    public List<Planet> getPlanets() {
        return planet;
    }

    public List<Star> getStars() {
        return star;
    }

    public void simulate(double t, int x, int y) {
//        if (!star.isEmpty()) {
//
//        }
        
        if(!planet.isEmpty()){
            for(int i = 0; i < planet.size(); i++){
                planet.get(i).setXPos(planet.get(i).getXPos(t, x));
                planet.get(i).setYPos(planet.get(i).getYPos(t, y));
            }
        }
    }
    
    public void reset(){
        star.clear();
        planet.clear();
    }

}
