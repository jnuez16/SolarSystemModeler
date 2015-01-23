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
    private static Double M;
    private static Double m;
    private static Double l;
    public static Double distance;
    private static Double dist;

    public Calculations(Double planetMass, Double angMomentum) {
        m = planetMass;
        l = angMomentum;
        M = 333054.253182;
        dist = distance()/5.972e24;
        distance = dist * 1e-9;
    }

    public void setValues(Double starMass, Double planetMass, Double angMomentum) {
        M = starMass;
        l = angMomentum;
        m = planetMass;
        dist = distance()/5.972e24;
        distance = dist * 1e-9;
    }

    public Double distance() {
        Double del = 1e-6, r = 2.0, dr = 0.1;
        int n = 10000;
        r = secant(n, del, r, dr);

        return r;
    }

    public static Double secant(int n, Double del, Double x, Double dx) {
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

    public static Double g(Double x) {
        Double u = ((-(G * m * M) / x) + (((l * l) / (2 * x * x)) * ((m + M) / (m * M))));
        return u;
    }

    public static Double f(Double x) {
        Double u = ((-(G * m * M) / (x * x)) + (((l * l) / (x * x * x)) * ((m + M) / (m * M))));
        return u;
    }

    public Double time() {
        return (((2 * Math.PI) * m * dist * dist) / l)/86400;
    }

    public Double theta(Double t) {
        return t*((2*Math.PI)/time());
    }
}
