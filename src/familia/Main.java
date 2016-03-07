package familia;
import java.util.*;

public class Main {
    
    Scanner sc = new Scanner(System.in);
    static HashMap<String, Familia> f = new HashMap<String, Familia>();
    
    public static void main(String[] args) {
         
        
        f.put("Martinez", new Familia("Martinez"));
        f.put("Gil", new Familia("Gil"));
        f.put("Vanegas", new Familia("Vanegas"));
        f.put("Roa", new Familia("Roa"));
        f.put("Mora_azul", new Familia("Mora_azul"));      
    }
    
    public void consultarFamilia(){
        System.out.print("Digite el apellido de la familia: ");
        Familia fam = f.get(sc.next());
        for (Familia fami : f.values()) {
            System.out.println(fami.getRol());
        }
        
    }
    
}
