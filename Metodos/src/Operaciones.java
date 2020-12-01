import java.util.Scanner;
        
public class Operaciones {
    int numero1;
    int numero2;
    int sumar;
    int restar;
    int mult;
    int div;
    
    
    /**
     * Lectura de los numeros
     */
    public void leerNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = teclado.nextInt();
    }
        
    /**
     * Suma de los numeros
     */
    public void sumar(){
        sumar = numero1 + numero2;
    }

    /**
     * Resta de los numeros
     */
    public void restar(){
        restar = numero1 - numero2;
    } 
    
    /**
     * Multiplicacion de los numeros
     */
     public void mult(){
        mult = numero1*numero2;
    }

       /**
     * Division de los numeros
     */
     public void div(){
        div = numero1/numero2;
    }
     
     /**
     * Impresion de los resultados
     */
     public void imprimirResultados(){
        System.out.println("El resultado de la suma es : " + sumar);
        System.out.println("El resultado de la resta es : " + restar);
        System.out.println("El resultado de la multiplicacion es : " + mult);
        System.out.println("El resultado de la diviion es : " + div);
    }
     
     public static void main (String [] args){
         Operaciones objeto1 = new Operaciones();
         
         objeto1.leerNumeros();
         objeto1.sumar();
         objeto1.restar();
         objeto1.mult();
         objeto1.div();
         objeto1.imprimirResultados();
     }
}
        