/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

/**
 *
 * @author jnuez_000
 */
public class Calculations {

    static final Double G = 6.67384e-11;
    private Double M;
    private Double m;
    private Double l;
    private Double distance;
    private Double dist;

    /**
     * Initialize values for calculating the distance between two celestial body
     * Mass of the star is initialized as 333054.25*(Mass of Earth)--Mass of the
     * sun
     *
     * @param planetMass mass of the planet to use in the calculation must be a
     * factor of Earth's mass
     * @param angMomentum angular momentum of the planet
     */
    public Calculations(Double planetMass, Double angMomentum) throws Exception {
        if (planetMass <= 0) {
            throw new Exception("Planet must have a mass!");
        }
        m = planetMass;
        l = angMomentum;
        M = 333054.253182;
        dist = distance() / 5.972e24;
        distance = (dist * 1e-9) / 2;
    }

    /**
     * Initialize values for calculating the distance between two celestial body
     * Mass of the star can be initialized in this constructor
     *
     * @param starMass mass of the star to be considered for calculation--must
     * be a factor of Earth's mass
     * @param planetMass mass of the planet to use in the calculation--must be a
     * factor of Earth's mass
     * @param angMomentum angular momentum of the planet
     */
    public Calculations(Double starMass, Double planetMass, Double angMomentum) throws Exception {
        if (planetMass <= 0 || starMass <= 0) {
            throw new Exception("Mass must not be equal to or less than zero.");
        }
        M = starMass;
        l = angMomentum;
        m = planetMass;
        dist = distance() / 5.972e24;
        distance = (dist * 1e-9) / 2;
    }

    /**
     * Calculates the distance between the star and the planet
     *
     * @return a Double indicating the distance
     */
    public Double distance() {
        Double del = 1e-6, r = 2.0, dr = 0.1;
        int n = 10000;
        r = secant(n, del, r, dr);

        return r;
    }

    /**
     * Accessor function for the distance lowered by a factor of 10^9
     *
     * @return a Double indicating the distance
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Secant method to approximate the root of a function of a specific value
     *
     * @param n number of data points to consider
     * @param del accepted error
     * @param x first guess
     * @param dx change in x
     * @return a Double indicating the root
     */
    public Double secant(int n, Double del, Double x, Double dx) {
        int k = 0;
        Double x1 = x + dx, x2 = 0.0;
        Double g0 = g(x);
        Double g1 = g(x1);
        if (g1 > g0) {
            x1 = x - dx;
        }
        while ((Math.abs(dx) > del) && (k < n)) {

            Double d = f(x1) - f(x);
            dx = -(x1 - x) * f(x1) / d;
            x2 = x1 + dx;
            if (Double.isNaN(x2) || Double.isInfinite(x2)) {
                break;
            }
            Double g2 = g(x2);
            if (g2 > g1) {
                x2 = x1 - dx;
            }
            x = x1;
            x1 = x2;
            g1 = g2;
            k++;
        }
        if (k == n) {
            System.out.println("Convergence not"
                    + " found after " + n + " iterations.");
        }
        return x1;
    }

    /**
     * Function to be considered for secant method
     *
     * @param x a guess for the root
     * @return a Double indicating the value of the function at the specified x
     */
    public Double g(Double x) {
        Double u = ((-(G * m * M) / x) + (((l * l) / (2 * x * x)) * ((m + M) / (m * M))));
        return u;
    }

    /**
     * Derivative of the function to be considered for the secant method
     *
     * @param x a guess for the root
     * @return a Double indicating the first derivative value at the specified x
     */
    public Double f(Double x) {
        Double u = ((-(G * m * M) / (x * x)) + (((l * l) / (x * x * x)) * ((m + M) / (m * M))));
        return u;
    }

    /**
     * Calculates the time it takes for a planet to make a full revolution
     *
     * @return a Double indicating the time it takes to make a complete
     * revolution
     */
    public Double time() {
        return (((2 * Math.PI) * m * dist * dist) / l) / 86400;
    }

    /**
     * Calculates the angle of the planet at a specific time
     *
     * @param t specific time to be considered to angle calculation
     * @return a Double indicating the angle
     */
    public Double theta(Double t) {
        return t * ((2 * Math.PI) / time());
    }
}
