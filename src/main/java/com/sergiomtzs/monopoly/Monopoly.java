/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sergiomtzs.monopoly;

import com.sergiomtzs.monopoly.data.BaseCasilla;
import com.sergiomtzs.monopoly.data.CasillaSpecial;
import com.sergiomtzs.monopoly.igu.Tablero;

import java.util.ArrayList;

import static com.sergiomtzs.monopoly.data.Special.START;
import com.sergiomtzs.monopoly.igu.AutoTablero;
import com.sergiomtzs.monopoly.igu.Registro;
import com.sergiomtzs.monopoly.igu.TableroBase;


/**
 *
 * @author Sergio
 */
public class Monopoly {

    
    private static ArrayList<BaseCasilla> arrayListCasillas = new ArrayList<BaseCasilla>();
    
    public static void main(String[] args) {
        generateBoard();
        
    }

    private static void generateBoard() {
        CasillaSpecial casillaSpecial = new CasillaSpecial();
        casillaSpecial.setSpecial(START);
        arrayListCasillas.add(casillaSpecial);
        //Registro registro = new Registro();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroBase().setVisible(true);
                //new AutoTablero().setVisible(true);
            }
        });
      
    }
}

