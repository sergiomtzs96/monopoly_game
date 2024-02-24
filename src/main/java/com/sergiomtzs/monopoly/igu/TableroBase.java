package com.sergiomtzs.monopoly.igu;

import java.util.ArrayList;

/**
 *
 * @author Jero
 */
public class TableroBase extends javax.swing.JFrame {
    
    public TableroBase(){
        iniciar();
    }

    private void iniciar() {
       
     
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         
         ArrayList<javax.swing.JPanel> listCasillas = new ArrayList<>();
                
        for(int i = 0; i <= 10; i++){
            
            javax.swing.JPanel casilla = new javax.swing.JPanel();
            
            casilla.setBackground(new java.awt.Color(50, 255, 50));
            
            javax.swing.GroupLayout casillaLayout = new javax.swing.GroupLayout(casilla);
            casilla.setLayout(casillaLayout);
            casillaLayout.setHorizontalGroup(casillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            casillaLayout.setVerticalGroup(casillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
                 
            listCasillas.add(casilla);
        }
         
    
         
         
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        
        int a = 0;
        
        for(javax.swing.JPanel panel: listCasillas){
            layout.addLayoutComponent("casilla"+a, panel);
            a++;
        } 
       

        pack();
    }
    
    
}
