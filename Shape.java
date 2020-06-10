/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;
import java.awt.Graphics;

public interface Shape extends Comparable<Shape>{
    public double getArea();
    public double getPerimeter();
    public void increment();
    public void decrement();
    @Override
    public int compareTo(Shape st);  
    public void draw(Graphics g);
    public Polygon convert();
    
}
