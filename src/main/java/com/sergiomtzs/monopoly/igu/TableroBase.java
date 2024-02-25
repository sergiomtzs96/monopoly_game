package com.sergiomtzs.monopoly.igu;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
     
/**
 *
 * @author Jero
 */
public class TableroBase {
   
    
    private JFrame frame;
    private JPanel panelMain;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private BoxLayout boxlayout;
    private int width;
    private int height;
    
    
    public TableroBase(int w, int h){
        frame = new JFrame();
        panelMain = new JPanel(new GridLayout(10, 10));
        width = w;
        height = h;
    }

    public void initGUI() {
       
        frame.setSize(width, height);
        frame.setTitle("Monopoly");
      
        for(int i = 0; i < 100; i++){
            JPanel subpanelX = new JPanel();
            
                switch(i){
                    case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                         10, 20, 30, 40, 50, 60, 70, 80, 90, 
                         91, 92, 93, 94, 95, 96, 97, 98, 99,
                         19, 29, 39, 49, 59, 69, 79, 89 -> {
                        subpanelX.setBackground(getRandomColor());
                    }
                    default -> subpanelX.setBackground(new java.awt.Color(255, 255, 255));
                   
                }
            
                System.out.println("iteracion: " + i + " color: "+subpanelX.getBackground());
            
            panelMain.add(subpanelX);
        }
       
        frame.add(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    
    //Para obtener el gris correspondiente a un valor dado un valor máximo (escala de grises)
    private int getScaleGreyInt(int maxInt, int currentInt){
        int color = (currentInt*255) / maxInt;
         System.out.println("getScaleGreyInt: color: "+color);
        return color;
    }
    
    //Para obtener color aleatorio
    private Color getRandomColor() {
        int R = getRandomNumber(0, 255);
        int G = getRandomNumber(0, 255);
        int B = getRandomNumber(0, 255);
        return new java.awt.Color(R, G, B);
    }
    
    public int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
}
    
    
    ArrayList<javax.swing.JPanel> listCasillas = new ArrayList<>();

    private JPanel getCasilla() {
        javax.swing.JPanel casilla = new javax.swing.JPanel();
            
            javax.swing.GroupLayout casillaLayout = new javax.swing.GroupLayout(casilla);
            casilla.setLayout(casillaLayout);
            casillaLayout.setHorizontalGroup(casillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            casillaLayout.setVerticalGroup(casillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            
            casilla.setBackground(new java.awt.Color(50, 255, 50));
            
            return casilla;
    }
    
}
