/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.*;


public class Triangle implements Shape{
    
    Triangle(int l) {
        lenght=l;
        area=l*l*Math.sqrt(3)/4;
        perimeter=3*lenght;
        x=0;
        y=0;
    }
    
    public void setTriangleLenght(int l){
        lenght = l;
        area=l*l*Math.sqrt(3)/4;
        perimeter=3*lenght;
    }

    public int getTriangleLenght(){
        return lenght;
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
        java.awt.Polygon poly = new java.awt.Polygon(); 
        
        poly.addPoint(x+lenght/2, y);
        poly.addPoint(x+lenght, y+(int)getHeight());
        poly.addPoint(x, y+(int)getHeight());
        g.setColor(Color.blue);
        g.fillPolygon(poly);
        g.setColor(Color.BLACK);   
        g.drawPolygon(poly);
    }
    
    public Polygon convert(){
        Polygon t=new PolygonVect();
        
        t.add(x+lenght/2,y);
        t.add(x, y+(int)getHeight());
        t.add(x+lenght, y+(int)getHeight());
       
        return t;
    }
    
    public double getHeight(){
        
        return (lenght/2)*Math.sqrt(3);
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
    private int lenght;
    private double perimeter;
    private int x,y;
    
}
