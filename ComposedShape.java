/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MacbookPro
 */
public class ComposedShape implements Shape{
    
    ComposedShape(Rectangle Container,Rectangle Inner){
        
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                v.addElement(Container);
                for(int i=0;i<Container.getRectangleWidth()/Inner.getRectangleWidth();i++){
        
                    for(int j=0;j<Container.getRectangleHeight()/Inner.getRectangleHeight();j++){            

                        Rectangle temp = new Rectangle(Inner.getRectangleWidth(),Inner.getRectangleHeight());
                        temp.setX(i*Inner.getRectangleWidth());
                        temp.setY(j*Inner.getRectangleHeight());
                        v.addElement(temp);
                        
                    }
        
                }
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getRectangleWidth(),Container.getRectangleHeight());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
        
    }
    ComposedShape(Rectangle Container,Triangle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                v.addElement(Container);
                for(int i=0;i<Container.getRectangleWidth()/Inner.getTriangleLenght();i++){
        
                    for(int j=0;j<Container.getRectangleHeight()/Inner.getHeight();j++){            

                        Triangle temp = new Triangle(Inner.getTriangleLenght());
                        temp.setX(i*Inner.getTriangleLenght());
                        temp.setY(j*((int)Inner.getHeight()));
                        v.addElement(temp);
                        
                    }
        
                }
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getRectangleWidth(),Container.getRectangleHeight());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
        
    }
    ComposedShape(Rectangle Container,Circle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                v.addElement(Container);
                for(int i=0;i<Container.getRectangleWidth()/(Inner.getCircleRadius());i++){
        
                    for(int j=0;j<Container.getRectangleHeight()/(Inner.getCircleRadius());j++){            

                        Circle temp = new Circle(Inner.getCircleRadius());
                        temp.setX(i*Inner.getCircleRadius());
                        temp.setY(j*Inner.getCircleRadius());
                        v.addElement(temp);
                        
                    }
        
                }
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getRectangleWidth(),Container.getRectangleHeight());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }
    ComposedShape(Triangle Container,Rectangle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                v.addElement(Container);
                for(int i=0;i<((Container.getTriangleLenght()-2*Inner.getRectangleHeight())/Inner.getRectangleWidth())-1;i++){
        
                    for(int j=i;j<Container.getHeight()/(Inner.getRectangleHeight())-1;j++){            

                        Rectangle temp = new Rectangle(Inner.getRectangleWidth(),Inner.getRectangleHeight());
                        temp.setX(Container.getTriangleLenght()/2-3*(Inner.getRectangleWidth()/2)+(i+1)*temp.getRectangleWidth() -j*(temp.getRectangleWidth()-(int)(temp.getRectangleHeight()/Math.sqrt(3))));
                        temp.setY(j*temp.getRectangleHeight());
                        v.addElement(temp);
                        
                    }
        
                }
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getTriangleLenght(),(int)Container.getHeight());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }
    ComposedShape(Triangle Container,Triangle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                v.addElement(Container);
                for(int i=0;i<(Container.getHeight()/Inner.getHeight())-1;i++){
        
                    for(int j=0;j<=i;j++){            

                        Triangle temp = new Triangle(Inner.getTriangleLenght());
                        temp.setX(Container.getTriangleLenght()/2-Inner.getTriangleLenght()/2-i*(Inner.getTriangleLenght()/2)+(j*Inner.getTriangleLenght()));
                        temp.setY((int)(i*temp.getHeight()));
                        v.addElement(temp);
                        
                    }
        
                }
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getTriangleLenght(),(int)Container.getHeight());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }
    ComposedShape(Triangle Container,Circle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                v.addElement(Container);
                for(int i=0;i<(Container.getHeight()/Inner.getCircleRadius())-1;i++){
        
                    for(int j=0;j<=i;j++){            

                        Circle temp = new Circle(Inner.getCircleRadius());
                        temp.setX(Container.getTriangleLenght()/2-Inner.getCircleRadius()/2-i*(Inner.getCircleRadius()/2)+(j*Inner.getCircleRadius()));
                        temp.setY((i*temp.getCircleRadius())+temp.getCircleRadius()/2);
                        v.addElement(temp);
                        
                    }
        
                }
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getTriangleLenght(),(int)Container.getHeight());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }
    ComposedShape(Circle Container,Rectangle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                int temp2=0,sh=0,sw=0;
                sh=Inner.getRectangleHeight();
                sw=Inner.getRectangleWidth();
                //dortgenin uzun tarafini yatay alir
                if(Inner.getRectangleHeight()>Inner.getRectangleWidth()){
                    temp2=sh;
                    sh=sw;
                    sw=temp2;
                }
                v.addElement(Container);
                               
                for(int i=0;i<((Container.getCircleRadius()/2)/sw);i++){
                    for(int j=i;j<Container.getCircleRadius()/sh-i;j++){

                        Rectangle temp = new Rectangle(Inner.getRectangleWidth(),Inner.getRectangleHeight());
                        temp.setX(Container.getCircleRadius()/2-(i*sw)-sw/2);
                        temp.setY(j*sh);
                        v.addElement(temp);

                    }

                }
                for(int i=1;i<((Container.getCircleRadius()/2)/sw);i++){
                    for(int j=i;j<Container.getCircleRadius()/sh-i;j++){

                        Rectangle temp = new Rectangle(Inner.getRectangleWidth(),Inner.getRectangleHeight());
                        temp.setX(Container.getCircleRadius()/2+(sw*i)-sw/2);
                        temp.setY(j*sh);
                        v.addElement(temp);

                    }

                }
                
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getCircleRadius(),(int)Container.getCircleRadius());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }
    ComposedShape(Circle Container,Triangle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                
                v.addElement(Container);
                               
                for(int i=0;i<((Container.getCircleRadius()/2)/Inner.getTriangleLenght());i++){
                    for(int j=i;j<Container.getCircleRadius()/Inner.getHeight()-i;j++){

                        Triangle temp = new Triangle(Inner.getTriangleLenght());
                        temp.setX(Container.getCircleRadius()/2-(i*Inner.getTriangleLenght())-(int)Inner.getHeight()/2);
                        temp.setY((int)(j*Inner.getHeight()));
                        v.addElement(temp);

                    }

                }
                for(int i=1;i<((Container.getCircleRadius()/2)/Inner.getTriangleLenght());i++){
                    for(int j=i;j<Container.getCircleRadius()/Inner.getHeight()-i;j++){

                        Triangle temp = new Triangle(Inner.getTriangleLenght());
                        temp.setX(Container.getCircleRadius()/2+(Inner.getTriangleLenght()*i)-Inner.getTriangleLenght()/2);
                        temp.setY((int)(j*Inner.getHeight()));
                        v.addElement(temp);

                    }

                }
                
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getCircleRadius(),(int)Container.getCircleRadius());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }
    ComposedShape(Circle Container,Circle Inner){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                
                v.addElement(Container);
                               
                for(int i=0;i<((Container.getCircleRadius()/2)/Inner.getCircleRadius());i++){
                    for(int j=i;j<Container.getCircleRadius()/Inner.getCircleRadius()-i;j++){

                        Circle temp = new Circle(Inner.getCircleRadius());
                        temp.setX(Container.getCircleRadius()/2-(i*Inner.getCircleRadius())-Inner.getCircleRadius()/2);
                        temp.setY((j*Inner.getCircleRadius()));
                        v.addElement(temp);

                    }

                }
                for(int i=1;i<((Container.getCircleRadius()/2)/Inner.getCircleRadius());i++){
                    for(int j=i;j<Container.getCircleRadius()/Inner.getCircleRadius()-i;j++){

                        Circle temp = new Circle(Inner.getCircleRadius());
                        temp.setX(Container.getCircleRadius()/2+(Inner.getCircleRadius()*i)-Inner.getCircleRadius()/2);
                        temp.setY((j*Inner.getCircleRadius()));
                        v.addElement(temp);

                    }

                }
                
                draw(g);

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(Container.getCircleRadius(),(int)Container.getCircleRadius());
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
        
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
    public void increment(){
        for(int i=0;i<v.size();i++){
            v.get(i).increment();
        }
    }
    public void decrement(){
        for(int i=0;i<v.size();i++){
            v.get(i).decrement();
        }
    }
    public int compareTo(Shape st){
        if(area==st.getArea())
            return 1;
        else
            return 0;
    }
    public void draw(Graphics g) {

        Vector<java.awt.Polygon> p = new Vector<java.awt.Polygon>();
        g.setColor(Color.red);
        v.get(0).draw(g);
        for(int i=1; i< v.size(); i++){
            g.setColor(Color.blue);
            v.get(i).draw(g);
            
        }
    }
    public Polygon convert(){
        Polygon p=new PolygonVect();
        return p;
    }
    private double area;
    private double perimeter;
    private Vector<Shape> v = new Vector<Shape>();
}
