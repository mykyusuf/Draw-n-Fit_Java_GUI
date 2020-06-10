/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Javagui {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(600,400);
        Rectangle r2 = new Rectangle(20,30);
        Triangle t1 = new Triangle(600);
        Triangle t2 = new Triangle(20);
        Circle c1 = new Circle(500);
        Circle c2 = new Circle(50);
        
       /* 
        ComposedShape cmp=new ComposedShape(r1, r2);
        ComposedShape cmp1=new ComposedShape(r1, c2);
        ComposedShape cmp2=new ComposedShape(r1, t2);
        ComposedShape cmp3=new ComposedShape(c1, r2);
        ComposedShape cmp4=new ComposedShape(c1, c2);
        ComposedShape cmp5=new ComposedShape(c1, t2);
        ComposedShape cmp6=new ComposedShape(t1, r2);
        ComposedShape cmp7=new ComposedShape(t1, c2);
        ComposedShape cmp8=new ComposedShape(t1, t2);
        */
        
        //Shape[] s1 = {c1,r1,t1};
        //drawAll(s1);
        
        
        basla();
        
        
    }
    public static void drawAll(Shape[] s){
        JFrame mainMap=new JFrame();
        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                for(int i=0;i<s.length;i++){
                    s[i].draw(g);
                    System.out.println(s[i].getArea());
                }
        
                

            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1000,1000);
            }
        };
        
        mainMap.add(p);
        mainMap.pack();        
        mainMap.setVisible(true);
    }
    public static Polygon[] convertAll(Shape[] s){
    
        Polygon[] s2 = new Polygon[s.length];
        
        for(int i=0;i<s.length;i++){
                    
            s2[i]=s[i].convert();
            
        }
        
        return s2;
    
    }
    public static Shape[] sortShapes(Shape[] s){
        
        return s;
    
    }
    public static void basla(){
        
        JLabel C = new JLabel();
        JLabel I = new JLabel();
        
        JLabel message = new JLabel();
        
        JFrame mainMap=new JFrame();
        JPanel j = new JPanel();
        JTextField t = new JTextField();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        JTextField t5 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();
        
        JButton rect = new JButton("Rectangle");
        JButton tri = new JButton("Triangle");
        JButton circ = new JButton("Circle");
        JButton rect2 = new JButton("Rectangle");
        JButton tri2 = new JButton("Triangle");
        JButton circ2 = new JButton("Circle");
        JButton draww = new JButton("Draw");
        JLabel l = new JLabel("Select Container Shape");
        JLabel l2 = new JLabel("Select Inner Shape");
        
        JLabel l3 = new JLabel("Width");
        JLabel l4 = new JLabel("Height");
        JLabel l5 = new JLabel("Length");
        JLabel l6 = new JLabel("Radius");
        
        JLabel l7 = new JLabel("Width");
        JLabel l8 = new JLabel("Height");
        JLabel l9 = new JLabel("Length");
        JLabel l10 = new JLabel("Radius");
        
        rect.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            C.setText("Rectangle");            
        }          
        });
        tri.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            C.setText("Triangle");
        }          
        });
        circ.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            C.setText("Circle");
        }          
        });
        rect2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            I.setText("Rectangle");            
        }          
        });
        tri2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            I.setText("Triangle");
        }          
        });
        circ2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            I.setText("Circle");
        }          
        });
        
        draww.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ComposedShape m ;
            if(C.getText()=="Rectangle"){
                if(I.getText()=="Rectangle"){
                    if(!t.getText().isEmpty() && !t1.getText().isEmpty() && !t4.getText().isEmpty() && !t5.getText().isEmpty()){
                    Rectangle Container = new Rectangle(Integer.parseInt(t.getText()), Integer.parseInt(t1.getText()));
                    Rectangle Inner = new Rectangle(Integer.parseInt(t4.getText()), Integer.parseInt(t5.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Width and Heights !");
                    }
                }
                else if(I.getText()=="Triangle"){
                    if(!t.getText().isEmpty() && !t1.getText().isEmpty() && !t6.getText().isEmpty()){
                    Rectangle Container = new Rectangle(Integer.parseInt(t.getText()), Integer.parseInt(t1.getText()));
                    Triangle Inner = new Triangle(Integer.parseInt(t6.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Width and Heights and Lenght !");
                    }
                    
                }
                else if(I.getText()=="Circle"){
                    if(!t.getText().isEmpty() && !t1.getText().isEmpty() && !t7.getText().isEmpty()){
                    Rectangle Container = new Rectangle(Integer.parseInt(t.getText()), Integer.parseInt(t1.getText()));
                    Circle Inner = new Circle(Integer.parseInt(t7.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Width and Heights and Radius!");
                    }
                    
                }
                else{
                    message.setText("Please Select Shapes !"); 
                }
                
            }
            else if(C.getText()=="Triangle"){
                if(I.getText()=="Rectangle"){
                    if(!t2.getText().isEmpty() && !t4.getText().isEmpty() && !t5.getText().isEmpty()){
                    Triangle Container = new Triangle(Integer.parseInt(t2.getText()));
                    Rectangle Inner = new Rectangle(Integer.parseInt(t4.getText()), Integer.parseInt(t5.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Lenght and Width and Height !");
                    }
                }
                else if(I.getText()=="Triangle"){
                    if(!t2.getText().isEmpty() && !t6.getText().isEmpty() ){
                    Triangle Container = new Triangle(Integer.parseInt(t2.getText()));
                    Triangle Inner = new Triangle(Integer.parseInt(t6.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Lenghts !");
                    }
                    
                }
                else if(I.getText()=="Circle"){
                    if(!t2.getText().isEmpty() && !t7.getText().isEmpty() ){
                    Triangle Container = new Triangle(Integer.parseInt(t2.getText()));
                    Circle Inner = new Circle(Integer.parseInt(t7.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Lenght and Radius !");
                    }
                    
                }
                else{
                    message.setText("Please Select Shapes !"); 
                }
            }
            else if(C.getText()=="Circle"){
                if(I.getText()=="Rectangle"){
                    if(!t3.getText().isEmpty() && !t4.getText().isEmpty() && !t5.getText().isEmpty()){
                    Circle Container = new Circle(Integer.parseInt(t3.getText()));
                    Rectangle Inner = new Rectangle(Integer.parseInt(t4.getText()), Integer.parseInt(t5.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Radius and Width and Height !");
                    }
                    
                }
                else if(I.getText()=="Triangle"){
                    if(!t3.getText().isEmpty() && !t6.getText().isEmpty()){
                    Circle Container = new Circle(Integer.parseInt(t3.getText()));
                    Triangle Inner = new Triangle(Integer.parseInt(t6.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                    else{
                        message.setText("Please Enter Radius and Width and Lenght !");
                    }
                    
                }
                else if(I.getText()=="Circle"){
                    if(!t3.getText().isEmpty() && !t7.getText().isEmpty()){
                    Circle Container = new Circle(Integer.parseInt(t3.getText()));
                    Circle Inner = new Circle(Integer.parseInt(t7.getText()));
                    m=new ComposedShape(Container, Inner);
                    }
                }
                else{
                    message.setText("Please Select Shapes !"); 
                }
            }
            else{
                message.setText("Please Select Shapes !");  
            }
        }          
        });
        
        mainMap.setSize(400, 300);
        mainMap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        j.setLayout(null);
        draww.setBounds(150, 200, 100, 20);
        message.setBounds(100, 230, 300, 20);
        
        l3.setBounds(20,70,50,20);
        t.setBounds(70, 70, 100, 20);
        l4.setBounds(20,100,50,20);
        t1.setBounds(70, 100, 100, 20);
        l5.setBounds(20,130,50,20);
        t2.setBounds(70, 130, 100, 20);
        l6.setBounds(20,160,50,20);
        t3.setBounds(70, 160, 100, 20);
        
        l7.setBounds(220,70,50,20);
        t4.setBounds(270, 70, 100, 20);
        l8.setBounds(220,100,50,20);
        t5.setBounds(270, 100, 100, 20);
        l9.setBounds(220,130,50,20);
        t6.setBounds(270, 130, 100, 20);
        l10.setBounds(220,160,50,20);
        t7.setBounds(270, 160, 100, 20);
        
        l.setBounds(20,20,200,20);
        l2.setBounds(240,20,200,20);
        
        rect.setBounds(20, 40, 50, 20);
        tri.setBounds(70, 40, 50, 20);
        circ.setBounds(120, 40, 50, 20);
        
        rect2.setBounds(220, 40, 50, 20);
        tri2.setBounds(270, 40, 50, 20);
        circ2.setBounds(320, 40, 50, 20);
        
        j.add(draww);
        j.add(message);
        j.add(l3);
        j.add(l4);
        j.add(l5);
        j.add(l6);
        j.add(l7);
        j.add(l8);
        j.add(l9);
        j.add(l10);
        
        j.add(t);
        j.add(t1);
        j.add(t2);
        j.add(t3);
        j.add(t4);
        j.add(t5);
        j.add(t6);
        j.add(t7);
        j.add(l);
        j.add(l2);
        j.add(rect);
        j.add(tri);
        j.add(circ);   
        j.add(rect2);
        j.add(tri2);
        j.add(circ2);   
        j.setSize(400, 300);
        mainMap.setResizable(false);
        mainMap.add(j);
        mainMap.setVisible(true);
        
    }
    
}
