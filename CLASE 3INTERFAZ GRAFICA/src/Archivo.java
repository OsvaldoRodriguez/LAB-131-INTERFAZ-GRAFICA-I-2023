
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Archivo implements Serializable     {
    private String nomArch;
    
    Archivo(String nomArch){
        this.nomArch = nomArch;
    }
    
    public void crear() throws FileNotFoundException, IOException{
        ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nomArch) );
    }
}
