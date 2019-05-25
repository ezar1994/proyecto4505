/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logica;

import com.arbol.Arbol;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Esteban Arteaga
 */
public class AdminReporte4505 {
    private Arbol arbolPacientes; //Arbol AVL con la informacion de los pacientes
    public static final int ARCHIVO_RUAF = 1,
                            ARCHIVO_LABORATORIO = 2,
                            ARCHIVO_POMEROY = 3,
                            ARCHIVO_COLPOSCOPIA = 4,
                            ARCHIVO_MAMOGRFIA = 5,
                            ARCHIVO_JADEL = 6;
    public int consecutivo;

    public AdminReporte4505() {
        arbolPacientes = new Arbol();
        consecutivo = 0;
    }
    
    private int calcularEdad(String fecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fecha, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }
    
    public Paciente crearPaciente(String datos[]){
        Paciente p = new Paciente(Integer.parseInt(datos[1]));
        int edad = calcularEdad(datos[6]);
        
        p.getDatos()[0] = String.valueOf(++ consecutivo);
        p.getDatos()[1] = "130010033001";
        p.getDatos()[2] = datos[0];
        p.getDatos()[3] = datos[1];
        p.getDatos()[4] = datos[2];
        p.getDatos()[5] = datos[3];
        p.getDatos()[6] = datos[4];
        p.getDatos()[7] = datos[5];
        p.getDatos()[8] = datos[6];
        if(datos[7].equalsIgnoreCase("femenino"))
            p.getDatos()[9] = "F";
        else
            p.getDatos()[9] = "M";
        p.getDatos()[10] = "6"; 
        p.getDatos()[11] = "9999";
        p.getDatos()[12] = "13";
        if(edad < 10 || "M".equals(p.getDatos()[9])){
            p.getDatos()[13] = "0";
            p.getDatos()[52] = "1845-01-01";
            p.getDatos()[54] = "1845-01-01";
            p.getDatos()[53] = "0";
        }
        else{    
            p.getDatos()[13] = "21";
            p.getDatos()[52] = "1800-01-01";
            p.getDatos()[54] = "1800-01-01";
            p.getDatos()[53] = "21";
        }
        if(edad  > 0 && "M".equals(p.getDatos()[9]))
            p.getDatos()[14] = "0";
        else    
            p.getDatos()[14] = "21";
        
        if(edad  < 10 || "M".equals(p.getDatos()[9]))
            p.getDatos()[15] = "0";
        else    
            p.getDatos()[15] = "21";
        if(edad  > 2 )
            p.getDatos()[16] = "0";
        else    
            p.getDatos()[16] = "21";
        
        p.getDatos()[17] = "21";
        p.getDatos()[18] = "21";
        p.getDatos()[19] = "21";
        p.getDatos()[20] = "21";
        if(edad > 19 && "M".equals(p.getDatos()[9] ))
            p.getDatos()[21] = "0";
        else
            p.getDatos()[21] = "21";
        p.getDatos()[22] = "21";
        p.getDatos()[23] = "21";
        p.getDatos()[24] = "21";
        if("M".equals(p.getDatos()[9] ))
            p.getDatos()[25] = "0";
        else
            p.getDatos()[25] = "21";
        p.getDatos()[26] = "21";
        p.getDatos()[27] = "21";
        p.getDatos()[28] = "1800-01-01";
        p.getDatos()[29] = "999";
        p.getDatos()[30] = "1800-01-01";
        p.getDatos()[31] = "999";
        p.getDatos()[32] = "1845-01-01";

        if("M".equals(p.getDatos()[9] )){
            p.getDatos()[48] = "1845-01-01";
            p.getDatos()[49] = "1845-01-01";
            p.getDatos()[45] = "0";
            p.getDatos()[46] = "0";
        }
        else{
            p.getDatos()[48] = "1800-01-01";
            p.getDatos()[49] = "1800-01-01";
            p.getDatos()[45] = "22";
            p.getDatos()[46] = "22";
        }
        p.getDatos()[50] = "1845-01-01";
        if(edad > 5)
            p.getDatos()[33] = "0";
        else
            p.getDatos()[33] = "999";
        if(edad > 6)
            p.getDatos()[34] = "0";
        //else
            //p.getDatos()[34] = ;  por evaluar las validaciones
        p.getDatos()[35] = "0"; 
        if(edad > 2){
            p.getDatos()[36] = "0";
            p.getDatos()[42] = "0";
            p.getDatos()[43] = "0";
            p.getDatos()[47] = "0";
        }
        else{
            p.getDatos()[36] = "22";
            p.getDatos()[42] = "22";
            p.getDatos()[43] = "22";
            p.getDatos()[47] = "22";
        }
        if(edad > 6){
            p.getDatos()[37] = "0";
            p.getDatos()[38] = "0";
            p.getDatos()[44] = "0";
        }
        else{
            p.getDatos()[37] = "22";
            p.getDatos()[38] = "22";
            p.getDatos()[44] = "22";
        }
        p.getDatos()[39] = "0";
        if(edad > 3){
            p.getDatos()[40] = "0";
            p.getDatos()[41] = "0";
        }
        else{
             p.getDatos()[40] = "22";
             p.getDatos()[41] = "22";
        }
        p.getDatos()[51] = "1845-01-01";
        p.getDatos()[57] = "1845-01-01";
        p.getDatos()[55] = "1845-01-01";
        p.getDatos()[56] = "0";
        p.getDatos()[58] = "0";
        p.getDatos()[59] = "0";
        p.getDatos()[60] = "0";
        
        if(edad != 4 || edad != 11 || edad != 16 || edad != 45)
            p.getDatos()[61] = "1845-01-01";
        else
            p.getDatos()[61] = "1800-01-01";
        if(edad < 55	)
            p.getDatos()[62] = "1845-01-01";
        else
            p.getDatos()[62] = "1800-01-01";
        p.getDatos()[63] = "1845-01-01";
        p.getDatos()[64] = "1800-01-01";
        p.getDatos()[65] = "1800-01-01";
        p.getDatos()[66] = "1800-01-01";
        p.getDatos()[67] = "1800-01-01";
        
        if(edad > 10){
            p.getDatos()[68] = "1845-01-01";
            p.getDatos()[69] = "0";
            p.getDatos()[70] = "0";
        }
        else{
            p.getDatos()[68] = "1800-01-01";
            p.getDatos()[69] = "1800-01-01";
            p.getDatos()[70] = "20";
        }
        if(edad < 10 || edad > 29)
            p.getDatos()[71] = "1845-01-01";
        else
            p.getDatos()[71] = "1800-01-01";
        
        if(edad < 45)
            p.getDatos()[72] = "1845-01-01";
        else
            p.getDatos()[72] = "1800-01-01";
        p.getDatos()[73] = "0";
        p.getDatos()[74] = "1845-01-01";
        p.getDatos()[75] = "1845-01-01";
        p.getDatos()[76] = "0";
        p.getDatos()[78] = "0";
        p.getDatos()[77] = "1845-01-01";
        p.getDatos()[83] = "1845-01-01";
        p.getDatos()[84] = "0";
        p.getDatos()[79] = "1845-01-01";
        p.getDatos()[81] = "1845-01-01";
        p.getDatos()[80] = "0";
        p.getDatos()[82] = "0";
        if("M".equals(p.getDatos()[9])){
            p.getDatos()[85] = "0";
            p.getDatos()[87] = "0";
            p.getDatos()[88] = "0";
            p.getDatos()[86] = "1845-01-01";
        }
        else{
            p.getDatos()[85] = "22";
            p.getDatos()[87] = "999";
            p.getDatos()[88] = "999";
            p.getDatos()[86] = "1800-01-01";
        }
        p.getDatos()[89] = "999";
        p.getDatos()[90] = "1845-01-01";
        p.getDatos()[92] = "1845-01-01";
        p.getDatos()[95] = "1845-01-01";
        p.getDatos()[91] = "0";
        p.getDatos()[93] = "0";
        p.getDatos()[94] = "0";
        p.getDatos()[96] = "0";
        if(edad < 35){
            p.getDatos()[97] = "0";
        }
        else{
            p.getDatos()[97] = "999";
        }
        p.getDatos()[98] = "1845-01-01";
        p.getDatos()[99] = "1845-01-01";
        p.getDatos()[100] = "0";
        p.getDatos()[101] = "0";
        p.getDatos()[103] = "0";
        p.getDatos()[106] = "0";
        p.getDatos()[108] = "0";
        p.getDatos()[113] = "0";
        p.getDatos()[114] = "0";
        p.getDatos()[115] = "0";
        p.getDatos()[116] = "0";
        p.getDatos()[102] = "1800-01-01";
        p.getDatos()[104] = "1845-01-01";
        p.getDatos()[105] = "1845-01-01";
        p.getDatos()[107] = "1845-01-01";
        p.getDatos()[109] = "1845-01-01";
        p.getDatos()[110] = "1845-01-01";
        p.getDatos()[111] = "1845-01-01";
        p.getDatos()[112] = "22";
        p.getDatos()[113] = "0";
        p.getDatos()[114] = "0";
        p.getDatos()[115] = "0";
        p.getDatos()[116] = "0";
        p.getDatos()[117] = "1845-01-01";
        
        arbolPacientes.insertarNodo(p);
        
        return p;
    }
    
