import java.util.Scanner;
        
public class Operaciones2 {
    int numero1;
    int numero2;
    int sumar;
    int restar;
    int mult;
    int div;
    
    
    /**
     * Lectura de los numeros
     */
    /*public void leerNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero2 = teclado.nextInt();
    }*/
        
    /**
     * Suma de los numeros
     */
    public void sumar(int numero1, int numero2){
        sumar = numero1 + numero2;
    }

    /**
     * Resta de los numeros
     */
    public void restar(int numero1, int numero2){
        restar = numero1 - numero2;
    } 
    
    /**
     * Multiplicacion de los numeros
     */
     public void mult(int numero1, int numero2){
        mult = numero1*numero2;
    }

       /**
     * Division de los numeros
     */
     public void div(int numero1, int numero2){
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
         Scanner teclado = new Scanner(System.in);
         System.out.print("Introduce el primer numero: ");
         int n1 = teclado.nextInt();
         System.out.print("Introduce el segundo numero: ");
         int n2 = teclado.nextInt();
         
         Operaciones2 op = new Operaciones2();
         op.sumar(n1, n2);
         op.restar(n1, n2);
         op.mult(n1, n2);
         op.div(n1, n2);
         
         op.imprimirResultados();
     }

}
