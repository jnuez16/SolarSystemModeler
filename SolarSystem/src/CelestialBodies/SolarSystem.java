/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CelestialBodies;

import java.util.*;

/**
 * Contains a List of planets, a List of stars, and a method for updating the
 * coordinates of all of the planets and stars that are contained within the List.
 * @author jnuez_000
 */
public class SolarSystem {

    private List<Planet> planet = new ArrayList<Planet>();
    private List<Star> star = new ArrayList<Star>();

    /**
     * Adds a planet to a List of planets
     * @param mass mass of the planet being added
     * @param l angular momentum of the planet being added
     * @throws Exception if mass is less than or equal to zero
     */
    public void addPlanet(double mass, double l) throws Exception {
        planet.add(new Planet(mass, l));
    }

    /**
     * Adds a planet to a List of planets
     * @param p Planet with specified values
     */
    public void addPlanet(Planet p) {
        planet.add(p);
    }

    /**
     * Adds a star to a list of stars
     * @param mass mass of the star
     * @throws Exception if mass is less than or equal to zero
     */
    public void addStar(double mass) throws Exception {
        star.add(new Star(mass));
    }

    /**
     * Adds a star to a list of stars
     * @param s Star with specified values
     */
    public void addStar(Star s) {
        star.add(s);
    }

    /**
     * Accessor function for the list of planets
     * @return a List of planets
     */
    public List<Planet> getPlanets() {
        return planet;
    }

    /**
     * Accessor function for the list of stars
     * @return a List of stars
     */
    public List<Star> getStars() {
        return star;
    }

    /**
     * A function that sets the position of the stars and planets at a specific time
     * @param t time to indicate the position of planets and stars
     * @param x x position of planets and stars
     * @param y y position of planets and stars
     */
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
    
    /**
     * clears the list of stars and planets
     */
    public void reset(){
        star.clear();
        planet.clear();
    }

}
