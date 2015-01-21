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
public class Calculations {

    private double del = Math.pow(10, -6);
    private double distance;
    private double delta;

    public double secant(int n, double del, double x, double dx) {
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
            System.out.println("Convergence not found after " + n + " iterations.");
        }
        return x1;
    }
    
    public double g(double x)
    {
        return x; //write a function here
    }
    
    //Method to provide function f(x) = -dg(x)/dy
    public double f(double x)
    {
        return x; //write a function here
    }
    
    public double getDistance()
    {
        return distance;
    }
    
}
