/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.util.Vector;

public class PolygonVect extends Polygon{
    
    public class point {
        public int x,y;
        
    }
    public void add(int x,int y){
        point t=new point();
        t.x=x;
        t.y=y;
        p.add(t);
        size++;
    }
    public int getX(int i){
        return p.get(i).x;
    }
    public int getSize(){
        return size;
    }
    public int getY(int i){
        return p.get(i).y;
    }
    public Vector<point> p = new Vector<point>();
    private int size=0;
}
