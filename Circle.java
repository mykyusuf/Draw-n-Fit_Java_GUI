/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.*;

/**
 *
 * @author MacbookPro
 */
public class Circle implements Shape{
    
    Circle(int r) {
        radius=r;
        area=(3.14)*radius*radius;
        perimeter=2*3.14*radius;
        x=0;
        y=0;
    }
    
    public void setTCircleRadius(int r){
        radius = r;
        area=(3.14)*radius*radius;
        perimeter=2*3.14*radius;
    }

    public int getCircleRadius(){
        return radius;
    }

    public void setX(int i){
        x=i;
    }
    public void setY(int j){
        y=j;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
    
    public void draw(Graphics g){        
        g.fillOval(x, y, radius, radius);
        g.setColor(Color.BLACK);   
        g.drawOval(x, y, radius, radius);
    }
    
    public Polygon convert(){
        Polygon t=new PolygonVect();
        
        t.add(x+radius/2, y);
        t.add(x, y+radius/2);
        t.add(x+radius, y+radius/2);
        t.add(x+radius/2, y+radius);
       
        return t;
    }
    public void increment(){
        x+=1;
    }
    public void decrement(){
        x-=1;
    }
    public int compareTo(Shape st){
        if(area==st.getArea())
            return 1;
        else
            return 0;
    }
    
    private double area;
    private int radius;
    private double perimeter;
    private int x,y;
    
}