    public void validarPacienteColposcopia(String datos[]){
        Paciente p = (Paciente) arbolPacientes.buscarNodo(Integer.parseInt(datos[1])); //se busca si el paciente ya esta en la lista
        if(p == null) // en caso de que l pasiente aun no este registrado
            p = crearPaciente(datos);
        p.getDatos()[18] = "0";
        p.getDatos()[64] = "1845-01-01";
        p.getDatos()[65] = "1845-01-01";
        p.getDatos()[73] = "999";
        p.getDatos()[79] = "1800-01-01";
        p.getDatos()[95] = "1800-01-01";
        p.getDatos()[98] = "1800-01-01";
        p.getDatos()[99] = "1800-01-01";
        p.getDatos()[104] = "1800-01-01";
        p.getDatos()[111] = "1800-01-01";
        p.getDatos()[80] = "22";
        p.getDatos()[90] = datos[8];
        p.getDatos()[91] = "130010033001";
    }
    
    public void validarPacienteMamografia(String datos[]){
        Paciente p = (Paciente) arbolPacientes.buscarNodo(Integer.parseInt(datos[1])); //se busca si el paciente ya esta en la lista
        if(p == null) // en caso de que l pasiente aun no este registrado
            p = crearPaciente(datos);
        p.getDatos()[18] = "0";
        p.getDatos()[79] = "1800-01-01";
        p.getDatos()[81] = "1800-01-01";
        p.getDatos()[92] = "1800-01-01";
        p.getDatos()[104] = "1800-01-01";
        p.getDatos()[80] = "22";
        p.getDatos()[82] = "22";
        p.getDatos()[91] = "999";
        p.getDatos()[93] = "999";
        p.getDatos()[94] = "999";
        p.getDatos()[106] = "999";
        p.getDatos()[102] = "1845-01-01";
        p.getDatos()[95] = datos[9];
        /*    ¡¡¡¡ IMPORTANTE CAMPO 96 POR EVALUAR BIEN   !!!      */
    }
    
