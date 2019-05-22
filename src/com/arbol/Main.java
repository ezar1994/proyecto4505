/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arbol;

import com.logica.Paciente;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Esteban Arteaga
 */
public class Main extends JFrame {
    private Dibujo dibujo;
    private JButton btnAgregarNodo;
    private JTextField txtInfo;
    private Arbol arbol;
    private class Dibujo extends JPanel{
        
        private void dibujarArbol(Graphics g, Nodo n, int x, int y){
            if(n == null)
                return;
            g.setColor(Color.black);
            g.drawString(String.valueOf(n.getId()), x, y);
            dibujarArbol(g, n.getHijIzq(), (int) (x - (5 * Math.pow(arbol.getAlturaNodo(n),2))), y + 30);
            dibujarArbol(g, n.getHijDer(), (int) (x + (5 * Math.pow(arbol.getAlturaNodo(n),2))), y + 30);
        }
     
        public void paint(Graphics g){
            super.paint(g);
            dibujarArbol(g,arbol.raiz , 325, 20);
        }
        
    }

    public Main() {
        
        arbol = new Arbol();
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        dibujo = new Dibujo();
        dibujo.setBounds(10,150,660, 300);
        dibujo.setBackground(Color.WHITE);
        add(dibujo);
        
        btnAgregarNodo = new JButton("Agregar");
        btnAgregarNodo.setBounds(10, 50, 90, 25);
        btnAgregarNodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAgregarNodoClick(e);
            }
        });
        add(btnAgregarNodo);
        
        txtInfo = new JTextField();
        txtInfo.setBounds(10, 10, 50, 25);
        add(txtInfo);
    }
     
    public void btnAgregarNodoClick(ActionEvent e){
        arbol.insertarNodo(new Paciente(Integer.parseInt(txtInfo.getText())));
        txtInfo.setText("");
        dibujo.repaint();
    }
    
    public static void main(String Args[]){
        Main d = new Main();
        d.setVisible(true);
        d.setBounds(0, 0, 700, 500);
    }
}
