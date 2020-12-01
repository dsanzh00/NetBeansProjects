package constructores;

/**
 *
 * @author Daniel Sanz (dsanzh00@estudiantes.unileon.es)
 */
public class Constructores {
    
    String nombre;
    String apellido;
    
    public Constructores(){
        System.out.println("Hola soy el constructor vacío 1");
    }

    public Constructores(int a, int b){
        int suma = a + b;
        System.out.println("La suma es "+suma);
    }
    
    public Constructores(String nom, String ape){
        this.nombre = nom;
        this.apellido = ape;
    }
    
    public Constructores(final Constructores objConstructor){
       nombre = objConstructor.nombre;
       apellido = objConstructor.apellido;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constructores obj = new Constructores();
        Constructores obj2 = new Constructores(5,6);
        Constructores obj3 = new Constructores("Daniel", "Sanz");
        Constructores obj4 = new Constructores(obj3);
        
        System.out.println("El nombre de obj4: "+obj4.nombre);
        System.out.println("El apellido de obj4: "+obj4.apellido);
    }
    
}
