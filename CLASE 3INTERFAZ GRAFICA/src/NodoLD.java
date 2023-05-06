
import java.io.Serializable;

public class NodoLD implements Serializable{
    private Ambiente amb = new Ambiente(); // pueden ponerlo object
    private NodoLD sig, ant;
    
    NodoLD(){
        sig = ant = null;
    }

    public Ambiente getAmb() {
        return amb;
    }

    public void setAmb(Ambiente amb) {
        this.amb = amb;
    }

    public NodoLD getSig() {
        return sig;
    }

    public void setSig(NodoLD sig) {
        this.sig = sig;
    }

    public NodoLD getAnt() {
        return ant;
    }

    public void setAnt(NodoLD ant) {
        this.ant = ant;
    }
    
    
}
