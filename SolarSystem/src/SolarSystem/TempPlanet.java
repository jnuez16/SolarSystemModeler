/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Brennan
 */
public class TempPlanet {
    
    private int x;
    private int y;
    private final int init_x;   // based on distance from sun (pos of sun + distance)
    private final int init_y;   // center of horizontal axis
    private final int width;
    private final int height;
    
    public TempPlanet(int x, int y, int width, int height){
        // NOT DONE
        this.init_x = x;
        this.init_y = y;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void draw(Graphics2D g) {
//        Paint currPaint = g.getPaint();
//        g.setPaint(Color.YELLOW);
//        //g.draw(new Ellipse2D.Double(x, y, sunWidth, sunHeight));
//        g.fill(new Ellipse2D.Double(x + 1, y + 1, width - 1, height - 1));
    }
    
    public void reset(){
        x = init_x;
        y = init_y;
    }
}
