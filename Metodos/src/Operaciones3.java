import java.util.Scanner;
        
public class Operaciones3 {        
    /**
     * Suma de los numeros
     * @param numero1
     * @param numero2
     * @return sumar
     */
    public int sumar(int numero1, int numero2){
       int sumar = numero1 + numero2;
       return sumar;
    }

    /**
     * Resta de los numeros
     * @param numero1
     * @param numero2
     * @return 
     */
    public int restar(int numero1, int numero2){
      int  restar = numero1 - numero2;
      return restar;
    } 
    
    /**
     * Multiplicacion de los numeros
     * @param numero1
     * @param numero2
     * @return
     */
     public int mult(int numero1, int numero2){
        int mult = numero1*numero2;
        return mult;
    }

       /**
     * Division de los numeros
     * @param numero1
     * @param numero2
     * @return
     */
     public int div(int numero1, int numero2){
       int  div = numero1/numero2;
       return div;
    }
     
     /**
     * Impresion de los resultados
     * @param suma
     * @param resta
     * @param mult
     * @param div
     */
    public void imprimirResultados(int suma, int resta, int mult, int div){
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La multiplicacion es : " + mult);
        System.out.println("La diviion es : " + div);
    }
     
     public static void main (String [] args){
         Scanner teclado = new Scanner(System.in);
         System.out.print("Introduce el primer numero: ");
         int n1 = teclado.nextInt();
         System.out.print("Introduce el segundo numero: ");
         int n2 = teclado.nextInt();
         
         Operaciones3 op = new Operaciones3();
         int suma = op.sumar(n1, n2);
         int resta = op.restar(n1, n2);
         int mult = op.mult(n1, n2);
         int div = op.div(n1, n2);
         
         op.imprimirResultados(suma, resta, mult, div);
     }
}
