/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;
/**
 *
 * @author MacbookPro
 */
public class Rectangle implements Shape{

    Rectangle(int w,int h) {
        width=w;
        height=h;
        area=width*height;
        perimeter=2*(width+height);
        x=0;
        y=0;
    }
    
    public void setRectangleWidth(int w){
        width=w;
        area=width*height;
        perimeter=2*(width+height);
    }
    public void setRectangleHeight(int h){
        height=h;
        area=width*height;
        perimeter=2*(width+height);
    }
    public int getRectangleWidth(){
        return width;
    }
    public int getRectangleHeight(){
        return height;
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
    public void setArea(int x){
        area=x;
    }
    public double getPerimeter(){
        return perimeter;
    }
    
    public void draw(Graphics g){ 
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
        g.setColor(Color.BLACK);   
        g.drawRect(x,y, width, height);
        

    }
    
    public Polygon convert(){
        Polygon t=new PolygonVect();
        
        t.add(x, y);
        t.add(x+width, y);
        t.add(x+width, y+height);
        t.add(x, y+height);
       
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
    private int width;
    private int height;
    private double perimeter;
    private int x,y;
    
}

