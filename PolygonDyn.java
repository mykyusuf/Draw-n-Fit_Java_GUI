/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.util.Vector;

public class PolygonDyn extends Polygon{
    public class point {
        public int x,y;
        
    }
    public void add(int x,int y){
        point t=new point();
        t.x=x;
        t.y=y;
        point[] tmp = new point[size+1];
        for(int i=0;i<size;i++){
            tmp[i]=p[i];
        }
        tmp[size]=t;
        p=tmp;
        size++;
    }
    public int getX(int i){
        return p[i].x;
    }
    public int getSize(){
        return size;
    }
    public int getY(int i){
        return p[i].y;
    }
    public point[] p=new point[1];
    private int size=0;
}
