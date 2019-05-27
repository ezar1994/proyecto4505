
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

    public Nodo getRaiz() {
        return raiz;
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
                if(nuevoNodo.getId().compareTo(aux.getId()) > 0) 
                    aux = aux.getHijDer(); //se hace la busqueda por el lado izquierdo en caso de que el nuevo nodo sea menor
                else if(nuevoNodo.getId().compareTo(aux.getId()) < 0)
                    aux = aux.getHijIzq(); //se hace la busqueda por el lado izquierdo en caso de que el nuevo nodo sea mayor
                else if(aux.getId().equals(nuevoNodo.getId()))
                    return false;   //si encuentra un nodo igual se sale del metodo retorna false
            }
            nuevoNodo.setNodoPadre(padre);
            if(nuevoNodo.getId().compareTo(padre.getId()) < 0)
                padre.setHijIzq(nuevoNodo); //se inserta el nodo en caso que sea menor que el padre
            else
                padre.setHijDer(nuevoNodo); //se inserta el nodo en caso que sea mayor que el padre
        }
        valancearArbol(raiz, null, true);
        return true;
    }
    
    public void imprimir(Nodo nodo){
        if(nodo == null)
            return;
        
        System.out.println(nodo.toString());
        imprimir(nodo.getHijIzq());
        imprimir(nodo.getHijDer());
    }
    
    // Metodo para buscar un nodo por su id
    public Nodo buscarNodo(String id){
        Nodo aux = raiz;
        while(aux != null){
            if(aux.getId().compareTo(id) > 0) 
                    aux = aux.getHijDer(); //se hace la busqueda por el lado izquierdo en caso de que el nuevo nodo sea menor
            else if(aux.getId().compareTo(id) < 0)
                    aux = aux.getHijIzq(); //se hace la busqueda por el lado izquierdo en caso de que el nuevo nodo sea mayor
            else if(aux.getId().equals(id))
                return aux;
        }
        return null;
    }
    
    // metodo que calcula la altura de un nodo
    public int getAlturaNodo(Nodo nodo){
        if(nodo == null)
            return 0;
        else if (getAlturaNodo(nodo.getHijDer()) > getAlturaNodo(nodo.getHijIzq())) //se busca la rama mas larga del arbol
            return 1 + getAlturaNodo(nodo.getHijDer()); // se suma el numero de hojas de la rama
        else
            return 1 + getAlturaNodo(nodo.getHijIzq()); //se suma el numero de hojas de la rama
    }
    
    //metodo para calcular el factor de equlibrio
    public int getFactorEquilibrio(Nodo nodo){
        if(nodo == null) //en caso de se llegue al ultimo nodo
            return 0;
        else
            //para calcular la se resta la actura del subarbo izquierdo cib el sub arbol derecho
            return(getAlturaNodo(nodo.getHijIzq()) - getAlturaNodo(nodo.getHijDer()));  
    }
    
    /*******************metodo para valanciar el arbol**************************/
    public void valancearArbol(Nodo nodo, Nodo padre, boolean isHI){
        if(nodo == null)
            return;
        int factorEquilibrio = getFactorEquilibrio(nodo); // calcula el factor de equlibrio del nodo actual
        
        if(factorEquilibrio < -1 ){ // verifica si esta desequlibrado por el lado derecho
            if(nodo.getHijDer().getHijDer() != null){ //se hace la rotacion simpe derecha
                if(padre == null) // en caso de qu el nodo des quilibrado sea  la raiz 
                    raiz = equilibrarDD(nodo);
                else if(isHI){ // verifica de que lado insertar el nuevo sub arbol
                    padre.setHijIzq(equilibrarDD(nodo));
                }
                else{
                    padre.setHijDer(equilibrarDD(nodo));
                }
            }
            else{   //se hace la rotacion Derecha Izquierda
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
        else if(factorEquilibrio > 1){ // verifica si esta desequilibrado por el lado Izquierdo
            if(nodo.getHijIzq().getHijIzq() != null){ //se hace la rotacon simple izquierda
                if(padre == null)
                    raiz = equilibrarII(nodo);
                else if(isHI)
                    padre.setHijIzq(equilibrarII(nodo));
                else
                    padre.setHijDer(equilibrarII(nodo));
            }
            else{ // se hace la rotacion Izquiesda Derecha
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
    /*************************Fin del metodo************************************/
   
    /********************Metodos para hacer la rotaciones***********************/
     
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
    /**************************************************************************/
}