    public void validarPacientePomeroy(String datos[]){
        Paciente p = (Paciente) arbolPacientes.buscarNodo(Integer.parseInt(datos[1])); //se busca si el paciente ya esta en la lista
        if(p == null) // en caso de que l pasiente aun no este registrado
            p = crearPaciente(datos);
        p.getDatos()[53] = "13";
        p.getDatos()[54] = datos[9];
        p.getDatos()[14] =  p.getDatos()[19] =  p.getDatos()[20] = "3";
        p.getDatos()[15] =  p.getDatos()[16] =  p.getDatos()[17] 
                =  p.getDatos()[22] =  p.getDatos()[23] =  p.getDatos()[25] 
                =  p.getDatos()[26] =  p.getDatos()[27] = "2";
        p.getDatos()[18] = "0";
        p.getDatos()[24] = "7";
        p.getDatos()[64] = "1845-01-01";
        p.getDatos()[65] = "1845-01-01";
        p.getDatos()[66] = "1845-01-01";
        p.getDatos()[67] = "1845-01-01";
        p.getDatos()[102] = "1845-01-01";
        p.getDatos()[102] = "4";
    }
    
     public void validarPacienteJadel(String datos[]){
        Paciente p = (Paciente) arbolPacientes.buscarNodo(Integer.parseInt(datos[1])); //se busca si el paciente ya esta en la lista
        if(p == null) // en caso de que l pasiente aun no este registrado
            p = crearPaciente(datos);
        p.getDatos()[53] = "3";
        p.getDatos()[54] = datos[9];
        p.getDatos()[14] =  p.getDatos()[19] =  p.getDatos()[20] = "3";
        p.getDatos()[15] =  p.getDatos()[16] =  p.getDatos()[17] 
                =  p.getDatos()[22] =  p.getDatos()[23] =  p.getDatos()[25] 
                =  p.getDatos()[26] =  p.getDatos()[27] = "2";
        p.getDatos()[18] = "0";
        p.getDatos()[24] = "7";
        p.getDatos()[64] = "1845-01-01";
        p.getDatos()[65] = "1845-01-01";
        p.getDatos()[66] = "1845-01-01";
        p.getDatos()[67] = "1845-01-01";
        p.getDatos()[102] = "1845-01-01";
        p.getDatos()[102] = "4";
    }
}
