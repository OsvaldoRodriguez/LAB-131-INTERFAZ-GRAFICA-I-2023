
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class Pila implements Serializable {
    private int tope, max = 1000;
    private Object v[] = new Object[max + 1];
    
    Pila(){
        tope = 0;
    }
    
    boolean esVacia(){
        return tope == 0;
    }
    
    boolean esLlena(){
        return tope == max;
    }
    
    void adicionar(Object elem){
        if(! esLlena()){
            tope++;
            v[tope] = elem;
        }
    }
    
    void vaciar(Pila a){
        while(!a.esVacia())
            adicionar(a.eliminar());
    }
    
    void mostrar(){
        Pila aux = new Pila();
        while(!esVacia()){
            Empleado e = (Empleado)eliminar();
            e.mostrar();
            aux.adicionar(e);
        }
        vaciar(aux);
        
    }
    
    Object eliminar(){
        Object cur = null;
        if(!esVacia()){
            cur = v[tope];
            tope--;
        }
        return cur;
    }
}
