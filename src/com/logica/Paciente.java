/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logica;

import com.arbol.Nodo;

/**
 *
 * @author Esteban Arteaga
 */
public class Paciente extends Nodo {
    
    private String[] datos;

    public Paciente(int id) {
        super(id);
        datos = new String[118];
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
