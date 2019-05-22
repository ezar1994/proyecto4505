/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arbol;

/**
 *
 * @author Esteban Arteaga
 */
public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }
    // Metodo utilizado para la insercion de un nuevo nodo al arbol
    public boolean insertarNodo(Nodo nuevoNodo){    //resibe el nevo nodo para insertar
        if(raiz == null)    //en caso de que el arbol este vacio agrege el primer nodo.
            raiz = nuevoNodo;
        else{
            Nodo aux = raiz; //nodo auxiliar para recorrer el arbol en forma ordenada
            Nodo padre = null;  //Nodo que va a captar la direccion del Nodo padre del nuevo nodo.
            while(aux != null){ //se recorre el arbol para buscar una posicion donde guradar el nuvo Nodo
                padre = aux;
                if(nuevoNodo.getId() > aux.getId()) 
                    aux = aux.getHijDer(); //se hace la busqueda por el lado izquierdo en caso de que el nuevo nodo sea menor
                else if(nuevoNodo.getId() < aux.getId())
                    aux = aux.getHijIzq(); //se hace la busqueda por el lado izquierdo en caso de que el nuevo nodo sea mayor
                else if(aux.getId() == nuevoNodo.getId())
                    return false;   //si encuentra un nodo igual se sale del metodo retorna false
            }
            nuevoNodo.setNodoPadre(padre);
            if(nuevoNodo.getId() < padre.getId())
                padre.setHijIzq(nuevoNodo); //se inserta el nodo en caso que sea menor que el padre
            else
                padre.setHijDer(nuevoNodo); //se inserta el nodo en caso que sea mayor que el padre
        }
        valancearArbol(raiz, null, true);
        return true;
    }
    
    
    //funcion qeu imprime por consola toda la informacion contenida en el arbol.
    public void imprimir(Nodo nodo){
        if(nodo == null)
            return;
        System.out.println(nodo.getId());
        imprimir(nodo.getHijIzq());
        imprimir(nodo.getHijDer());
    }
    
    // metodo que calcula la altura de un nodo
    public int getAlturaNodo(Nodo nodo){
        if(nodo == null)
            return 0;
        else if (getAlturaNodo(nodo.getHijDer()) > getAlturaNodo(nodo.getHijIzq()))
            return 1 + getAlturaNodo(nodo.getHijDer());
        else
            return 1 + getAlturaNodo(nodo.getHijIzq());
    }
    
    //metodo para calcular el factor de equlibrio
    public int getFactorEquilibrio(Nodo nodo){
        if(nodo == null)
            return 0;
        else
            return(getAlturaNodo(nodo.getHijIzq()) - getAlturaNodo(nodo.getHijDer())); 
    }
    
    public void valancearArbol(Nodo nodo, Nodo padre, boolean isHI){
        if(nodo == null)
            return;
        int factorEquilibrio = getFactorEquilibrio(nodo);
        
        if(factorEquilibrio < -1 ){
            if(nodo.getHijDer().getHijDer() != null){
                if(padre == null)
                    raiz = equilibrarDD(nodo);
                else if(isHI){
                    padre.setHijIzq(equilibrarDD(nodo));
                }
                else{
                    padre.setHijDer(equilibrarDD(nodo));
                }
            }
            else{
                if(padre == null)
                    raiz = equilibrarDI(nodo);
                else if(isHI){
                    padre.setHijIzq(equilibrarDI(nodo));
                }
                else{
                    padre.setHijDer(equilibrarDI(nodo));
                }
            }
        }
        else if(factorEquilibrio > 1){
            if(nodo.getHijIzq().getHijIzq() != null){
                if(padre == null)
                    raiz = equilibrarII(nodo);
                else if(isHI)
                    padre.setHijIzq(equilibrarII(nodo));
                else
                    padre.setHijDer(equilibrarII(nodo));
            }
            else{
                if(padre == null)
                    raiz = equilibrarID(nodo);
                else if(isHI)
                    padre.setHijIzq(equilibrarID(nodo));
                else
                    padre.setHijDer(equilibrarID(nodo));
            }
        }
        valancearArbol(nodo.getHijIzq(),nodo, true);
        valancearArbol(nodo.getHijDer(), nodo, false);
    }
    
    public Nodo equilibrarDD(Nodo n){
        Nodo n1 = n.getHijDer();
        n.setHijDer(n1.getHijIzq()); 
        n1.setHijIzq(n);
        return n1;
    }
    
    public Nodo equilibrarII(Nodo n){
        Nodo n1 = n.getHijIzq();
        n.setHijIzq(n1.getHijDer());
        n1.setHijDer(n);
        return n1;
    }
    
    public Nodo equilibrarID(Nodo n){
        Nodo n1 = n.getHijIzq(), n2 = n1.getHijDer();
        n1.setHijDer(n2.getHijIzq());
        n2.setHijIzq(n1);
        n.setHijIzq(n2.getHijDer());
        n2.setHijDer(n);
        return n2;
    }
    
    public Nodo equilibrarDI(Nodo n){
        Nodo n1 = n.getHijDer(), n2 = n1.getHijIzq();
        n1.setHijIzq(n2.getHijDer());
        n2.setHijDer(n1);
        n.setHijDer(n2.getHijIzq());
        n2.setHijIzq(n);
        return n2;
    }
}
