import java.util.Scanner;
public class Aritmetica {
    
    public static void main (String [] args){
        int i;
        int j;
        int suma;
        int resta;
        int mult;
        int div;
        int mod;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        i = teclado.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        j = teclado.nextInt();
        
        suma = i+j;
        resta = i-j;
        mult = i*j;
        div = i/j;
        mod = i%j;
        
        System.out.println("El resultado de la suma es : "+suma); //Imprimimos el numero entero
        System.out.println("El resultado de la resta es : "+String.valueOf(resta)); //Lo convertimos a String y lo immprimos.
        System.out.println("El resultado de la multiplicacion es : "+String.valueOf(mult));
        System.out.println("El resultado de la division es : "+String.valueOf(div));
        System.out.println("El resultado del modulo es : "+String.valueOf(mod));
    }
}
