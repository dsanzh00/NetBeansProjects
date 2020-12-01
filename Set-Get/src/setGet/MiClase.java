package setGet;

/**
 *
 * @author Daniel Sanz (dsanzh00@estudiantes.unileon.es)
 */
public class MiClase {
    private int tipo;
    private int edad;
    private double altura;
    
    public void setTipo(int t){
        this.tipo = t;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setEdad(int e){
        this.edad = e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setAltura(double alt){
        this.altura = alt;
    }
    
    public double getAltura(){
        return altura;
    }
 }
   
    
    class AccesoIndirecto{
       public static void main (String [] args){
        MiClase mc = new MiClase();
        mc.setTipo(4);
        mc.setEdad(21);
        mc.setAltura(1.73);
        
        System.out.println("El tipo es: " + mc.getTipo());
        System.out.println("La edad es: " + mc.getEdad());
        System.out.println("La altura es: " + mc.getAltura());

        } 
    }
    
