/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolarSystem;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author bmetzelaar16
 */
public class DrawableObj {

    final int sunWidth = 50;
    final int sunHeight = 50;
    
    public void draw(Graphics2D g) {
        g.draw(new Line2D.Double(100, 100, 150, 150));
        
        Paint currPaint = g.getPaint();
        g.setPaint(Color.BLACK);
        g.draw(new Rectangle2D.Double(150, 150, 50, 50));
        g.setPaint(Color.RED);
        g.fill(new Rectangle2D.Double(151, 151, 49, 49));
        
        g.setPaint(new GradientPaint(200, 200, Color.RED, 250, 200, Color.BLACK));
        g.fill(new RoundRectangle2D.Double(200, 200, 50, 50, 10, 10));
        g.setPaint(currPaint);
        
        g.draw(new Ellipse2D.Double(100, 100, 150, 150));
    }
    
    public void drawStar(Graphics2D g, int x, int y) {
        Paint currPaint = g.getPaint();
        g.setPaint(Color.YELLOW);
        //g.draw(new Ellipse2D.Double(x, y, sunWidth, sunHeight));
        g.fill(new Ellipse2D.Double(x + 1, y + 1, sunWidth - 1, sunHeight - 1));
    }
    
}
