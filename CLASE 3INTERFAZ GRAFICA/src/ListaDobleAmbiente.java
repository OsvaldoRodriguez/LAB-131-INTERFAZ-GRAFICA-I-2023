
import java.io.Serializable;


public class ListaDobleAmbiente implements Serializable{
    private NodoLD p; // la raiz
    
    ListaDobleAmbiente(){
        p = null;
    }

    public NodoLD getP() {
        return p;
    }

    public void setP(NodoLD p) {
        this.p = p;
    }
    
    
    void adicionar(Ambiente a){

        NodoLD nuevo = new NodoLD();
        nuevo.setAmb(a);
        
        if(p == null){
            setP(nuevo);
        }else{
            NodoLD q = getP();
            while(q.getSig() != null){
                q = q.getSig();
            }
            
            q.setSig(nuevo);
            nuevo.setAnt(q);
        }
    }
    
    void mostrar(){
        NodoLD q = getP();
        while(q != null){
            q.getAmb().mostrar();
            q = q.getSig();
        }
    }
    
    
}
