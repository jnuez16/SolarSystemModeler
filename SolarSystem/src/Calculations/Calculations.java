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

    static final double G = 6.67384e-11;
    static double M;
    static double m;
    static double l;

    public void setValues(double starMass, double planetMass, double angMomentum) {
        M = starMass;
        l = angMomentum;
        m = planetMass;
    }

    public double distance() {
        double del = 1e-6, r = 2, dr = 0.1;
        int n = 10000;

        return secant(n, del, r, dr);
    }

    public static double secant(int n, double del, double x, double dx) {
        int k = 0;
        double x1 = x + dx, x2 = 0;
        double g0 = g(x);
        double g1 = g(x1);
        if (g1 > g0) {
            x1 = x - dx;
        }
        while ((Math.abs(dx) > del) && (k < n)) {

            double d = f(x1) - f(x);
            dx = -(x1 - x) * f(x1) / d;
            x2 = x1 + dx;
            double g2 = g(x2);
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

    public static double g(double x) {
        double u = ((-(G * m * M) / x) + (((l * l) / (2 * x * x)) * ((m + M) / (m * M))));
        return u;
    }

    public static double f(double x) {
        double u = ((-(G * m * M) / (x * x)) + (((l * l) / (x * x * x)) * ((m + M) / (m * M))));
        return u;
    }
}
